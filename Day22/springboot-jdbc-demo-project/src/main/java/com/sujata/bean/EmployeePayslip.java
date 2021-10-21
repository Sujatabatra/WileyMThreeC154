package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayslip {

	@Setter
	@Getter
	Employee employee;
	@Setter
	@Getter
	double hra;
	@Setter
	@Getter
	double pf;
	@Setter
	@Getter
	double da;
	@Setter
	@Getter
	double totalSalary;
	
}
