package com.sujata.database;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

	private static Map<String, String> users=new HashMap();
	static {
		users.put("sujata", "batra");
		users.put("admin", "admin123");
		users.put("user", "user123");
	}
	
	public static Map<String, String> getUsers() {
		return users;
	}
	
}
