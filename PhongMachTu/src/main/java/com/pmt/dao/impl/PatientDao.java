package com.pmt.dao.impl;
import java.util.List;

import com.pmt.dao.IPatientDao;
import com.pmt.mapper.PatientMapper;
import com.pmt.model.BenhNhan;;
public class PatientDao extends AbstractDAO<BenhNhan> implements IPatientDao{

	@Override
	public String InsertPatient(String ID, String name, String sex, String Address) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("INSERT INTO benhnhan");
		sql.append("VALUES ('?','?','?','?')");
		String newPatient = insert(sql.toString(), ID,name,sex,Address);
		return newPatient;
	}

}
