package com.pmt.model;

public class CachDung {

	private int maCachDung;
	private String cachDung;
	
	public CachDung(int maCachDung, String cachDung) {
		super();
		this.maCachDung = maCachDung;
		this.cachDung = cachDung;
	}
	
	public CachDung() {
		// TODO Auto-generated constructor stub
	}

	public String getCachDung() {
		return cachDung;
	}
	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}
	public int getMaCachDung() {
		return maCachDung;
	}
	public void setMaCachDung(int maCachDung) {
		this.maCachDung = maCachDung;
	}
}
