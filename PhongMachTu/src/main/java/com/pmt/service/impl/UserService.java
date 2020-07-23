package com.pmt.service.impl;

import java.util.List;

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

	@Override
	public List<NguoiDung> getAll() {
		return userDao.findAll();
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
		
	}

	@Override
	public void updateUser(int id, String hoten, String name, String pass, String gender) {
		// TODO Auto-generated method stub
		updateUser(id, hoten, name, pass, gender);
	}

	@Override
	public void insertUser(String hoten, String name, String pass, String maVaiTro) {
		insertUser(hoten, name, pass, maVaiTro);
		
	}

}
