package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IPatientDao;

import com.pmt.dao.IPrescriptionDao;
import com.pmt.mapper.PrescriptionMapper;
import com.pmt.mapper.UserMapper;
import com.pmt.model.BenhNhan;
import com.pmt.model.NguoiDung;
import com.pmt.model.PhieuKham;

public class PrescriptionDao extends AbstractDAO<PhieuKham> implements IPrescriptionDao {

	@Override
	public String insertPrescription(PhieuKham pk) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder(
				"INSERT INTO phieukham (MaDanhSachKham, MaBenhNhan, MaBenh, MaNguoiDung, TrieuChung, GhiChu, TongTien, ThanhToan)");
		sql.append(" VALUES (?,?,?,?,?,?,?,?)");
		String newDiagnosis = insert(sql.toString(), pk.getDanhSach().getMaDanhSachKham(),
				pk.getBenhNhan().getMaBenhNhan(), pk.getBenh().getMaBenh(), pk.getNguoiDung().getMaNguoiDung(),
				pk.getTrieuChung(), pk.getGhiChu(), pk.getTongTien(), 0);
		return newDiagnosis;
	}

	@Override
	public int CheckPatientInList(BenhNhan bn, String Date) {
		StringBuilder sql = new StringBuilder(
				"select count(phieukham.MaDanhSachKham) FROM phongmachtu.phieukham join benhnhan join danhsachkham");
		sql.append(
				" where phieukham.MaBenhNhan= benhnhan.MaBenhNhan and phieukham.MaDanhSachKham=danhsachkham.MaDanhSachKham and benhnhan.MaBenhNhan=? and NgayKham=?");
		int item = count(sql.toString(), bn.getMaBenhNhan(), Date);
		return item;
	}

	@Override
	public void UpdatePrescription(PhieuKham pk) {
		StringBuilder sql = new StringBuilder("Update PhieuKham");
		sql.append(" SET phieukham.MaBenh=?, phieukham.TrieuChung=?,phieukham.GhiChu=?");
		sql.append(" Where PhieuKham.MaPhieuKham=?");
		update(sql.toString(),pk.getBenh().getMaBenh(),pk.getTrieuChung(),pk.getGhiChu(),pk.getMaPhieuKham());
	}

	@Override
	public PhieuKham GetPrescriptionByPatientAndDate(BenhNhan bn, String Date) {
		StringBuilder sql = new StringBuilder("SELECT PhieuKham.*");
		sql.append(" FROM PhieuKham join DanhSachKham on PhieuKham.MaDanhSachKham=DanhSachKham.MaDanhSachKham");
		sql.append(" WHERE PhieuKham.MaBenhNhan = ? AND DanhSachKham.NgayKham = ?");
		
		List<PhieuKham> prescription = query(sql.toString(), new PrescriptionMapper(), bn.getMaBenhNhan(), Date);
		//List<NguoiDung> user = query(sqlString, new UserMapper());
		
		return prescription.isEmpty() ? null : prescription.get(0);
	}

	@Override
	public void UpdateMoney(int id,int money) {
		StringBuilder sql = new StringBuilder("Update PhieuKham");
		sql.append(" SET phieukham.TongTien=?");
		sql.append(" Where PhieuKham.MaPhieuKham=?");
		update(sql.toString(),money,id);
		
	}

	@Override
	public List<PhieuKham> getAllListPrescriptionByDate(String Date, int getAll) {
		StringBuilder sql = new StringBuilder("SELECT PhieuKham.*");
		sql.append(" FROM PhieuKham join DanhSachKham on PhieuKham.MaDanhSachKham=DanhSachKham.MaDanhSachKham");
		if(getAll==1) {
			sql.append(" WHERE DanhSachKham.NgayKham = ? ");
		}else {
		sql.append(" WHERE DanhSachKham.NgayKham = ? AND PhieuKham.ThanhToan = ?");
		}
		List<PhieuKham> prescription = query(sql.toString(), new PrescriptionMapper(), Date, getAll);
		return prescription;
	}

	@Override
	public void UpdateStatus(int id, int status) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("Update PhieuKham");
		sql.append(" SET phieukham.ThanhToan=?");
		sql.append(" Where PhieuKham.MaPhieuKham=?");
		update(sql.toString(),status,id);
	}

}
