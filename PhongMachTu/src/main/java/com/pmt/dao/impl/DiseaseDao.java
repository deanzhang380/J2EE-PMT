package com.pmt.dao.impl;

import java.util.List;

import com.pmt.dao.IDiseaseDao;
import com.pmt.mapper.DiseaseMapper;
import com.pmt.mapper.PatientMapper;
import com.pmt.model.Benh;
import com.pmt.model.BenhNhan;

public class DiseaseDao extends AbstractDAO<Benh> implements IDiseaseDao {

	@Override
	public List<Benh> getAllListDisease() {
		StringBuilder sql = new StringBuilder("select benh.* from benh ");
		List<Benh> DiseaseList = query(sql.toString(), new DiseaseMapper(),null);
		return DiseaseList;
	}

	@Override
	public Benh getDieaseByID(String ID) {
		StringBuilder sql = new StringBuilder("select benh.* from benh where benh.MaBenh=? ");
		List<Benh> DiseaseList = query(sql.toString(), new DiseaseMapper(),ID);
		return DiseaseList.isEmpty()?null:DiseaseList.get(0);
	}

}
