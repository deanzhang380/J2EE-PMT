package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.DonVi;

public class UnitMapper implements IMapper<DonVi>{

	@Override
	public DonVi mapRow(ResultSet rs) {
		try {
			
			DonVi donVi = new DonVi();
			
			donVi.setMaDonVi(rs.getInt("MaDonVi"));
			donVi.setTenDonVi(rs.getString("TenDonVi"));
			
			return donVi;
			
		} catch (Exception e) {
			return null;
		}
	}
	
}
