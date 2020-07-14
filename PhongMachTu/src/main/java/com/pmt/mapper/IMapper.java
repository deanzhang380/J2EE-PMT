package com.pmt.mapper;

import java.sql.ResultSet;

public interface IMapper<T> {
	T mapRow(ResultSet rs);
}
