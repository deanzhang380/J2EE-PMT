package com.pmt.service.impl;

import javax.inject.Inject;

import com.pmt.dao.IUserDao;
import com.pmt.service.IUserService;

public class UserService  implements IUserService{
	
	@Inject
	private IUserDao userDao;
	
	@Override
	public Boolean checkUser(String usernameString, String passwordString) {	
		
		return null;
	}

}
