package com.pmt.dao;

import java.util.List;
import java.util.Optional;

import com.pmt.mapper.IMapper;

public interface IDao<T> {

	<T> List<T> query(String sql, IMapper<T> mapper, Object... parameters);
	void update (String sql, Object... parameters);
	String insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
	void delete (String sql, Object... parameters);
}
