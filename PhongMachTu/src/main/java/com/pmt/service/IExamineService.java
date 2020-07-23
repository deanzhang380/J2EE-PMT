package com.pmt.service;

import java.util.List;

import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.ThamSo;

public interface IExamineService {
	BenhNhan getPatientByID (String patientId);
	List<Benh> getAllListDisease();
	String insertDiagnosis(PhieuKham pk);
	Benh getDieaseByID(String ID);
	DanhSachKham getExaminses(String Date);
	NguoiDung getNguoiDungByID(String ID);
	ThamSo getTienKham();
}
