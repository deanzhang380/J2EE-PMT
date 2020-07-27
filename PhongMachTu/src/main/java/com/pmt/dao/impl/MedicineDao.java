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
		List<Thuoc> MedicineList = query(sql.toString(), new MedicineMapper());
		return MedicineList;
	}

	@Override
	public Thuoc getMedicineByID(int ID) {
		StringBuilder sql = new StringBuilder("select * from Thuoc Where MaThuoc=?");
		List<Thuoc> MedicineList = query(sql.toString(), new MedicineMapper(),ID);
		return MedicineList.isEmpty() ? null : MedicineList.get(0);
	}

	@Override
	public void delete(int id) {
		StringBuilder sql = new StringBuilder("DELETE FROM thuoc");
		sql.append(" WHERE MaThuoc = ?");
		
		delete(sql.toString(), id);
	}

	@Override
	public void insert(String tenThuoc, int giaTien) {
		StringBuilder sql = new StringBuilder("INSERT INTO thuoc(TenThuoc, GiaThuoc)");
		sql.append("VALUES(?,?)");
		
		insert(sql.toString(), tenThuoc, giaTien);
		
	}

}
