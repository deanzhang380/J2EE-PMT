package com.pmt.model;

public class ChiTietPhieuKham {
	private PhieuKham phieuKham = new PhieuKham();
	private Thuoc thuoc = new Thuoc();
	private CachDung cachDung = new CachDung();
	private DonVi donVi = new DonVi();
	
	private int maChiTietPhieuKham;
	private int soLuong;
	private int ThanhTien;
	
	public ChiTietPhieuKham() {
		// TODO Auto-generated constructor stub
	}

	public PhieuKham getPhieuKham() {
		return phieuKham;
	}

	public void setPhieuKham(PhieuKham phieuKham) {
		this.phieuKham = phieuKham;
	}

	public Thuoc getThuoc() {
		return thuoc;
	}

	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}

	public CachDung getCachDung() {
		return cachDung;
	}

	public void setCachDung(CachDung cachDung) {
		this.cachDung = cachDung;
	}

	public DonVi getDonVi() {
		return donVi;
	}

	public void setDonVi(DonVi donVi) {
		this.donVi = donVi;
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

	public int getMaChiTietPhieuKham() {
		return maChiTietPhieuKham;
	}

	public void setMaChiTietPhieuKham(int maChiTietPhieuKham) {
		this.maChiTietPhieuKham = maChiTietPhieuKham;
	}

}
