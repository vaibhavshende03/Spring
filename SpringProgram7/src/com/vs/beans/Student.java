package com.vs.beans;

public class Student {
	int rollno;
	String name;
	private Address address;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int roollno) {
		this.rollno = roollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
public void display() {
	System.out.println("Roll No:"+rollno);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
		
	}
	

}
