package com.pmt.model;

public class VaiTro {
	private String id;
	private String tenVaiTro;
	
	public VaiTro(String id, String tenVaiTro) {
		super();
		this.id = id;
		this.tenVaiTro = tenVaiTro;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTenVaiTro() {
		return tenVaiTro;
	}
	public void setTenVaiTro(String tenVaiTro) {
		this.tenVaiTro = tenVaiTro;
	}
}
