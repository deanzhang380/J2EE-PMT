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
			nd.setMaNguoiDung(rs.getString("MaNguoiDung"));
			nd.setPass(rs.getString("MatKhau"));
			nd.setUser(rs.getString("TenDangNhap"));

			try {
				VaiTro vaiTro = new VaiTro();
				vaiTro.setId(rs.getString("MaVaiTro"));
				vaiTro.setId(rs.getString("TenVaiTro"));
				nd.setVaiTro(vaiTro);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

			return nd;

		} catch (Exception e) {
			return null;
		}
	}

}
