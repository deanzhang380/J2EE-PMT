package com.pmt.service;

import java.util.List;

import com.pmt.model.BenhNhan;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;

public interface IPrescriptionListService {

	List<PhieuKham> getAllListPrescriptionByDate(String Date,int getAll);
	BenhNhan getPatientByID(int id);
}
