package com.project.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.bean.InventoryItem;
import com.project.bean.Order;
import com.project.bean.OrderItem;
import com.project.bean.OrderList;
import com.project.bean.Product;
import com.project.exceptions.ProductNotFoundException;
import com.project.exceptions.QuantityNotFoundException;
import com.project.persistence.OrderDao;
import com.project.persistence.OrderItemDao;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private OrderItemDao orderItemDao;
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@Override
	public List<Order> getOrdersById(long id) {
		
		List<Order> orders= orderDao.findAll();
		ArrayList<Order> ord = new ArrayList<>();
		for(Order order:orders) {
			if(order.getId()==id)
				ord.add(order);
		}
		return ord;
	}

	@Override
	public Order saveOrderDetails(Order order) {
		List<OrderItem> items = order.getItems();

		//int orderId = orderDao.getMaxId();
		int id = orderItemDao.getMaxId();
		for(OrderItem item: items) {
			Product product= RestTemplate.getForObject("http://localhost:8080/products/"+item.getProductId(), Product.class);
			if(item.getQuantity()<=0)
				throw new ProductNotFoundException("Quantity should not be negative for product "+item.getProductId());
			InventoryItem inventory =  RestTemplate.getForObject("http://localhost:8081/code/"+product.getCode(), InventoryItem.class);
			if(inventory.getAvailableQuantity()<item.getQuantity())
				throw new QuantityNotFoundException("Entered quantity for product "+item.getProductId()+" is not available");
			int a =inventory.getAvailableQuantity()-item.getQuantity();
			RestTemplate.put("http://localhost:8081/code/"+product.getCode()+"/"+a, InventoryItem.class);			
			item.setId(++id);
			item.setProductPrice(new BigDecimal(product.getPrice()));
			OrderItem ii= orderItemDao.save(item);
			if(ii==null)
				throw new ProductNotFoundException("Not Saved for some error");
		}
		//order.setId(++orderId);
		Order ord=orderDao.save(order);
		
		if(ord!=null)
			return ord;
		return null;
		
	}

}
