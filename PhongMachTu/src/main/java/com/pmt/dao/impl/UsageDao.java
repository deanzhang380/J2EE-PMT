package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IUsageDao;
import com.pmt.mapper.MedicineMapper;
import com.pmt.mapper.UsageMapper;
import com.pmt.model.CachDung;
import com.pmt.model.Thuoc;

public class UsageDao extends AbstractDAO<CachDung> implements IUsageDao{

	@Override
	public List<CachDung> getAllListUsage() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("select * from CachDung ");
		List<CachDung> UsageList = query(sql.toString(), new UsageMapper(),null);
		return UsageList;
	}

	@Override
	public CachDung getUsageByID(int ID) {
		StringBuilder sql = new StringBuilder("select * from CachDung Where MaCachDung=? ");
		List<CachDung> UsageList = query(sql.toString(), new UsageMapper(),ID);
		return UsageList.isEmpty()?null:UsageList.get(0);
	}

	@Override
	public void insert(String usage) {
		StringBuilder sql = new StringBuilder("INSERT INTO CachDung(CachDung)");
		sql.append(" VALUES (?)");
		
		insert(sql.toString(), usage);
		
	}

	@Override
	public void delete(int id) {
		StringBuilder sql = new StringBuilder("DELETE FROM CachDung");
		sql.append(" WHERE MaCachDung = ?)");
		
		delete(sql.toString(), id);
		
	}

	@Override
	public void update(int id, String name) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("UPDATE CachDung");
		sql.append(" SET CachDung = ?");
		sql.append(" WHERE MaCachDung = ?");
		
		update(sql.toString(), name, id);
	}

}
