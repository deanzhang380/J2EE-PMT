package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IUnitDao;
import com.pmt.model.DonVi;
import com.pmt.service.IUnitService;

public class UnitService implements IUnitService{

	@Inject
	private IUnitDao unitDao;
	
	@Override
	public List<DonVi> getAll() {
		// TODO Auto-generated method stub
		return unitDao.getAllListUnit();
	}

	@Override
	public DonVi findById(int id) {
		// TODO Auto-generated method stub
		return unitDao.getUnit(id);
	}

	@Override
	public void insert(String name) {
		// TODO Auto-generated method stub
		unitDao.Create(name);
	}

	@Override
	public void update(int id, String name) {
		// TODO Auto-generated method stub
		unitDao.update(id, name);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		unitDao.delete(id);
	}

}
