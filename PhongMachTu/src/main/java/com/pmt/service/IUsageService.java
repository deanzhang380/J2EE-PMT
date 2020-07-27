package com.pmt.service;

import java.util.List;

import com.pmt.model.CachDung;

public interface IUsageService {

	List<CachDung> getAll();
	CachDung findById(int id);
	void insert(String name);
	void update(int id, String name);
	void delete(int id);
}
