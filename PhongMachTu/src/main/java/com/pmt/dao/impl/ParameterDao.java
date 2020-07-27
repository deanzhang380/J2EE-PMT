package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IParameterDao;
import com.pmt.dao.IPatientDao;
import com.pmt.mapper.ParemetersMapper;
import com.pmt.model.BenhNhan;
import com.pmt.model.ThamSo;

public class ParameterDao extends AbstractDAO<ThamSo> implements IParameterDao{

	@Override
	public ThamSo getTienKham() {
		StringBuilder sql = new StringBuilder(
				"select * FROM thamso");
		sql.append(
				" where thamso.MaThamSo=1");
		List<ThamSo> item = query(sql.toString(),new ParemetersMapper(),null);
		return item.isEmpty()?null:item.get(0);
	}

	@Override
	public List<ThamSo> getAll() {
		String sql = "SELECT * FROM ThamSo";
		return query(sql, new ParemetersMapper());
	}

	@Override
	public void insert(String name, int value) {
		StringBuilder sql = new StringBuilder("INSERT INTO ThamSo(TenThamSo, ThamSo)");
		sql.append(" VALUES (?,?)");
		
		insert(sql.toString(), name, value);
		
	}

	@Override
	public void delete(int id) {
		StringBuilder sql = new StringBuilder("DELETE FROM DonVi");
		sql.append(" WHERE MaDonVi = ?)");
		
		delete(sql.toString(), id);
		
	}

}
