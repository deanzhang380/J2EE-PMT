package com.pmt.dao;

import com.pmt.model.BenhNhan;
import com.pmt.model.PhieuKham;

public interface IPrescriptionDao {
	int CheckPatientInList(BenhNhan bn,String Date);
	String insertPrescription(PhieuKham pk);
}
