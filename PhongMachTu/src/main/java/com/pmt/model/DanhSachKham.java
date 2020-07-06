package com.pmt.model;

import java.sql.Date;

public class DanhSachKham {
	private String maDanhSachKham;
	private String ngayKham;
	
	public DanhSachKham(String maDanhSachKham, String ngayKham) {
		super();
		this.maDanhSachKham = maDanhSachKham;
		this.ngayKham = ngayKham;
	}
	public String getNgayKham() {
		return ngayKham;
	}
	public void setNgayKham(String ngayKham) {
		this.ngayKham = ngayKham;
	}
	public String getMaDanhSachKham() {
		return maDanhSachKham;
	}
	public void setMaDanhSachKham(String maDanhSachKham) {
		this.maDanhSachKham = maDanhSachKham;
	}
}
