package com.pmt.service;
import java.util.List;

import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.model.ChiTietDanhSachKham;
public interface IPatientListService {
	DanhSachKham getIdPatientListByDate(String Date);
	List<BenhNhan> getPatientListByDate(String Date);
}
