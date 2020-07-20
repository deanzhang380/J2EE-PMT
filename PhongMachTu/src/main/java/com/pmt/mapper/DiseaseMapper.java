package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.Benh;

public class DiseaseMapper implements IMapper<Benh>{

	@Override
	public Benh mapRow(ResultSet rs) {
		try {
			Benh benh = new Benh();
			
			benh.setMaBenh(rs.getInt("MaBenh"));
			benh.setTenBenh(rs.getString("TenBenh"));
			
			return benh;
		} catch (Exception e) {
			return null;
		}
	}

}
