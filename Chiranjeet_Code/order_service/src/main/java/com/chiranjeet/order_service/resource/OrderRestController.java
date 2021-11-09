package com.chiranjeet.order_service.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chiranjeet.order_service.bean.Orders;
import com.chiranjeet.order_service.exception.OrderNotFound;
import com.chiranjeet.order_service.service.OrderService;

@RestController
public class OrderRestController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping(path = "/orders/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orders> getInventoryItemByProductCode (@PathVariable Long id)  {
		Optional<Orders>  order = orderService.findOrder(id);
		if(order.isEmpty())
			throw new OrderNotFound("No Order Available With ID"+id);
		
		return new ResponseEntity<Orders>(order.get(), HttpStatus.FOUND);
	}
	
	@PostMapping(path = "/orders",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateInventoryItemQuantityByProductCode(@RequestBody Orders order){
		System.out.println("In Order rest Service");
		Orders  saved_order = orderService.createOrder(order);
		if(saved_order == null) {
			throw new OrderNotFound("Can't Save Order");
		}
		return new ResponseEntity<String>("Order Saved", HttpStatus.ACCEPTED);
	}
}
