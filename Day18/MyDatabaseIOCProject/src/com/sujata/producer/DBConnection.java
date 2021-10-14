package com.sujata.producer;

public class DBConnection implements Connection {

	private String url;
	private String username;
	private String password;
	

	public DBConnection() {
		
	}
	public DBConnection(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public void connect() {
		System.out.println("Connecting to database using "+url+" URL with username"+username+" and password "+password);

	}

}
