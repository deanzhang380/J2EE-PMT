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

}
