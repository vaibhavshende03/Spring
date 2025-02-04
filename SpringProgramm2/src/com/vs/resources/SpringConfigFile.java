package com.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Student;

@Configuration
public class SpringConfigFile {
//	@Bean
	@Bean("stdObject1")
	public Student std1() {
		Student std=new Student();
		std.setName("Abhishek");
		std.setRollno("103");
		std.setEmail("abhishek@gmail.com");
		return std;
	}
	@Bean("stdObject2")

	public Student std2() {
		Student std=new Student();
		std.setName("Gaurav");
		std.setRollno("104");
		std.setEmail("gaurav@gmail.com");
		return std;
	}

}
