package com.pmt.dao;

import java.util.List;

import com.pmt.model.ChiTietPhieuKham;

public interface IPrescriptionDetailDao extends IDao<ChiTietPhieuKham>{
	String insertPrescriptionDetail (int MaPK, int MaThuoc, int MaDonVi, int MaCachDung, int SoLuong);
	List<ChiTietPhieuKham> getPrescriptionDetailByPrescriptionId(int id);
}
