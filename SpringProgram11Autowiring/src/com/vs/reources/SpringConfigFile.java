package com.vs.reources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Address;
import com.vs.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj1() {
		Address address = new Address();
		address.setCity("Delhi");
		address.setHouseno(100);
		address.setPincode(123456);
		return address;
	}
	
	@Bean
	public Address createAddObj2() {
		Address address = new Address();
		address.setCity("Mumbai");
		address.setHouseno(200);
		address.setPincode(654321);
		return address;
	}
	
	
	
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setRollno(1001);
		std.setName("Kumar");
		
		return std;
	}

}
