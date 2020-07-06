package com.pmt.model;

public class PhieuKham {
	
	private String maDanhSachKham;
	private String maBenhNhan;
	private String maBenh;
	private String maNguoiDung;
	private String trieuChung0;
	private String ghiChu0;
	private int tongTien;
	private Boolean thanhToan;
	
	public PhieuKham(String maDanhSachKham, String maBenhNhan, String maBenh, String maNguoiDung, String trieuChung0,
			String ghiChu0, int tongTien, Boolean thanhToan) {
		super();
		this.maDanhSachKham = maDanhSachKham;
		this.maBenhNhan = maBenhNhan;
		this.maBenh = maBenh;
		this.maNguoiDung = maNguoiDung;
		this.trieuChung0 = trieuChung0;
		this.ghiChu0 = ghiChu0;
		this.tongTien = tongTien;
		this.thanhToan = thanhToan;
	}
	
	public String getMaDanhSachKham() {
		return maDanhSachKham;
	}
	public void setMaDanhSachKham(String maDanhSachKham) {
		this.maDanhSachKham = maDanhSachKham;
	}
	public String getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(String maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}
	public String getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(String maBenh) {
		this.maBenh = maBenh;
	}
	public String getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(String maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	public String getTrieuChung0() {
		return trieuChung0;
	}
	public void setTrieuChung0(String trieuChung0) {
		this.trieuChung0 = trieuChung0;
	}
	public String getGhiChu0() {
		return ghiChu0;
	}
	public void setGhiChu0(String ghiChu0) {
		this.ghiChu0 = ghiChu0;
	}
	public int getTongTien() {
		return tongTien;
	}
	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
	public Boolean getThanhToan() {
		return thanhToan;
	}
	public void setThanhToan(Boolean thanhToan) {
		this.thanhToan = thanhToan;
	}
}
