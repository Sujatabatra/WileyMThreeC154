package com.sujata.producer;

public class EmployeeDao {

	private Connection connection;
	
	public EmployeeDao(Connection connection) {
		super();
		this.connection = connection;
	}

	public void getConnected() {
		connection.connect();
	}
}
