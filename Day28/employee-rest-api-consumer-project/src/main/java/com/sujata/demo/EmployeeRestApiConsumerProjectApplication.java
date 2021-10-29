package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Employee;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class EmployeeRestApiConsumerProjectApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApiConsumerProjectApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter Employee ID : ");
//		int id=scanner.nextInt();
//		Employee emp=restTemplate.getForObject("http://localhost:8085/employees/"+id, Employee.class);
//		System.out.println(emp);
//		
//	}

}
