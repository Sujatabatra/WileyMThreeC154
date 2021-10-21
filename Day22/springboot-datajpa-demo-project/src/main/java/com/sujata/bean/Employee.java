package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Setter
	@Getter
	@Id
	private int empId;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private String designation;
	@Setter
	@Getter
	private String department;
	@Setter
	@Getter
	private double salary;
	
}
