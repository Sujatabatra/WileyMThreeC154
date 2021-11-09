package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Order;
import com.project.bean.OrderItem;
import com.project.bean.OrderList;
import com.project.exceptions.OrderNotFoundException;
import com.project.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(path = "/orders/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getEmployeeByIdResource(@PathVariable("id") long id) {
		List<Order> orders= orderService.getOrdersById(id);
		System.out.println(orders);
		if(orders.isEmpty())
			throw new OrderNotFoundException("Order not found with id "+id);

		OrderList ord = new OrderList(orders);
        return ResponseEntity.status(HttpStatus.OK).body(ord);
	}
	
	@PostMapping(path = "/orders",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> insertEmployeeResource(@RequestBody Order order) {	
		Order order2 = orderService.saveOrderDetails(order);
		if(order2==null)
			throw new OrderNotFoundException("Order not saved");
		return new ResponseEntity<>(order, HttpStatus.CREATED);
	}
	
}
