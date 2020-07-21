package com.pmt.dao;

import java.util.List;

import com.pmt.model.BenhNhan;


public interface IPatientDao extends IDao<BenhNhan> {
	String InsertPatient(String name, String gender,String Address);
	List<BenhNhan> getPatientListByDate(String Date);
}
