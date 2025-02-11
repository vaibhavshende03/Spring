package com.vs.SpringJdbcCRUDOperation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vs.beans.Student;
import com.vs.mapper.StudentRowMapper;
import com.vs.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contex=new AnnotationConfigApplicationContext(SpringConfigFile.class);
      JdbcTemplate jdbcTemplate= contex.getBean(JdbcTemplate.class);
      
      
   /* 
     //---------------------Insert Operation---------------------
      
      int rollno=102;int marks=92;String name="Harish";
      String insertQuery="INSERT INTO STUDENT VALUES (?, ?, ?)";
            int rowsAffected=jdbcTemplate.update(insertQuery,rollno,name,marks);
    if (rowsAffected>0) {
		System.out.println("Insert Sucessfully");
	}
      else {
		System.out.println("Insertion Failed");
	}
      
   */
      
      /*
    //-------------Update Operation------------------
      int  marks=90;  int roll=103;
    String updateQuery="UPDATE STUDENT SET std_mark=? WHERE std_roll=?";
    int rowsAffected=jdbcTemplate.update(updateQuery,marks,roll);
    
    if (rowsAffected>0) {
		System.out.println("Update Sucessfully");
	}
      else {
		System.out.println("Updation Failed");
	}
	
	*/
      
      /*
    //-------------Delete Operation------------------

    int droll=101;
    String deleteQuery="DELETE FROM STUDENT WHERE std_roll=?";
    
int drowsAffected=jdbcTemplate.update(deleteQuery,droll);
    
    if (drowsAffected>0) {
		System.out.println("Deleted Sucessfully");
	}
      else {
		System.out.println("Deletion Failed");
	}
    
    
    */
    
      /*
    
    //---------------Select Operation-1---------------
    String selectQuery="SELECT * FROM student";
    List<Student> std= jdbcTemplate.query(selectQuery,new StudentRowMapper());
    for (Student student : std) {
		System.out.println("Name:"+student.getName());
		System.out.println("RollNo:"+student.getRollno());
		System.out.println("Marks:"+student.getMark());
		System.out.println("--------------------------------------");
		
	}
	
	*/
      
      
      /*
    //---------------Select Operation-2---------------
      int roll=103;
      String selectQuery="SELECT * FROM student WHERE std_roll=?";
      List<Student> std= jdbcTemplate.query(selectQuery,new StudentRowMapper(),roll);
      for (Student student : std) {
  		System.out.println("Name:"+student.getName());
  		System.out.println("RollNo:"+student.getRollno());
  		System.out.println("Marks:"+student.getMark());
  		System.out.println("--------------------------------------");
  		
  	}
    */
      
    //---------------Select Operation---------------
      int roll=103;
      String selectQuery="SELECT * FROM student WHERE std_roll=?";
      Student student= jdbcTemplate.queryForObject(selectQuery,new StudentRowMapper(),roll);
       
  		System.out.println("Name:"+student.getName());
  		System.out.println("RollNo:"+student.getRollno());
  		System.out.println("Marks:"+student.getMark());
  		System.out.println("--------------------------------------");
  		
  	
    
    }
}
