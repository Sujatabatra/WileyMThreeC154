package com.sujata.model.persistence;

import org.springframework.stereotype.Repository;

import com.sujata.database.UserDataBase;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String getPassword(String userName) {
		return UserDataBase.getUsers().get(userName);
	}

}
