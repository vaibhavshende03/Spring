package com.vs.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Vaibhav")
	private String name;
	@Value("201")
	private String rollno;
	@Value("abc@gmail.com")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name:"+name+" Roll No.:"+rollno+" Email:"+email);
	}

}
