package com.pmt.model;

public class ChiTietPhieuKham {
	private String maPhieuKham;
	private String maThuocString;
	private String maDonVi0;
	private String maCachDung;
	private int soLuong;
	private int ThanhTien;
	
	public ChiTietPhieuKham(String maPhieuKham, String maThuocString, String maDonVi0, String maCachDung, int soLuong,
			int thanhTien) {
		super();
		this.maPhieuKham = maPhieuKham;
		this.maThuocString = maThuocString;
		this.maDonVi0 = maDonVi0;
		this.maCachDung = maCachDung;
		this.soLuong = soLuong;
		ThanhTien = thanhTien;
	}
	
	public String getMaPhieuKham() {
		return maPhieuKham;
	}
	public void setMaPhieuKham(String maPhieuKham) {
		this.maPhieuKham = maPhieuKham;
	}
	public String getMaThuocString() {
		return maThuocString;
	}
	public void setMaThuocString(String maThuocString) {
		this.maThuocString = maThuocString;
	}
	public String getMaDonVi0() {
		return maDonVi0;
	}
	public void setMaDonVi0(String maDonVi0) {
		this.maDonVi0 = maDonVi0;
	}
	public String getMaCachDung() {
		return maCachDung;
	}
	public void setMaCachDung(String maCachDung) {
		this.maCachDung = maCachDung;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(int thanhTien) {
		ThanhTien = thanhTien;
	}

}
