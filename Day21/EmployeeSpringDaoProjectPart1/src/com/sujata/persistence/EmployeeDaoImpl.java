package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private DataSource dataSource;
	@Override
	public ArrayList<Employee> getAllRecords()throws SQLException{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP");
		ResultSet resultSet=preparedStatement.executeQuery();
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		//3.Process Result
		while(resultSet.next()) {
			int empId=resultSet.getInt("ID");
			String na=resultSet.getString("NAME");
			String deptt=resultSet.getString("DEPARTMENT");
			String desig=resultSet.getString("DESIGNATION");
			int sal=resultSet.getInt("SALARY");
			Employee employee=new Employee(empId, na, deptt, desig, sal);
			employees.add(employee);
		}
		connection.close();
		return employees;
	}

	@Override
	public boolean insertData(Employee employee) throws SQLException{
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMP values(?,?,?,?,?)");
		
		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDepartment());
		preparedStatement.setString(4, employee.getEmpDesignation());
		preparedStatement.setInt(5, employee.getEmpSalary());
		
		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteData(int empId)throws SQLException {
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMP WHERE ID=?");
		
		preparedStatement.setInt(1, empId);

		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws SQLException{
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMP SET SALARY=? WHERE ID=?");
		
		preparedStatement.setInt(1, salary);
		preparedStatement.setInt(2, empId);

		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public Employee searchRecord(int empId) throws SQLException{
		Connection connection=dataSource.getConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP where ID=?");
		preparedStatement.setInt(1, empId);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		Employee employee=null;
		while(resultSet.next()) {
			int id=resultSet.getInt("ID");
			String na=resultSet.getString("NAME");
			String deptt=resultSet.getString("DEPARTMENT");
			String desig=resultSet.getString("DESIGNATION");
			int sal=resultSet.getInt("SALARY");
			employee=new Employee(id, na, deptt, desig, sal);
			
		}
		connection.close();
		return employee;
	}

}
