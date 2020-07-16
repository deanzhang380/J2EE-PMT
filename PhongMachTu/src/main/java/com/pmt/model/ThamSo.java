package com.pmt.model;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ThamSo {
	private String id;
	private String tenThamSo;
	private int thamSo;
	
	public ThamSo(String id, String tenThamSo, int thamSo) {
		super();
		this.id = id;
		this.tenThamSo = tenThamSo;
		this.thamSo = thamSo;
	}
	
	public ThamSo() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
