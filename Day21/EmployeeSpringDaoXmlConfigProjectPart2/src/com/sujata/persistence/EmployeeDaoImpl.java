package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ArrayList<Employee> getAllRecords(){
		String query="SELECT * FROM EMP";
		List<Employee> employees=jdbcTemplate.query(query, new EmployeeRowMapper());
		return (ArrayList<Employee>)employees;
	}

	@Override
	public boolean insertData(Employee employee){
		String query = "INSERT INTO EMP values(?,?,?,?,?)";

		int rows = jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDepartment(),
				employee.getEmpDesignation(), employee.getEmpSalary());
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteData(int empId){

		String query = "DELETE FROM EMP WHERE ID=?";

		int rows = jdbcTemplate.update(query, empId);
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary){

		String query = "UPDATE EMP SET SALARY=? WHERE ID=?";
		int rows = jdbcTemplate.update(query, salary, empId);
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public Employee searchRecord(int empId){
		String query="SELECT * FROM EMP where ID=?";
		Employee employee=jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), empId);
		return employee;
		
	}

}
