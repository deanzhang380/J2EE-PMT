package com.pmt.dao;

import com.pmt.model.DanhSachKham;

public interface IExaminesListDao extends IDao<DanhSachKham>{
	DanhSachKham getIdByDate (String Date);
	int checkIdByDate (String Date);
	String insertExaminesList(String Date);
}
