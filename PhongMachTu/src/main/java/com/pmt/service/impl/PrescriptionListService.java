package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IPatientDao;
import com.pmt.dao.IPrescriptionDao;
import com.pmt.model.BenhNhan;
import com.pmt.model.PhieuKham;
import com.pmt.service.IPrescriptionListService;


public class PrescriptionListService implements IPrescriptionListService {
	@Inject
	private IPrescriptionDao PrescriptionDao ; 
	@Inject
	private IPatientDao patientDao; 
	@Override
	public List<PhieuKham> getAllListPrescriptionByDate(String Date, int getAll) {
		// TODO Auto-generated method stub
		return PrescriptionDao.getAllListPrescriptionByDate(Date, getAll);
	}
	@Override
	public BenhNhan getPatientByID(int id) {
		// TODO Auto-generated method stub
		return patientDao.getPatientByID(String.valueOf(id));
	}

}
