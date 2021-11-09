package com.project.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.bean.Order;
import com.project.bean.OrderList;

@Repository
public interface OrderDao  extends JpaRepository<Order, Long> {

	@Query("SELECT c from Order c where id=:cid")
	public Order getOrderById(@Param("cid")long id);

	@Query(value="select max(id) from Order")
	public int getMaxId();

}
