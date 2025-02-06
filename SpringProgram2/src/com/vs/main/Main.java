package com.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vs.beans.Student;
import com.vs.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
//		Student std=(Student)context.getBean("std1");
//		std.display();
		
//		Student std=context.getBean(Student.class);
//		std.display();
		
		
		//--------------------------------
		
		Student std1=(Student) context.getBean("stdObject1");
		std1.display();
		
		System.out.println("-----------------------------");
		
		Student std2=(Student) context.getBean("stdObject2");
		std2.display();
		
	}

}
