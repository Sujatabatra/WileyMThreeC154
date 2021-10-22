package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	@ManyToOne
	private Trainer trainer;
	public Student(String rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
}
