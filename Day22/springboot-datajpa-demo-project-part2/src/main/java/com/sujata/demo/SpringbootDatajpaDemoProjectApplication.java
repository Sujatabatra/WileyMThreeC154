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
		Employee employee1=new Employee("AAAA", "Associate", "IT", 35000);
		Employee employee2=new Employee("BBBB", "Manager", "Sales", 145000);
		Employee employee3=new Employee("CCCC", "Sr. Associate", "IT", 68000);
		Employee employee4=new Employee("DDDD", "Executive", "HR", 25000);
		employeeDao.save(employee1);
		employeeDao.save(employee2);
		employeeDao.save(employee3);
		employeeDao.save(employee4);
		
	}

}
