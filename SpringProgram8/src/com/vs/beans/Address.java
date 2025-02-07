package com.vs.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	
	
	
	public Address(int houseno, String city, int pincode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "houseno=" + houseno + ", city=" + city + ", pincode=" + pincode ;
	}
	
	
	
}
