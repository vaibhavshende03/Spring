package com.vs.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.vs.beans")
//@ComponentScan({"com.vs.beans","----","----"})  // if we have multiple location 	 
public class SpringConfigFile {

}
