package com.vs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vs.beans.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std=new Student();
		std.setMark(rs.getInt("std_mark"));
		std.setName(rs.getString("std_name"));
		std.setRollno(rs.getInt("std_roll"));
		return std;
	}
	
	

}
