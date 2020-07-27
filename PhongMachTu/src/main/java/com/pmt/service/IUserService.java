package com.pmt.service;

import java.util.List;

import com.pmt.model.NguoiDung;

public interface IUserService {
	NguoiDung checkUser(String usernameString, String passwordString);
	List<NguoiDung> getAll();
	void deleteUser(int id);
	void updateUser(int id, String hoten, String name, String pass, int maVaiTro);
	void insertUser(String hoten, String name, String pass, int maVaiTro);
}
