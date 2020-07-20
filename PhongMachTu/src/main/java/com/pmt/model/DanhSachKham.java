package com.pmt.model;

public class DanhSachKham {
	private int maDanhSachKham;
	private String ngayKham;
	
	public DanhSachKham(int maDanhSachKham, String ngayKham) {
		super();
		this.maDanhSachKham = maDanhSachKham;
		this.ngayKham = ngayKham;
	}
	public DanhSachKham() {
		// TODO Auto-generated constructor stub
	}
	public String getNgayKham() {
		return ngayKham;
	}
	public void setNgayKham(String ngayKham) {
		this.ngayKham = ngayKham;
	}
	public int getMaDanhSachKham() {
		return maDanhSachKham;
	}
	public void setMaDanhSachKham(int maDanhSachKham) {
		this.maDanhSachKham = maDanhSachKham;
	}
}
