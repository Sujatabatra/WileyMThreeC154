package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Student;
import com.sujata.bean.Trainer;
import com.sujata.persistence.StudentDao;
import com.sujata.persistence.TrainerDao;


@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootDatajpaOnetooneAssociationProjectApplication implements CommandLineRunner {

	@Autowired
	private TrainerDao trainerDao;
	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaOnetooneAssociationProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Trainer t1=new Trainer("T001","Sujata");
		Trainer t2=new Trainer("T002","Batra");
		
		Student s1=new Student("R001", "AAAA");
		Student s2=new Student("R002", "BBBB");
		Student s3=new Student("R003", "CCCC");
		Student s4=new Student("R004", "DDDD");
		Student s5=new Student("R005", "EEEE");
		Student s6=new Student("R006", "FFFF");
		
		
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		t1.getStudents().add(s3);
		t1.getStudents().add(s6);
		
		t2.getStudents().add(s4);
		t2.getStudents().add(s5);
		
	
		
		studentDao.save(s1);
		studentDao.save(s2);
		studentDao.save(s3);
		studentDao.save(s4);
		studentDao.save(s5);
		studentDao.save(s6);
		
		trainerDao.save(t1);
		trainerDao.save(t2);
	}

}
