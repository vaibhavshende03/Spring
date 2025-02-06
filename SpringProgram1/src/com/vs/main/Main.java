package com.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.strategy.StdInstantiatorStrategy;

import com.vs.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String configlocation="/com/vs/resources/applicationContext.xml";
		 ApplicationContext context=new ClassPathXmlApplicationContext(configlocation);
		 
		     
		 /*
		  * //we don't have to create the object to store the values it is manage by the spring
		  The IoC container is responsible to instantiate, configure and assemble the objects. 
		  The IoC container gets informations from the XML file and works accordingly. 
		  */
		 
		 
		 //to get the value we can use the getBean method();
		 	
		Student std1=(Student) context.getBean("stdId1");
		std1.display();
		Student std2=(Student) context.getBean("stdId2");
		std2.display();
	}
 
 
 
}
