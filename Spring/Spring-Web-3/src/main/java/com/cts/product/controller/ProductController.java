package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService prodService;

	// @RequestMapping(value = "saveProduct")
	// public void saveProduct(@RequestParam("id") Integer
	// prodId,@RequestParam("name") String prodName,@RequestParam("price")double
	// price) {
	//
	// System.out.println("--- saving Product with Id: "+prodId+" name: "+prodName+"
	// price: "+price);
	// }

	@RequestMapping(value = "saveProduct")
	public String saveProduct(@ModelAttribute("blabla") Product product) {

		prodService.saveProduct(product);

		System.out.println("-- Product saved to DB");

		// System.out.println(product.getId()+" "+product.getName()+"
		// "+product.getPrice());
		// System.out.println("--- saving Product with Id: "+prodId+" name: "+prodName+"
		// price: "+price);
		return "home";

	}

	@RequestMapping("findProduct")
	public ModelAndView findProduct(@RequestParam("id") int id) {
		ModelAndView mav=new ModelAndView();

		Product prod = prodService.findProduct(id);
		
		mav.addObject("myProduct", prod);
		mav.setViewName("display");

		return mav;
	}
	
	
	@RequestMapping("listAll")
	public ModelAndView listAllproducts() {
		
		ModelAndView mav=new ModelAndView();
		
		List<Product> prods= prodService.listAll();
		
		mav.addObject("products", prods);
		mav.setViewName("listproducts");
		
		return mav;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
