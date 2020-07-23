package com.pmt.dao;

import java.util.List;

import com.pmt.model.Benh;

public interface IDiseaseDao {
	List<Benh> getAllListDisease();
	Benh getDieaseByID(String ID);
}
