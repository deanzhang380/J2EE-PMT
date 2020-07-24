package com.pmt.service;

import java.util.List;

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

public interface IExamineService {
	BenhNhan getPatientByID (String patientId);
	List<Benh> getAllListDisease();
	String insertDiagnosis(PhieuKham pk);
	Benh getDieaseByID(String ID);
	DanhSachKham getExaminses(String Date);
	NguoiDung getNguoiDungByID(String ID);
	ThamSo getTienKham();
	int CheckPatientInList(BenhNhan bn,String Date);
	void UpdateDiagnosis(PhieuKham pk);
	PhieuKham getPrescription(BenhNhan bn,String Date);
	
	List<Thuoc> getAllListMedicine();
	List<DonVi> getAllListDonVi();
	List<CachDung> getAllListUsage();
	
	String insertPrescriptionDetail(int Mapk,int MaThuoc, int MaDonVi, int MaCachDung,int SoLuong);
	List<ChiTietPhieuKham> getPrescriptionDetailByPrescriptionId(int id);
}
