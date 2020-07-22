package com.pmt.dao.impl;
import java.util.List;

import com.pmt.dao.IExaminesListDetailDao;
import com.pmt.mapper.ExamineListDetailMapper;
import com.pmt.model.ChiTietDanhSachKham;

public class ExaminesListDetailDao extends AbstractDAO<ChiTietDanhSachKham> implements IExaminesListDetailDao{

	@Override
	public String insertExaminesListDetail(String ID_ExaminesList, String ID_Patient) {
		StringBuilder sql = new StringBuilder("INSERT INTO chitietdanhsachkham");
		sql.append(" VALUES (?,?)");
		String newrecord = insert(sql.toString(),ID_ExaminesList, ID_Patient);
		return newrecord;
	}

}
