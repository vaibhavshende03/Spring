package com.vs.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class springConfigFile {
	@Bean

	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource myDataSource=new DriverManagerDataSource();
		myDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		myDataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
		myDataSource.setUsername("root");
		myDataSource.setPassword("Admin@123");
		
		return myDataSource;
	}
	
	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate() {
		
		return new NamedParameterJdbcTemplate(myDataSource());
	}
}
