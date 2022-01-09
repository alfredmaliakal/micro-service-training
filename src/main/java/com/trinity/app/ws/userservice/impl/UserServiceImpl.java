package com.trinity.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.app.ws.shared.Utils;
import com.trinity.app.ws.ui.model.request.UserDetailsRequestModel;
import com.trinity.app.ws.ui.model.response.UserRest;
import com.trinity.app.ws.userservice.UserService;


@Service
public class UserServiceImpl implements UserService {

	Map<String, UserRest> users;
	Utils utils;
	
	UserServiceImpl(){}
	
	@Autowired
	UserServiceImpl(Utils utils){
		this.utils = utils;
	}
	
	
	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {

		UserRest returnValue = new UserRest();

		String userId = UUID.randomUUID().toString();

		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setUserId(userId);
		returnValue.setPassword(userDetails.getPassword());

		if (users == null)
			users = new HashMap<String, UserRest>();
		users.put(userId, returnValue);
		
		return returnValue;
	}


	
}
