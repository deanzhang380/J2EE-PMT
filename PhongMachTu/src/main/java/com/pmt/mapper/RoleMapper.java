package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.VaiTro;

public class RoleMapper implements IMapper<VaiTro>{

	@Override
	public VaiTro mapRow(ResultSet rs) {
		try {
			VaiTro vaiTro = new VaiTro();
			
			vaiTro.setId(rs.getString("MaVaiTro"));
			vaiTro.setTenVaiTro(rs.getString("TenVaiTro"));
			
			return vaiTro;
		} catch (Exception e) {
			return null;
		}
	}
	

}
