package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IDiseaseDao;
import com.pmt.dao.IExaminesListDao;
import com.pmt.dao.IExaminesListDetailDao;
import com.pmt.dao.IMedicineDao;
import com.pmt.dao.IParameterDao;
import com.pmt.dao.IPatientDao;
import com.pmt.dao.IPrescriptionDao;
import com.pmt.dao.IPrescriptionDetailDao;
import com.pmt.dao.IUnitDao;
import com.pmt.dao.IUsageDao;
import com.pmt.dao.IUserDao;
import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.CachDung;
import com.pmt.model.ChiTietPhieuKham;
import com.pmt.model.DanhSachKham;
import com.pmt.model.DonVi;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.ThamSo;
import com.pmt.model.Thuoc;
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
	@Inject
	private IMedicineDao medicineDao;
	@Inject
	private IUnitDao unitDao;
	@Inject
	private IUsageDao usageDao;
	@Inject
	private IPrescriptionDetailDao prescriptionDetailDao;
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
	@Override
	public int CheckPatientInList(BenhNhan bn, String Date) {
		// TODO Auto-generated method stub
		return PrescriptionDao.CheckPatientInList(bn, Date);
	}
	@Override
	public void UpdateDiagnosis(PhieuKham pk) {
		// TODO Auto-generated method stub
		PrescriptionDao.UpdatePrescription(pk);
	}
	@Override
	public PhieuKham getPrescription(BenhNhan bn, String Date) {
		// TODO Auto-generated method stub
		return PrescriptionDao.GetPrescriptionByPatientAndDate(bn, Date);
	}
	@Override
	public List<Thuoc> getAllListMedicine() {
		// TODO Auto-generated method stub
		return medicineDao.getAllListMedicine();
	}
	@Override
	public List<DonVi> getAllListDonVi() {
		// TODO Auto-generated method stub
		return unitDao.getAllListUnit();
	}
	@Override
	public List<CachDung> getAllListUsage() {
		// TODO Auto-generated method stub
		return usageDao.getAllListUsage();
	}
	@Override
	public String insertPrescriptionDetail(int Mapk, int MaThuoc, int MaDonVi, int MaCachDung, int SoLuong) {
		// TODO Auto-generated method stub
		return prescriptionDetailDao.insertPrescriptionDetail(Mapk, MaThuoc, MaDonVi, MaCachDung, SoLuong);
	}
	@Override
	public List<ChiTietPhieuKham> getPrescriptionDetailByPrescriptionId(int id) {
		// TODO Auto-generated method stub
		return prescriptionDetailDao.getPrescriptionDetailByPrescriptionId(id);
	}
	@Override
	public Thuoc getMedicine(int id) {
		// TODO Auto-generated method stub
		return medicineDao.getMedicineByID(id);
	}
	@Override
	public DonVi getUnit(int id) {
		// TODO Auto-generated method stub
		return unitDao.getUnit(id);
	}
	@Override
	public CachDung getUsage(int id) {
		// TODO Auto-generated method stub
		return usageDao.getUsageByID(id);
	}
	@Override
	public void deleteMedicine(String Pid, String Mid) {
		prescriptionDetailDao.DeleteMedicine(Pid, Mid);
	}
	@Override
	public void UpdateMoney(int id, int money) {
		// TODO Auto-generated method stub
		PrescriptionDao.UpdateMoney(id, money);
	}
	@Override
	public void UpdateStatus(int id, int status) {
		// TODO Auto-generated method stub
		PrescriptionDao.UpdateStatus(id, status);
	}

}
