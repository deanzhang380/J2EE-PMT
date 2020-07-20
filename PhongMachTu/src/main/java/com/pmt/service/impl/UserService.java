package com.pmt.service.impl;

import javax.inject.Inject;

import com.pmt.dao.IUserDao;
import com.pmt.model.NguoiDung;
import com.pmt.service.IUserService;

public class UserService  implements IUserService{
	
	@Inject
	private IUserDao userDao;
	
	@Override
	public NguoiDung checkUser(String usernameString, String passwordString) {	
		
		return userDao.findUserByNameAndPass(usernameString, passwordString);
	}

}
