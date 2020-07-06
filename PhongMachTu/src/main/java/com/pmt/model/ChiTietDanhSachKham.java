package com.pmt.model;

public class ChiTietDanhSachKham {

	private String maBenhNhan;
	private String maDanhSachKham;
	
	public ChiTietDanhSachKham(String maBenhNhan, String maDanhSachKham) {
		super();
		this.maBenhNhan = maBenhNhan;
		this.maDanhSachKham = maDanhSachKham;
	}
	public String getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(String maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}
	public String getMaDanhSachKham() {
		return maDanhSachKham;
	}
	public void setMaDanhSachKham(String maDanhSachKham) {
		this.maDanhSachKham = maDanhSachKham;
	}
	
}
