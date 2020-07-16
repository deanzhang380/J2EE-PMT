package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.CachDung;

public class UsageMapper implements IMapper<CachDung>{

	@Override
	public CachDung mapRow(ResultSet rs) {
		try {
			CachDung cachDung = new CachDung();
			
			cachDung.setMaCachDung(rs.getString("MaCachDung"));
			cachDung.setCachDung(rs.getString("CachDung"));
			
			return cachDung;
		} catch (Exception e) {
			return null;
		}
	}

}
