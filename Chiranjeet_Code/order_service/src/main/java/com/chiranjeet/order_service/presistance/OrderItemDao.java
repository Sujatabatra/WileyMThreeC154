package com.chiranjeet.order_service.presistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chiranjeet.order_service.bean.OrderItem;

public interface OrderItemDao extends JpaRepository<OrderItem, Long> {

}
