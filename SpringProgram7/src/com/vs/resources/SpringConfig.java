package com.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Address;
import com.vs.beans.Student;

@Configuration	
public class SpringConfig {
	@Bean
	public Address createAdddress() {
		Address address=new Address();
		address.setHouseno(40);
		address.setCity("Pune");
		address.setPincode(000000);
		return address;
			}
	@Bean
	public Student createStd()
	{
		Student std=new Student();
		
		std.setAddress(createAdddress());
		std.setName("Bob");
		std.setRollno(205);
		
		return std;
	}
}
