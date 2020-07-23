package com.pmt.dao;

import com.pmt.model.ChiTietDanhSachKham;;

public interface IExaminesListDetailDao extends IDao<ChiTietDanhSachKham>{
	String insertExaminesListDetail(String ID_ExaminesList, String ID_Patient);
}
