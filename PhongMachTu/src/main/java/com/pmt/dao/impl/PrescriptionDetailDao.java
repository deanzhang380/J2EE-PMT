package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IPrescriptionDetailDao;
import com.pmt.mapper.PrescriptionDetailMapper;
import com.pmt.mapper.PrescriptionMapper;
import com.pmt.model.ChiTietPhieuKham;
import com.pmt.model.PhieuKham;

public class PrescriptionDetailDao extends AbstractDAO<ChiTietPhieuKham> implements IPrescriptionDetailDao{

	@Override
	public String insertPrescriptionDetail(int MaPK, int MaThuoc, int MaDonVi, int MaCachDung, int SoLuong) {
		StringBuilder sql = new StringBuilder("INSERT INTO chitietphieukham (MaPhieuKham, MaThuoc, MaDonVi,MaCachDung,SoLuong)");
		sql.append(" VALUES (?,?,?,?,?)");
		String newPrescriptionDetail = insert(sql.toString(),MaPK,MaThuoc, MaDonVi, MaCachDung,SoLuong);
		return newPrescriptionDetail;
	}

	@Override
	public List<ChiTietPhieuKham> getPrescriptionDetailByPrescriptionId(int id) {
		StringBuilder sql = new StringBuilder("SELECT *");
		sql.append(" FROM ChiTietPhieuKham ");
		sql.append(" WHERE ChiTietPhieuKham.MaPhieuKham = ?");
		
		List<ChiTietPhieuKham> prescriptionDetail = query(sql.toString(), new PrescriptionDetailMapper(),id);
		return prescriptionDetail;
	}

}
