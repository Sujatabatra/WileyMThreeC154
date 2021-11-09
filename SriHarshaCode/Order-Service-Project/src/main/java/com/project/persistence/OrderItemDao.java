package com.project.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.bean.Order;
import com.project.bean.OrderItem;

@Repository
public interface OrderItemDao  extends JpaRepository<OrderItem, Long> {

	@Query(value="select max(id) from OrderItem")
	public int getMaxId();

}
