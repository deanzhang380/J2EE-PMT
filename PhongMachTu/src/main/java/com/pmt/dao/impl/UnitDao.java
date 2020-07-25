package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IUnitDao;
import com.pmt.mapper.MedicineMapper;
import com.pmt.mapper.UnitMapper;
import com.pmt.mapper.UsageMapper;
import com.pmt.model.CachDung;
import com.pmt.model.DonVi;
import com.pmt.model.Thuoc;

public class UnitDao extends AbstractDAO<DonVi> implements IUnitDao{

	@Override
	public List<DonVi> getAllListUnit() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("select * from DonVi ");
		List<DonVi> UnitList = query(sql.toString(), new UnitMapper(),null);
		return UnitList;
	}

	@Override
	public DonVi getUnit(int id) {
		StringBuilder sql = new StringBuilder("select * from DonVi Where MaDonVi=?");
		List<DonVi> unitList = query(sql.toString(), new UnitMapper(),id);
		return unitList.isEmpty()?null:unitList.get(0);
	}

	@Override
	public void Create(String name) {
		StringBuilder sql = new StringBuilder("INSERT INTO DonVi(TenDonVi)");
		sql.append(" VALUES (?)");
		
		insert(sql.toString(), name);
		
	}

	@Override
	public void delete(int id) {
		StringBuilder sql = new StringBuilder("DELETE FROM DonVi");
		sql.append(" WHERE MaDonVi = ?)");
		
		delete(sql.toString(), id);
		
	}

	@Override
	public void update(int id, String name) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("UPDATE DonVi");
		sql.append(" SET TenDonVi = ?");
		sql.append(" WHERE MaDonVi = ?");
		
		update(sql.toString(), name, id);
	}

}
