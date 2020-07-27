package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.pmt.dao.IUsageDao;
import com.pmt.dao.IUserDao;
import com.pmt.model.CachDung;
import com.pmt.model.DonVi;
import com.pmt.service.IUnitService;
import com.pmt.service.IUsageService;

public class UsageService implements IUsageService{

	@Inject
	private IUsageDao usageDao;

	@Override
	public List<CachDung> getAll() {
		// TODO Auto-generated method stub
		return usageDao.getAllListUsage();
	}

	@Override
	public CachDung findById(int id) {
		// TODO Auto-generated method stub
		return usageDao.getUsageByID(id);
	}

	@Override
	public void insert(String name) {
		// TODO Auto-generated method stub
		usageDao.insert(name);
	}

	@Override
	public void update(int id, String name) {
		// TODO Auto-generated method stub
		usageDao.update(id, name);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		usageDao.delete(id);
	}

	


}
