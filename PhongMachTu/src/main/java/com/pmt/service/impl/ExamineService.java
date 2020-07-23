package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IDiseaseDao;
import com.pmt.dao.IExaminesListDao;
import com.pmt.dao.IParameterDao;
import com.pmt.dao.IPatientDao;
import com.pmt.dao.IPrescriptionDao;
import com.pmt.dao.IUserDao;
import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.ThamSo;
import com.pmt.service.IExamineService;

public class ExamineService implements IExamineService{
	@Inject
	private IPatientDao PatientDao; 
	@Inject
	private IDiseaseDao DiseaseDao; 
	@Inject
	private IUserDao UserDao; 
	@Inject
	private IExaminesListDao ExaminesListDao; 
	@Inject
	private IPrescriptionDao PrescriptionDao ; 
	@Inject
	private IParameterDao parameterDao ; 
	@Override
	public BenhNhan getPatientByID(String patientId) {
		// TODO Auto-generated method stub
		return PatientDao.getPatientByID(patientId);
	}
	@Override
	public List<Benh> getAllListDisease() {
		// TODO Auto-generated method stub
		return DiseaseDao.getAllListDisease();
	}
	@Override
	public String insertDiagnosis(PhieuKham pk) {
		// TODO Auto-generated method stub
		return PrescriptionDao.insertPrescription(pk);
	}
	@Override
	public Benh getDieaseByID(String ID) {
		// TODO Auto-generated method stub
		return DiseaseDao.getDieaseByID(ID);
	}
	@Override
	public DanhSachKham getExaminses(String Date) {
		// TODO Auto-generated method stub
		return ExaminesListDao.getIdByDate(Date);
	}
	@Override
	public NguoiDung getNguoiDungByID(String ID) {
		// TODO Auto-generated method stub
		return UserDao.findUserByID(ID);
	}
	@Override
	public ThamSo getTienKham() {
		// TODO Auto-generated method stub
		return parameterDao.getTienKham();
	}

}
