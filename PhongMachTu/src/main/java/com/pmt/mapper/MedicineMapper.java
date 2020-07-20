package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.Thuoc;

public class MedicineMapper implements IMapper<Thuoc>{

	@Override
	public Thuoc mapRow(ResultSet rs) {
		
		try {
			
			Thuoc thuoc = new Thuoc();
			
			thuoc.setId(rs.getInt("MaThuoc"));
			thuoc.setTenThuoc(rs.getString("TenThuoc"));
			thuoc.setGiaThuoc(rs.getInt("GiaThuoc"));
			
			return thuoc;
			
		} catch (Exception e) {
			return null;
		}
	}

}
