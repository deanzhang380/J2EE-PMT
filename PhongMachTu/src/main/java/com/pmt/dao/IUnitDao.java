package com.pmt.dao;

import java.util.List;

import com.pmt.model.DonVi;

public interface IUnitDao extends IDao<DonVi>{
	List<DonVi> getAllListUnit();
}
