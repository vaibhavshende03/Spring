package com.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.beans.Student;
import com.vs.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		
		Student stdStudent=(Student) context.getBean("student");
		stdStudent.display();
	}

}
