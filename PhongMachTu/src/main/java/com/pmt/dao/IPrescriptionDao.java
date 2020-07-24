package com.pmt.dao;

import com.pmt.model.BenhNhan;
import com.pmt.model.PhieuKham;

public interface IPrescriptionDao extends IDao<PhieuKham>{
	int CheckPatientInList(BenhNhan bn,String Date);
	String insertPrescription(PhieuKham pk);
	void UpdatePrescription(PhieuKham pk);
	PhieuKham GetPrescriptionByPatientAndDate(BenhNhan bn,String Date);
}
