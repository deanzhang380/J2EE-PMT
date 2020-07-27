package com.pmt.dao;

import java.util.List;

import com.pmt.model.BenhNhan;
import com.pmt.model.PhieuKham;

public interface IPrescriptionDao extends IDao<PhieuKham>{
	int CheckPatientInList(BenhNhan bn,String Date);
	String insertPrescription(PhieuKham pk);
	void UpdatePrescription(PhieuKham pk);
	PhieuKham GetPrescriptionByPatientAndDate(BenhNhan bn,String Date);
	void UpdateMoney(int id,int money);
	List<PhieuKham> getAllListPrescriptionByDate(String Date, int getAll);
	void UpdateStatus(int id, int status);
}
