package com.sujata.model.persistence;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.sujata.database.UserDataBase;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String getPassword(String userName) {
		return UserDataBase.getUsers().get(userName);
	}

	@Override
	public Set<String> getAllUserNames() {
		
		return UserDataBase.getUsers().keySet();
	}

}
