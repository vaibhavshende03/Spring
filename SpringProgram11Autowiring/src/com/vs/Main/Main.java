package com.vs.Main;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vs.beans.Student;
import com.vs.reources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student stdS = (Student) context.getBean(Student.class);
		stdS.display();
	}

}
