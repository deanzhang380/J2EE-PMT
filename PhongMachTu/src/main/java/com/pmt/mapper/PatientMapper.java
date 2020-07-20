package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.BenhNhan;

public class PatientMapper implements IMapper<BenhNhan>{

	@Override
	public BenhNhan mapRow(ResultSet rs) {
		try {
			BenhNhan benhNhan = new BenhNhan();
			
			benhNhan.setMaBenhNhan(rs.getInt("MaBenhNhan"));
			benhNhan.setHoten(rs.getString("HoTen"));
			benhNhan.setGioiTinh(rs.getString("GioiTinh"));
			benhNhan.setDiaChi(rs.getString("DiaChi"));
			
			return benhNhan;
		} catch (Exception e) {
			return null;
		}
	}

}
