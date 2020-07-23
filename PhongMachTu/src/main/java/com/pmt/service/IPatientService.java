package com.pmt.service;

import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;

public interface IPatientService {
	DanhSachKham getIdDate(String Date);
	int findDateInExaminesList (String Date);
	String insertPatient( String patientName, String patientSex, String patientAddress);
	String insertExaminesList( String Date);
	String insertExaminseListDetail (String ID_Examines, String ID_Patient);
}
