package com.chiranjeet.order_service.presistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chiranjeet.order_service.bean.Orders;

public interface OrderDao extends JpaRepository<Orders, Long> {

}
