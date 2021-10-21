package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootDatajpaDemoProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee(101, "AAAA", "Associate", "IT", 35000);
		employeeDao.save(employee);
		
	}

}
