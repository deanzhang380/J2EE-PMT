package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.DanhSachKham;

public class ExamineListMapper implements IMapper<DanhSachKham>{

	@Override
	public DanhSachKham mapRow(ResultSet rs) {
		try {
			DanhSachKham dSachKham = new DanhSachKham();
			
			dSachKham.setMaDanhSachKham(rs.getInt("MaDanhSachKham"));
			dSachKham.setNgayKham(rs.getNString("NgayKham"));
			
			return dSachKham;
			
		} catch (Exception e) {
			return null;
		}
	}

}
