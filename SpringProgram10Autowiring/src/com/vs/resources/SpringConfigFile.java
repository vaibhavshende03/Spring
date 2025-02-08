package com.vs.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vs.beans.Address;
import com.vs.beans.Student;
import com.vs.beans.Subject;

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
	public Subject createSubjectobj() {
		Subject subject=new Subject();
		List<String> subjectList=new ArrayList<String>();
		subjectList.add("Java");
		subjectList.add("Python");
		subjectList.add("C++");
				
		subject.setSubjects(subjectList);
		
		return subject;
	}
	
	@Bean
	public Student createStuObj()
	{
		
	Student std=new Student();
	std.setName("Aalok");
	std.setRollno(11);
//	std.setAddress(createAddressobj());  //Manually DI injection
//	std.setSubjects(createSubjectobj()); //Manually DI injection
	
	return std;
	}
}
