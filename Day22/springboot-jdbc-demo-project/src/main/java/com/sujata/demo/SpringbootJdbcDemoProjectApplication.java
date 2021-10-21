package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringbootJdbcDemoProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeePresentation employeePresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
			
		}
		
	}
	
	
//	@Bean
//	public DriverManagerDataSource dataSource() {
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc112");
//		ds.setUsername("root");
//		ds.setPassword("sujata");
//		return ds;
//	}
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate(dataSource());
//	}
	

}
