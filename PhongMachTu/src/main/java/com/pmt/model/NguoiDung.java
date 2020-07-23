package com.pmt.model;

public class NguoiDung {

	private int maNguoiDung;
	private String user;
	private String pass;
	private String Hoten;
	private VaiTro vaiTro = new VaiTro();
	
	public NguoiDung(int maNguoiDung, String user, String pass, String hoten) {
		super();
		this.maNguoiDung = maNguoiDung;
		this.user = user;
		this.pass = pass;
		Hoten = hoten;
	}
	public NguoiDung() {
		// TODO Auto-generated constructor stub
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public int getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	public VaiTro getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(VaiTro vaiTro) {
		this.vaiTro = vaiTro;
	}
}
