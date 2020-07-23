package com.pmt.service.impl;


import javax.inject.Inject;

import com.pmt.dao.IExaminesListDao;
import com.pmt.dao.IExaminesListDetailDao;
import com.pmt.dao.IPatientDao;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.service.IPatientService;;

public class PatientService implements IPatientService {

	@Inject
	private IPatientDao PatientDao;
	@Inject
	private IExaminesListDao ExaminesListDao;
	@Inject
	private IExaminesListDetailDao ExaminesListDetailDao;
	
	@Override
	public String insertPatient( String patientName, String patientGender, String patientAddress) {
		// TODO Auto-generated method stub
		return PatientDao.InsertPatient(patientName,patientGender,patientAddress);
	}
	@Override
	public int findDateInExaminesList(String Date) {
		// TODO Auto-generated method stub
		return ExaminesListDao.checkIdByDate(Date);
	}
	@Override
	public String insertExaminesList(String Date) {
		// TODO Auto-generated method stub
		return ExaminesListDao.insertExaminesList(Date);
	}
	@Override
	public String insertExaminseListDetail(String ID_Examines, String ID_Patient) {
		// TODO Auto-generated method stub
		return ExaminesListDetailDao.insertExaminesListDetail(ID_Examines, ID_Patient);
	}
	@Override
	public DanhSachKham getIdDate(String Date) {
		// TODO Auto-generated method stub
		return ExaminesListDao.getIdByDate(Date);
	}
	
	

}
