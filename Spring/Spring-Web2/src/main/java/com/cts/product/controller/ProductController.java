package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.Product;

@Controller
public class ProductController {
	
	
	@RequestMapping("s1")
	public ModelAndView m1() {
		
		Product prod=new Product();
	
		prod.setProdId(1024);
		prod.setProdName("Mac Book Pro");
		prod.setPrice(34834);
		
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("display");
		mav.addObject("myProduct",prod);
		
	//	System.out.println("------ m1 method gt called ....");
		
		
		return mav;
	}
	

}
