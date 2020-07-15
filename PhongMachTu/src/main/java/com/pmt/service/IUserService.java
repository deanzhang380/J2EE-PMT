package com.pmt.service;

import com.pmt.model.NguoiDung;

public interface IUserService {
	NguoiDung checkUser(String usernameString, String passwordString);
}
