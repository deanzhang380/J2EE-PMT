package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.NguoiDung;
import com.pmt.model.VaiTro;

public class UserMapper implements IMapper<NguoiDung> {

	@Override
	public NguoiDung mapRow(ResultSet rs) {

		try {
			NguoiDung nd = new NguoiDung();
			nd.setHoten(rs.getString("HoTen"));
			nd.setMaNguoiDung(rs.getInt("MaNguoiDung"));
			nd.setPass(rs.getString("MatKhau"));
			nd.setUser(rs.getString("TenDangNhap"));

			try {
				VaiTro vaiTro = new VaiTro();
				vaiTro.setId(rs.getInt("MaVaiTro"));
				vaiTro.setTenVaiTro(rs.getString("TenVaiTro"));
				nd.setVaiTro(vaiTro);
			} catch (Exception e) {
				VaiTro vaiTro = new VaiTro();
				vaiTro.setId(rs.getInt("MaVaiTro"));
				nd.setVaiTro(vaiTro);
			}

			return nd;

		} catch (Exception e) {
			return null;
		}
	}

}
