package com.pmt.model;

public class BenhNhan {

	private int maBenhNhan;
	private String Hoten;
	private String gioiTinh;
	private String diaChi;
	
	public BenhNhan(int maBenhNhan, String hoten, String gioiTinh, String diaChi) {
		super();
		this.maBenhNhan = maBenhNhan;
		Hoten = hoten;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public BenhNhan() {
		// TODO Auto-generated constructor stub
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(int maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}
	

}
