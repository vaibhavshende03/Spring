package com.vs.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.vs.resources.springConfigFile;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(springConfigFile.class);
        
        NamedParameterJdbcTemplate namedParameterJdbcTemplate= context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("key_rollno", 104);
        map.put("key_name", "Rahul");
        map.put("key_marks", 88);
        String insertQuery="INSERT INTO student VALUES(:key_rollno,:key_name,:key_marks)";
      int rowsAffected=  namedParameterJdbcTemplate.update(insertQuery,map);
      
      if (rowsAffected>0) {
    	  System.out.println("Insertion Success.");
			}
      else {
		System.out.println("Insertion Failed.");
	}
    }
}
