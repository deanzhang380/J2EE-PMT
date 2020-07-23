package com.pmt.dao;

import java.util.List;

import com.pmt.model.NguoiDung;

public interface IUserDao extends IDao<NguoiDung>{

	NguoiDung findUserByNameAndPass(String name, String pass);
	List<NguoiDung> findAll();
	void update(int id, String hoTen, String name, String pass, int maVaiTro);
	void insert(String hoTen, String name, String pass, int maVaiTro);
	void delete(int id);
}
