package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sujata.bean.User;
import com.sujata.model.persistence.UserDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean loginCheck(User user) {
		User usr=null;
		try {
		usr=userDao.getUser(user);
		}
		catch(EmptyResultDataAccessException exception) {
			
		}
		return usr!=null;
	}

}
