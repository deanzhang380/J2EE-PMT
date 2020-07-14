package com.pmt.model;

public class CachDung {

	private String maCachDung;
	private String cachDung;
	
	public CachDung(String maCachDung, String cachDung) {
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
	public String getMaCachDung() {
		return maCachDung;
	}
	public void setMaCachDung(String maCachDung) {
		this.maCachDung = maCachDung;
	}
}
