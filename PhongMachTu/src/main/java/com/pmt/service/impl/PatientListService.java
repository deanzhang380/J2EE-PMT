package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IExaminesListDao;
import com.pmt.dao.IPatientDao;
import com.pmt.dao.IPrescriptionDao;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.service.IPatientListService;

public class PatientListService implements IPatientListService{
	@Inject
	private IExaminesListDao examinesDao;
	
	@Inject
	private IPatientDao patientDao;
	
	@Inject
	private IPrescriptionDao prescriptionDao;
	
	@Override
	public DanhSachKham getIdPatientListByDate(String Date) {
		// TODO Auto-generated method stub
		return examinesDao.getIdByDate(Date);
	}
	@Override
	public List<BenhNhan> getPatientListByDate(String Date) {
		// TODO Auto-generated method stub
		return patientDao.getPatientListByDate(Date);
	}
	@Override
	public int CheckPatientInList(BenhNhan bn,String Date) {
		// TODO Auto-generated method stub
		return prescriptionDao.CheckPatientInList(bn, Date);
	}

}
