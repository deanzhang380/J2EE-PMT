package com.pmt.model;

public class BenhNhan {

	private String maBenhNhan;
	private String Hoten;
	private String gioiTinh;
	private String diaChi;
	
	public BenhNhan(String maBenhNhan, String hoten, String gioiTinh, String diaChi) {
		super();
		this.maBenhNhan = maBenhNhan;
		Hoten = hoten;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
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
	public String getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(String maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}
	

}
