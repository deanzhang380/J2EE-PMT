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
//			ctPhieuKham.setThanhTien(rs.getInt("ThanhTien"));
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
//				thuoc.setTenThuoc(rs.getString("TenThuoc"));
//				thuoc.setGiaThuoc(rs.getInt("GiaThuoc"));
				
				ctPhieuKham.setThuoc(thuoc);
				
			} catch (Exception e) {
				ctPhieuKham.setThuoc(null);
			}
			
			try {
				CachDung cachDung = new CachDung();
				
				cachDung.setMaCachDung(rs.getInt("MaCachDung"));
//				cachDung.setCachDung(rs.getString("CachDung"));
				
				ctPhieuKham.setCachDung(cachDung);
			} catch (Exception e) {
				ctPhieuKham.setCachDung(null);
			}
			
			try {
				DonVi donVi = new DonVi();
				
				donVi.setMaDonVi(rs.getInt("MaDonVi"));
//				donVi.setTenDonVi(rs.getString("TenDonVi"));
				
				ctPhieuKham.setDonVi(donVi);
			} catch (Exception e) {
				ctPhieuKham.setDonVi(null);
			}
			
			return ctPhieuKham;
		} catch (Exception e) {
			return null;
		}
	}

}
