package com.pmt.service;

import java.util.List;

import com.pmt.model.DonVi;

public interface IUnitService {

	List<DonVi> getAll();
	DonVi findById(int id);
	void insert(String name);
	void update(int id, String name);
	void delete(int id);
}
