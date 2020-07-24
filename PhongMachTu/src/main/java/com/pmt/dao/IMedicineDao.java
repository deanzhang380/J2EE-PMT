package com.pmt.dao;

import java.util.List;

import com.pmt.model.Thuoc;

public interface IMedicineDao extends IDao<Thuoc> {

	List<Thuoc> getAllListMedicine();
	Thuoc getMedicineByID(int ID);
}
