package com.project.service;

import java.util.List;

import com.project.bean.Order;
import com.project.bean.OrderList;

public interface OrderService {

	public List<Order> getOrdersById(long id);

	public Order saveOrderDetails(Order order);
}
