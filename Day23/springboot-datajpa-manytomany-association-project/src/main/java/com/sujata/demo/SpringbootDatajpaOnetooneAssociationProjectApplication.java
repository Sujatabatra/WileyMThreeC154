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

		Trainer t1 = new Trainer("T001", "Sujata");
		Trainer t2 = new Trainer("T002", "Batra");

		Student s1 = new Student("R001", "AAAA");
		Student s2 = new Student("R002", "BBBB");
		Student s3 = new Student("R003", "CCCC");
		Student s4 = new Student("R004", "DDDD");
		Student s5 = new Student("R005", "EEEE");
		Student s6 = new Student("R006", "FFFF");

		s1.getTrainers().add(t1);
		s1.getTrainers().add(t2);

		s2.getTrainers().add(t1);

		s3.getTrainers().add(t1);

		s4.getTrainers().add(t2);

		s5.getTrainers().add(t2);

		s6.getTrainers().add(t1);
		s6.getTrainers().add(t2);

		trainerDao.save(t1);
		trainerDao.save(t2);
		
		studentDao.save(s1);
		studentDao.save(s2);
		studentDao.save(s3);
		studentDao.save(s4);
		studentDao.save(s5);
		studentDao.save(s6);

		
	}

}
