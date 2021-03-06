package com.pmt.dao;

import java.util.List;

import com.pmt.model.CachDung;

public interface IUsageDao extends IDao<CachDung>{
	List<CachDung> getAllListUsage();
	CachDung getUsageByID(int ID);
	void insert(String usage);
	void delete(int id);
	void update(int id, String name);
}
