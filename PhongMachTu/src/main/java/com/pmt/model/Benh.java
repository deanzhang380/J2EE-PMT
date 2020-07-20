package com.pmt.model;

public class Benh {
	
	private int maBenh;
	private String tenBenh;
	

	public Benh(int maBenh, String tenBenh) {
		super();
		this.maBenh = maBenh;
		this.tenBenh = tenBenh;
	}
	
	public Benh() {
		// TODO Auto-generated constructor stub
	}

	public String getTenBenh() {
		return tenBenh;
	}
	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}
	
	public int getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(int maBenh) {
		this.maBenh = maBenh;
	}
	
}
