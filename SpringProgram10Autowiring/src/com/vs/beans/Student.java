package com.vs.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private  String name;
	private int rollno;
	
	@Autowired
	private Address address;
	@Autowired
	private Subject subjects;
	
	
	public Subject getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("Name:"+name+" RollNo:"+rollno+ " Adderess:"+ address);
		System.out.println("Subjects:"+subjects);
	}
	

}
