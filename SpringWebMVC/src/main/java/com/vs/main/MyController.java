package com.vs.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	 
//	@RequestMapping(value ="/helloPage", method=RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHellopage() {
	System.out.println("openHelloPage() method executed");
	ModelAndView mv=new ModelAndView("hello");
	
//	mv.setViewName("hello");
	return mv;
	}
	
	@GetMapping("/about")
	
	public String OpenAboutUsPage() {
		
		return "about";
	}

}
