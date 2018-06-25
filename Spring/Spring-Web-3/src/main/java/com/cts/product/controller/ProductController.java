package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String saveProduct(@ModelAttribute("blabla") Product product,Model data) {

		prodService.saveProduct(product);

		System.out.println("-- Product saved to DB");

		// System.out.println(product.getId()+" "+product.getName()+"
		// "+product.getPrice());
		// System.out.println("--- saving Product with Id: "+prodId+" name: "+prodName+"
		// price: "+price);
		data.addAttribute("msg", "Product saved to DB");
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
	
	
	// find the product in order to update it
	
	
	
	@RequestMapping("updateProduct_v1")
	public ModelAndView updateProduct_v1(@RequestParam("id") int id,@ModelAttribute("pu") Product prod) {
		
		ModelAndView mav=new ModelAndView();
		
		prod= prodService.findProduct(id);
		mav.addObject("product", prod);
		mav.setViewName("updateproduct");
		
		return mav;
		
	}
	
	
	@RequestMapping("productUpdate_v2")
	public String updateproduct_v2(@ModelAttribute() Product product,Model data) {
		
		prodService.updateProduct(product);
		data.addAttribute("msg",product.getName()+" is updated to DB");
		System.out.println("---- Update Called");
		return "home";
	}
	
	
	
	@RequestMapping("deleteProduct")
	public String deleteProduct(@RequestParam("id") int id,Model data) {
		
		prodService.deleteProduct(id);
		
		data.addAttribute("msg",id +" is Deleted from DB");
		return "home";

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
