package com.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation="/com/vs/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		
		
		Student stdStudent=(Student) context.getBean("student");
		stdStudent.display();
	}

}
