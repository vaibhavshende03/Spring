package com.vs.SpringAOP2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.vs.services","com.vs.aspect"})
@EnableAspectJAutoProxy
public class SpringConfigFile {


}
