package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IMedicineDao;
import com.pmt.mapper.DiseaseMapper;
import com.pmt.mapper.MedicineMapper;
import com.pmt.model.Benh;
import com.pmt.model.Thuoc;

public class MedicineDao extends AbstractDAO<Thuoc> implements IMedicineDao {

	@Override
	public List<Thuoc> getAllListMedicine() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("select * from Thuoc ");
		List<Thuoc> MedicineList = query(sql.toString(), new MedicineMapper(),null);
		return MedicineList;
	}

}
