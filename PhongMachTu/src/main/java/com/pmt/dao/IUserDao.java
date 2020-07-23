package com.pmt.dao;

import com.pmt.model.NguoiDung;

public interface IUserDao extends IDao<NguoiDung>{

	NguoiDung findUserByNameAndPass(String name, String pass);
	NguoiDung findUserByID(String ID);
}
