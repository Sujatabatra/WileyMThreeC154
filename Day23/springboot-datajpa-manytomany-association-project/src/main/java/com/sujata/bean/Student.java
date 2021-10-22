package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
public class Student {

	@Setter
	@Getter
	@Id
	private String rollNo;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	@ManyToMany
	private List<Trainer> trainers=new ArrayList<>();
	
	public Student(String rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
}
