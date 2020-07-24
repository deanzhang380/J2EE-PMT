package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IUnitDao;
import com.pmt.mapper.UnitMapper;
import com.pmt.mapper.UsageMapper;
import com.pmt.model.CachDung;
import com.pmt.model.DonVi;

public class UnitDao extends AbstractDAO<DonVi> implements IUnitDao{

	@Override
	public List<DonVi> getAllListUnit() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("select * from DonVi ");
		List<DonVi> UnitList = query(sql.toString(), new UnitMapper(),null);
		return UnitList;
	}

}
