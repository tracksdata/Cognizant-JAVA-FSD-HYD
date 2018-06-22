package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	
	@RequestMapping("s1")
	public ModelAndView m1() {
		
		String name="Praveen Redy S";
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("one");
		mav.addObject("personName",name);
		
		System.out.println("------ m1 method gt called ....");
		
		
		return mav;
	}
	

}
