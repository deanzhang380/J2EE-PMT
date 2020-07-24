package com.pmt.mapper;

import java.sql.ResultSet;

import com.pmt.model.CachDung;
import com.pmt.model.ChiTietPhieuKham;
import com.pmt.model.DonVi;
import com.pmt.model.PhieuKham;
import com.pmt.model.Thuoc;

public class PrescriptionDetailMapper implements IMapper<ChiTietPhieuKham> {

	@Override
	public ChiTietPhieuKham mapRow(ResultSet rs) {
		try {
			ChiTietPhieuKham ctPhieuKham = new ChiTietPhieuKham();

			ctPhieuKham.setSoLuong(rs.getInt("SoLuong"));
			ctPhieuKham.setMaChiTietPhieuKham(rs.getInt("maChiTietPhieuKham"));

			try {
				PhieuKham pKham = new PhieuKham();
				pKham.setMaPhieuKham(rs.getInt("MaPhieuKham"));
				ctPhieuKham.setPhieuKham(pKham);
			} catch (Exception e) {
				ctPhieuKham.setPhieuKham(null);
				// TODO: handle exception
			}

			try {
				Thuoc thuoc = new Thuoc();

				thuoc.setId(rs.getInt("MaThuoc"));
				thuoc.setTenThuoc(rs.getString("TenThuoc"));
				thuoc.setGiaThuoc(rs.getInt("GiaThuoc"));

				ctPhieuKham.setThuoc(thuoc);

			} catch (Exception e) {
				Thuoc thuoc = new Thuoc();

				thuoc.setId(rs.getInt("MaThuoc"));
				ctPhieuKham.setThuoc(thuoc);
			}

			try {
				CachDung cachDung = new CachDung();

				cachDung.setMaCachDung(rs.getInt("MaCachDung"));
				cachDung.setCachDung(rs.getString("CachDung"));

				ctPhieuKham.setCachDung(cachDung);
			} catch (Exception e) {
				
				CachDung cachDung = new CachDung();

				cachDung.setMaCachDung(rs.getInt("MaCachDung"));
				
				ctPhieuKham.setCachDung(cachDung);
			}

			try {
				DonVi donVi = new DonVi();

				donVi.setMaDonVi(rs.getInt("MaDonVi"));
				donVi.setTenDonVi(rs.getString("TenDonVi"));

				ctPhieuKham.setDonVi(donVi);
			} catch (Exception e) {
				DonVi donVi = new DonVi();

				donVi.setMaDonVi(rs.getInt("MaDonVi"));
				
				ctPhieuKham.setDonVi(donVi);
			}

			return ctPhieuKham;
		} catch (Exception e) {
			return null;
		}
	}

}
