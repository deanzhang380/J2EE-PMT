package com.pmt.dao;

import java.util.List;

import com.pmt.model.ThamSo;

public interface IParameterDao {
	ThamSo getTienKham();
	List<ThamSo> getAll();
	void insert(String name, int value);
	void delete(int id);
}
