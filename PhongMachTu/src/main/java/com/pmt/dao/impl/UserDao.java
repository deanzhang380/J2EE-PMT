package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IUserDao;
import com.pmt.mapper.UserMapper;
import com.pmt.model.NguoiDung;

public class UserDao extends AbstractDAO<NguoiDung> implements IUserDao {

	@Override
	public NguoiDung findUserByNameAndPass(String name, String pass) {
		
		StringBuilder sql = new StringBuilder("SELECT *");
		sql.append(" FROM nguoidung as u join vaitro as v on u.MaVaiTro = v.MaVaiTro");
		sql.append(" WHERE TenDangNhap = ? AND MatKhau = ?");
		
		//String sqlString = "SELECT * FROM nguoidung";
		
		List<NguoiDung> user = query(sql.toString(), new UserMapper(), name, pass);
		//List<NguoiDung> user = query(sqlString, new UserMapper());
		
		return user.isEmpty() ? null : user.get(0);
	}

	@Override
	public NguoiDung findUserByID(String ID) {
		StringBuilder sql = new StringBuilder("SELECT *");
		sql.append(" FROM nguoidung");
		sql.append(" WHERE MaNguoiDung=?");
		
		//String sqlString = "SELECT * FROM nguoidung";
		
		List<NguoiDung> user = query(sql.toString(), new UserMapper(), ID);
		//List<NguoiDung> user = query(sqlString, new UserMapper());
		
		return user.isEmpty() ? null : user.get(0);
	}

	@Override
	public List<NguoiDung> findAll() {
		String sql = "SELECT * FROM nguoidung as u join vaitro as v on u.MaVaiTro = v.MaVaiTro";
		
		return query(sql, new UserMapper());
	}

	@Override
	public void update(int id, String hoTen, String name, String pass, int maVaiTro) {

		StringBuilder sql = new StringBuilder("UPDATE nguoidung");
		sql.append(" VALUES(?,?,?,?)");
		sql.append(" WHERE maNguoiDung = ?");
	}
			


}
