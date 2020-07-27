package com.pmt.dao;

import java.util.List;

import com.pmt.model.DonVi;

public interface IUnitDao extends IDao<DonVi>{
	List<DonVi> getAllListUnit();
	DonVi getUnit(int id);
	void Create(String name);
	void delete(int id);
	void update(int id, String name);
}
