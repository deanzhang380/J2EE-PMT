package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.ThamSo;

public class ParemetersMapper implements IMapper<ThamSo>{

	@Override
	public ThamSo mapRow(ResultSet rs) {
		try {
			ThamSo thamSo = new ThamSo();
			
			thamSo.setId(rs.getString("MaThamSo"));
			thamSo.setTenThamSo(rs.getString("TenThamSo"));
			thamSo.setThamSo(rs.getInt("ThamSo"));
			
			return thamSo;
		} catch (Exception e) {
			return null;
		}
	}

}
