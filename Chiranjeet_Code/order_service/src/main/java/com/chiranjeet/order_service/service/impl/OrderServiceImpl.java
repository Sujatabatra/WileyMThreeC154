package com.chiranjeet.order_service.service.impl;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chiranjeet.order_service.bean.InventoryItem;
import com.chiranjeet.order_service.bean.OrderItem;
import com.chiranjeet.order_service.bean.Orders;
import com.chiranjeet.order_service.bean.Product;
import com.chiranjeet.order_service.exception.OrderNotFound;
import com.chiranjeet.order_service.presistance.OrderDao;
import com.chiranjeet.order_service.presistance.OrderItemDao;
import com.chiranjeet.order_service.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private OrderItemDao orderItemDao;
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Orders createOrder(Orders order) {
		Set<OrderItem> order_item_list = order.getItems();
		
		for(OrderItem order_item : order_item_list) {
			Product product = getProduct(order_item.getProductId());
			order_item.setProductPrice(BigDecimal.valueOf(product.getPrice()));
			order_item.setOrderId(order.getId());
			InventoryItem inventory_item = getInventoryItem(product.getCode());
			if(inventory_item.getAvailableQuantity() < order_item.getQuantity())
				throw new OrderNotFound("Inventory Limit Exceeded");
			else
				updateInventoryItem(product.getCode(), inventory_item.getAvailableQuantity() - order_item.getQuantity());
		}
		Orders orders = orderDao.save(order);
		order_item_list.forEach(order_item -> orderItemDao.save(order_item));
		return orders;
	}

	@Override
	public Optional<Orders> findOrder(Long id) {
		return orderDao.findById(id);
	}
	
	private Product getProduct(Long product_id) {
		Product product = null;
		product = restTemplate.getForObject("http://localhost:8081/products/id/"+product_id, Product.class);
		return product;
	}
	
	private InventoryItem getInventoryItem(String product_code) {
		InventoryItem inventory_item = null;
		inventory_item = restTemplate.getForObject("http://localhost:8082/code/"+product_code, InventoryItem.class);
		return inventory_item;
	}
	
	private int updateInventoryItem(String product_code,int available_quantity) {
		System.out.println("In update inventory of order service");
		restTemplate.put(
				"http://localhost:8082/code/"+product_code+"/"+available_quantity,null,Integer.class);
		
		System.out.println("After ...............");
		return 1;
	}
	

}
