package com.pmt.dao.impl;

import com.pmt.dao.IUserDao;
import com.pmt.model.NguoiDung;

public class UserDao extends AbstractDAO<NguoiDung> implements IUserDao {

	@Override
	public NguoiDung findUserByNameAndPass(String name, String pass) {
		StringBuilder sqlBuilder = new StringBuilder("");
		return null;
	}



}
