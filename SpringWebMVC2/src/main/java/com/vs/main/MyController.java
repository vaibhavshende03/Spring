package com.vs.main;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vs.beans.User;

import jakarta.servlet.http.HttpServletRequest;

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
	@GetMapping("/myform")
	public String openmyfromString() {
		return "myform";
	}
	
//	@PostMapping("/submitform")
//	public String handlermyformString(HttpServletRequest request) {
//		String name=request.getParameter("name");
//		String email=request.getParameter("email");
//		String phoneno=request.getParameter("phoneno");
//		
//		System.out.println("name:"+name+" email:"+email
//				+ " Phone No:"+phoneno);
//
//		return "profile";
//	}
	

//	@PostMapping("/submitform")
//	public String handlermyformString(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("phoneno") String phoneNo,Model model) {
//		
//		System.out.println("Name:"+name);
//		System.out.println("Email:"+email);
//		System.out.println("PhoneNo:"+phoneNo);
//		
//		model.addAttribute("model_name", name);
//		model.addAttribute("model_email", email);
//		model.addAttribute("model_ph", phoneNo);
//
//
//		return "profile";
//	}
	
//	
//	@PostMapping("/submitform")
//	public String handlermyformString(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("phoneno") String phoneNo,Model model) {
//		
//		System.out.println("Name:"+name);
//		System.out.println("Email:"+email);
//		System.out.println("PhoneNo:"+phoneNo);
//		
//		User user=new User();
//		user.setName(name);
//		user.setEmail(email);
//		user.setPhoneNo(phoneNo)
//;		model.addAttribute("model_user", user);
//		
//
//		return "profile";
//	}
	

	@PostMapping("/submitform")
	
//	public String handlermyformString(@ModelAttribute("model_user") User user) 

	public String handlermyformString(@ModelAttribute User user) {
		System.out.println("Name:"+user.getName());
		System.out.println("Email:"+user.getEmail());
		System.out.println("PhoneNo:"+user.getPhoneno());
		
	
		

		return "profile";
	}

}
