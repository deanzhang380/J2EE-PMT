package com.pmt.model;

public class ChiTietDanhSachKham {

	private BenhNhan benhNhan = new BenhNhan();
	private DanhSachKham dsKham = new DanhSachKham();
	
	public ChiTietDanhSachKham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BenhNhan getBenhNhan() {
		return benhNhan;
	}
	public void setBenhNhan(BenhNhan benhNhan) {
		this.benhNhan = benhNhan;
	}
	public DanhSachKham getDsKham() {
		return dsKham;
	}
	public void setDsKham(DanhSachKham dsKham) {
		this.dsKham = dsKham;
	}	
}
