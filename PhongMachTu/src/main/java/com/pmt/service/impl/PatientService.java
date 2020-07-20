package com.pmt.service.impl;


import javax.inject.Inject;

import com.pmt.dao.IPatientDao;
import com.pmt.model.BenhNhan;
import com.pmt.service.IPatientService;;

public class PatientService implements IPatientService {

	@Inject
	private IPatientDao PatientDao;
	@Override
	public String insertPatient( String patientName, String patientGender, String patientAddress) {
		// TODO Auto-generated method stub
		return PatientDao.InsertPatient(patientName,patientGender,patientAddress);
	}
	
	

}
