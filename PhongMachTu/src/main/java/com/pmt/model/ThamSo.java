package com.pmt.model;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ThamSo {
	private int id;
	private String tenThamSo;
	private int thamSo;
	
	public ThamSo(int id, String tenThamSo, int thamSo) {
		super();
		this.id = id;
		this.tenThamSo = tenThamSo;
		this.thamSo = thamSo;
	}
	
	public ThamSo() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenThamSo() {
		return tenThamSo;
	}
	public void setTenThamSo(String tenThamSo) {
		this.tenThamSo = tenThamSo;
	}
	public int getThamSo() {
		return thamSo;
	}
	public void setThamSo(int thamSo) {
		this.thamSo = thamSo;
	}

}
