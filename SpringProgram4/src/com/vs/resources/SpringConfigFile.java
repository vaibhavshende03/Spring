package com.vs.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.vs.beans")
//@ComponentScan({"com.vs.beans","----","----"})  // if we have multiple location 	 
//@ComponentScan(basePackages = {"com.vs.beans"})
public class SpringConfigFile {

}
