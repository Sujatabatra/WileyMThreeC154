package com.sujata.model.service;

import java.util.Set;

import com.sujata.bean.User;

public interface UserService {

	boolean loginCheck(User user);
	Set<String> getAllUsernames();
}
