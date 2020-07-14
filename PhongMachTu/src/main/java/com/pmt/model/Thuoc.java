package com.pmt.model;

public class Thuoc {

	private String id;
	private String tenThuoc;
	private int giaThuoc;
	
	public Thuoc(String id, String tenThuoc, int giaThuoc) {
		super();
		this.id = id;
		this.tenThuoc = tenThuoc;
		this.giaThuoc = giaThuoc;
	}
	
	public Thuoc() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public int getGiaThuoc() {
		return giaThuoc;
	}
	public void setGiaThuoc(int giaThuoc) {
		this.giaThuoc = giaThuoc;
	}
}
