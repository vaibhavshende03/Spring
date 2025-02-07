package com.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Address;
import com.vs.beans.Student;

@Configuration	
public class SpringConfig {
	@Bean
	public Address createAdddress() {
		Address address=new Address(204,"Mumbai",00000);
		return address;
			}
	@Bean
	public Student createStd()
	{
		Student std=new Student(105,"Ravi",createAdddress());
		return std;
	}
}
