package com.pmt.dao.impl;
import java.util.List;

import com.pmt.dao.IPatientDao;
import com.pmt.mapper.PatientMapper;
import com.pmt.mapper.UserMapper;
import com.pmt.model.BenhNhan;;
public class PatientDao extends AbstractDAO<BenhNhan> implements IPatientDao{

	@Override
	public String InsertPatient(String name, String Gender, String Address) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("INSERT INTO benhnhan (HoTen,GioiTinh,DiaChi)");
		sql.append(" VALUES (?,?,?)");
		String newPatient = insert(sql.toString(),name,Gender,Address);
		return newPatient;
	}

	@Override
	public List<BenhNhan> getPatientListByDate(String Date) {
		StringBuilder sql = new StringBuilder("select benhnhan.* from chitietdanhsachkham join danhsachkham join benhnhan ");
		sql.append(" where chitietdanhsachkham.MaDanhSachKham=danhsachkham.MaDanhSachKham&&chitietdanhsachkham.MaBenhNhan=benhnhan.MaBenhNhan&& danhsachkham.NgayKham=?");
		List<BenhNhan> PatientList = query(sql.toString(), new PatientMapper(), Date);
		return PatientList;
	}

	@Override
	public BenhNhan getPatientByID(String ID) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("select benhnhan.* from benhnhan ");
		sql.append(" where benhnhan.MaBenhNhan=?");
		List<BenhNhan> PatientList = query(sql.toString(), new PatientMapper(), ID);
		return PatientList.isEmpty() ? null : PatientList.get(0);
	}

}
