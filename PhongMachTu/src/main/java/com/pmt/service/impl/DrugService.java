package com.pmt.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.mysql.cj.Query;
import com.pmt.dao.impl.MedicineDao;
import com.pmt.model.Thuoc;
import com.pmt.service.IDrugService;

public class DrugService implements IDrugService{

	@Inject
	private MedicineDao medicineDao;
	
	@Override
	public List<Thuoc> getAll() {
		return medicineDao.getAllListMedicine();
	}

	@Override
	public void insert(String name, int price) {
		medicineDao.insert(name, price);
		
	}

	@Override
	public void delete(int id) {
		medicineDao.delete(id);	
	}

	@Override
	public Thuoc getById(int Id) {
		// TODO Auto-generated method stub
		return medicineDao.getMedicineByID(Id);
	}

}
