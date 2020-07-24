package com.pmt.dao;

import java.util.List;

import com.pmt.model.CachDung;

public interface IUsageDao extends IDao<CachDung>{
	List<CachDung> getAllListUsage();
}
