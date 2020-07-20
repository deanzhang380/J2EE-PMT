package com.pmt.service;

import com.pmt.model.BenhNhan;

public interface IPatientService {
	String insertPatient(String patientID, String patientName, String patientSex, String patientAddress);
}
