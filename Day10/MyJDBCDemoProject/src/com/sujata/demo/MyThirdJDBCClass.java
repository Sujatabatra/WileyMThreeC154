package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyThirdJDBCClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement;
//		Statement statement=null;
		Scanner scanner=new Scanner(System.in);
		try {
			//1. Connect
			//1.1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		
			System.out.println("Enter Employee id : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String na=scanner.next();
			System.out.println("Enter Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Designation : ");
			String desig=scanner.next();
			System.out.println("Enter salary : ");
			int sal=scanner.nextInt();
			
			//2.Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMP(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES(?,?,?,?,?)");
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, na);
			preparedStatement.setString(3, deptt);
			preparedStatement.setString(4, desig);
			preparedStatement.setInt(5, sal);
			
			int rows=preparedStatement.executeUpdate();
			
//			statement=connection.createStatement();
//			int rows=statement.executeUpdate("INSERT INTO EMP(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES("+id+",'"+na+"','"+deptt+"','"+desig+"',"+sal+")");
			
			//3.Process Result
			if(rows>0)
				System.out.println("Employee added succesfully!");
			else
				System.out.println("Employee added failed!");
			
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
