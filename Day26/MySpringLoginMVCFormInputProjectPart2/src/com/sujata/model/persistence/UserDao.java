package com.sujata.model.persistence;

import java.util.List;
import java.util.Set;

public interface UserDao {
	
	String getPassword(String userName);
	
	Set<String> getAllUserNames();

}
