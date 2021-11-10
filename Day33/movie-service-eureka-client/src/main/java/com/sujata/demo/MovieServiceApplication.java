package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Movie;
import com.sujata.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EnableEurekaClient
public class MovieServiceApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	private MovieDao movieDao;
	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		movieDao.save(new Movie("M001","Bahubali"));
//		movieDao.save(new Movie("M002", "RRR"));
//		movieDao.save(new Movie("M003", "Titanic"));
//		movieDao.save(new Movie("M004", "Tenant"));
//		movieDao.save(new Movie("M005", "Inception"));
//		
//	}

}
