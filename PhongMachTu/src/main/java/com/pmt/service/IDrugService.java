package com.pmt.service;

import java.util.List;

import com.pmt.model.Thuoc;

public interface IDrugService {

	List<Thuoc> getAll();
	Thuoc getById(int Id);
	void delete(int id);
	void insert(String name, int price);
}
