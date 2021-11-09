package com.chiranjeet.order_service.service;

import java.util.Optional;

import com.chiranjeet.order_service.bean.Orders;

public interface OrderService {
	Orders createOrder(Orders order);
	Optional<Orders> findOrder(Long id);
}
