package com.pmt.model;

public class PhieuKham {
	
	private DanhSachKham danhSach = new DanhSachKham();
	private BenhNhan benhNhan = new BenhNhan();
	private Benh benh = new Benh();
	private NguoiDung nguoiDung = new NguoiDung();
	private String trieuChung;
	private String ghiChu0;
	private int tongTien;
	private boolean thanhToan;
	
	public PhieuKham() {
		// TODO Auto-generated constructor stub
	}

	public DanhSachKham getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(DanhSachKham danhSach) {
		this.danhSach = danhSach;
	}

	public BenhNhan getBenhNhan() {
		return benhNhan;
	}

	public void setBenhNhan(BenhNhan benhNhan) {
		this.benhNhan = benhNhan;
	}

	public Benh getBenh() {
		return benh;
	}

	public void setBenh(Benh benh) {
		this.benh = benh;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public String getTrieuChung() {
		return trieuChung;
	}

	public void setTrieuChung(String trieuChung) {
		this.trieuChung = trieuChung;
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

	public boolean isThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(boolean thanhToan) {
		this.thanhToan = thanhToan;
	}

}
