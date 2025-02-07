package com.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vs.beans.Student;
import com.vs.resources.SpringConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std=(Student)context.getBean(Student.class);
		std.display();
	}

}
