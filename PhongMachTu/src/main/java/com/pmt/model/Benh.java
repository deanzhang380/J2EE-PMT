package com.pmt.model;

public class Benh {
	
	private String maBenh;
	private String tenBenh;
	

	public Benh(String maBenh, String tenBenh) {
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
	
	public String getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(String maBenh) {
		this.maBenh = maBenh;
	}
	
}
