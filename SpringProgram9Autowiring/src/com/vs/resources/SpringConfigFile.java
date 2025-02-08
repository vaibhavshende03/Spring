package com.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Address;
import com.vs.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddressobj() {
		Address address=new Address();
		
		address.setCity("Delhi");
		address.setHouseno(99);
		address.setPincode(0000000);
		
		return address;
	}
	
	@Bean
	public Student createStuObj()
	{
		
	Student std=new Student();
	std.setName("Aalok");
	std.setRollno(11);
//	std.setAddress(createAddressobj());  //Manually DI injection
	
	return std;
	}
}
