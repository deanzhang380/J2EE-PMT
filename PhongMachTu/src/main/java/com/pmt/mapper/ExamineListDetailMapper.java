package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.BenhNhan;
import com.pmt.model.ChiTietDanhSachKham;
import com.pmt.model.DanhSachKham;

public class ExamineListDetailMapper implements IMapper<ChiTietDanhSachKham>{

	@Override
	public ChiTietDanhSachKham mapRow(ResultSet rs) {
		try {
			ChiTietDanhSachKham ct = new ChiTietDanhSachKham();
			
			try {
				DanhSachKham dSachKham = new DanhSachKham();
				
				dSachKham.setMaDanhSachKham(rs.getInt("MaDanhSachKham"));
				dSachKham.setNgayKham(rs.getNString("NgayKham"));
				
				ct.setDsKham(dSachKham);
				
			} catch (Exception e) {
				ct.setDsKham(null);
			}
			
			try {
				BenhNhan benhNhan = new BenhNhan();
				
				benhNhan.setMaBenhNhan(rs.getInt("MaBenhNhan"));
				benhNhan.setHoten(rs.getString("HoTen"));
				benhNhan.setGioiTinh(rs.getString("GioiTinh"));
				benhNhan.setDiaChi(rs.getString("DiaChi"));
				
				ct.setBenhNhan(benhNhan);
			} catch (Exception e) {
				ct.setBenhNhan(null);
			}
			
			return ct;	
		} catch (Exception e) {
			return null;
		}
	}

}
