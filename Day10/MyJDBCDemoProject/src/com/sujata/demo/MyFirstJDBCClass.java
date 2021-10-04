package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		try {
			//1. Connect
			//1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
			
			//2.Query
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("SELECT * FROM EMP");
			
			//3.Process Result
			while(resultSet.next()) {
				int empId=resultSet.getInt("ID");
				String na=resultSet.getString("NAME");
				String deptt=resultSet.getString("DEPARTMENT");
				String desig=resultSet.getString("DESIGNATION");
				int sal=resultSet.getInt("SALARY");
				System.out.println(empId+"  "+na+"  "+deptt+"  "+desig+"  "+sal);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
