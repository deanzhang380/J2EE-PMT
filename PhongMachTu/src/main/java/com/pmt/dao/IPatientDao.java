package com.pmt.dao;

import com.pmt.model.BenhNhan;


public interface IPatientDao extends IDao<BenhNhan> {
	String InsertPatient(String name, String gender,String Address);
}
