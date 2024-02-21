package com.java.user.entities;



public class Hotel {
	
	private String hId;

	private String hName;

	private String hLocation;

	private String hAbout;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String hId, String hName, String hLocation, String hAbout) {
		super();
		this.hId = hId;
		this.hName = hName;
		this.hLocation = hLocation;
		this.hAbout = hAbout;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethLocation() {
		return hLocation;
	}

	public void sethLocation(String hLocation) {
		this.hLocation = hLocation;
	}

	public String gethAbout() {
		return hAbout;
	}

	public void sethAbout(String hAbout) {
		this.hAbout = hAbout;
	}

}
