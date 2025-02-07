package com.vs.beans;

public class Student {
	int rollno;
	String name;
	private Address address;
	
	
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	
public void display() {
	System.out.println("Roll No:"+rollno);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
		
	}
	

}
