package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IExaminesListDao;
import com.pmt.mapper.ExamineListMapper;
import com.pmt.mapper.UserMapper;
import com.pmt.model.DanhSachKham;
import com.pmt.model.NguoiDung;

public class ExaminesListDao extends AbstractDAO<DanhSachKham> implements IExaminesListDao{

	@Override
	public DanhSachKham getIdByDate(String Date) {
		StringBuilder sql = new StringBuilder("Select * from danhsachkham");
		sql.append(" where danhsachkham.NgayKham=?");
		List<DanhSachKham> item = query(sql.toString(),new ExamineListMapper(), Date);
		return item.isEmpty() ? null : item.get(0);
	}

}
