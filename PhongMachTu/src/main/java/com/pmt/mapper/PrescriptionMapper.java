package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;
import com.pmt.model.DanhSachKham;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;
import com.pmt.model.VaiTro;

public class PrescriptionMapper implements IMapper<PhieuKham> {

	@Override
	public PhieuKham mapRow(ResultSet rs) {
		try {
			PhieuKham pkKham = new PhieuKham();

			pkKham.setMaPhieuKham(rs.getString("MaPhieuKham"));
			pkKham.setGhiChu(rs.getString("GhiChu"));
			pkKham.setTongTien(rs.getInt("TongTien"));
			pkKham.setTrieuChung(rs.getString("TrieuChung"));
			pkKham.setThanhToan(rs.getBoolean("ThanhToan"));
			
			
			try {
				Benh benh = new Benh();

				benh.setMaBenh(rs.getString("MaBenh"));
				benh.setTenBenh(rs.getString("TenBenh"));

				pkKham.setBenh(benh);
			} catch (Exception e) {
				System.out.print("Cant get 'Benh' from DB to 'Phieu Kham'");
				System.out.print(e.getMessage());
				pkKham.setBenh(null);
			}

			try {
				BenhNhan benhNhan = new BenhNhan();

				benhNhan.setMaBenhNhan(rs.getString("MaBenhNhan"));
				benhNhan.setHoten(rs.getString("HoTen"));
				benhNhan.setGioiTinh(rs.getString("GioiTinh"));
				benhNhan.setDiaChi(rs.getString("DiaChi"));

				pkKham.setBenhNhan(benhNhan);
			} catch (Exception e) {
				System.out.print("Cant get 'BenhNhan' from DB to 'Phieu Kham'");
				System.out.print(e.getMessage());
				pkKham.setBenhNhan(null);
			}

			try {
				DanhSachKham dsKham = new DanhSachKham();

				dsKham.setMaDanhSachKham(rs.getString("MaDanhSachKham"));
				dsKham.setNgayKham(rs.getNString("NgayKham"));

				pkKham.setDanhSach(dsKham);
			} catch (Exception e) {
				System.out.print("Cant get 'DanhSachKham' from DB to 'Phieu Kham'");
				System.out.print(e.getMessage());
				pkKham.setDanhSach(null);
			}

			try {
				NguoiDung nguoiDung = new NguoiDung();

				nguoiDung.setHoten(rs.getString("HoTen"));
				nguoiDung.setMaNguoiDung(rs.getString("MaNguoiDung"));
				nguoiDung.setPass(rs.getString("MatKhau"));
				nguoiDung.setUser(rs.getString("TenDanNhap"));

				try {
					VaiTro vaiTro = new VaiTro();
					
					vaiTro.setId(rs.getString("MaVaiTro"));
					vaiTro.setId(rs.getString("TenVaiTro"));
					
					nguoiDung.setVaiTro(vaiTro);
				} catch (Exception e) {
					System.out.print(e.getMessage());
					nguoiDung.setVaiTro(null);
				}
				
				pkKham.setNguoiDung(nguoiDung);

			} catch (Exception e) {
				System.out.print("Cant get 'NguoiDung' from DB to 'Phieu Kham'");
				System.out.print(e.getMessage());
				pkKham.setNguoiDung(null);
			}

			return pkKham;
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
	}

}
