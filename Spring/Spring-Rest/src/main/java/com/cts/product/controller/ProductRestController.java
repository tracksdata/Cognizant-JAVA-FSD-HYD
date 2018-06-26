package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@CrossOrigin
public class ProductRestController {

	@Autowired
	private ProductDao prodDao;

	@GetMapping(value = "s1")
	public String getData() {

		return "Hello How are you?";
	}
	
	
	@PostMapping(value = "s1")
	public String getData1() {

		return "Het Its from Post Maping";
	}
	

	@GetMapping("getProduct")
	public Product getProduct() {
		Product prod = new Product();
		prod.setId(10);
		prod.setName("Book");
		prod.setPrice(1500);

		return prod;
	}

	@GetMapping("listAll")
	public List<Product> listAll() {

		return prodDao.listAll();

	}

}
