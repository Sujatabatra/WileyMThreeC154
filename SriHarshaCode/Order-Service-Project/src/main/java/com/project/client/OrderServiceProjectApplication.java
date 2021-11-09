package com.project.client;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.project.bean.Order;
import com.project.bean.OrderItem;
import com.project.persistence.OrderDao;
import com.project.persistence.OrderItemDao;

@SpringBootApplication(scanBasePackages = "com.project")
@EntityScan(basePackages = "com.project.bean")
@EnableJpaRepositories(basePackages = "com.project.persistence")
public class OrderServiceProjectApplication {// implements CommandLineRunner {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private OrderItemDao orderItemDao;
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceProjectApplication.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Order o1 = new Order(1,"FIRST", "ADDRESS-FIRST");
//		Order o2 = new Order(2,"SECOND", "ADDRESS-SECOND");
////		Order o3 = new Order(3,"THIRD", "ADDRESS-THIRD");
////		Order o4 = new Order(4,"FOURTH", "ADDRESS-FOURTH");
//		
//		OrderItem t1 = new OrderItem(1,1,3,new BigDecimal("100.00"));
//		OrderItem t2 = new OrderItem(2,2,5,new BigDecimal("200.00"));
//		OrderItem t3 = new OrderItem(3,1,6,new BigDecimal("300.00"));
//		OrderItem t4 = new OrderItem(4,2,8,new BigDecimal("400.00"));
//		
//		o1.getItems().add(t1);
//		o1.getItems().add(t2);
//		o1.getItems().add(t4);
//		
//		o2.getItems().add(t3);
//		
//		orderDao.save(o1);
//		orderDao.save(o2);
//		
//		orderItemDao.save(t1);
//		orderItemDao.save(t2);
//		orderItemDao.save(t3);
//		orderItemDao.save(t4);
//	}

}
