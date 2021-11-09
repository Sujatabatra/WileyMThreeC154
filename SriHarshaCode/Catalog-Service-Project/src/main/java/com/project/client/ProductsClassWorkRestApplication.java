package com.project.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project")
public class ProductsClassWorkRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsClassWorkRestApplication.class, args);
	}

}
