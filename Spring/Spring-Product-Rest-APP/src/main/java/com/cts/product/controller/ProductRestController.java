package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	private ProductService prodService;

	// list all products from DB
	@GetMapping("/product/")
	public ResponseEntity<List<Product>> listAll() {

		return new ResponseEntity<List<Product>>(prodService.listAll(), HttpStatus.OK);
	}

	// find One Product by Id
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> findById(@PathVariable("id") int id) {
		return new ResponseEntity<Product>(prodService.findById(id), HttpStatus.OK);
	}

	// find Products By Name
	@GetMapping("/product/byName/{name}")
	public ResponseEntity<List<Product>> findByName(@PathVariable("name") String name) {
		return new ResponseEntity<>(prodService.findByName(name), HttpStatus.OK);
	}

	// Save product to DB

	@PostMapping("/product/")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<String>(prodService.saveProduct(product), HttpStatus.OK);
	}

	// Update Product
	@PutMapping("/product/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody Product product) {

		return new ResponseEntity<String>(prodService.updateProduct(product), HttpStatus.OK);
	}

	// Delete product
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		return new ResponseEntity<String>(prodService.deleteProduct(id), HttpStatus.OK);
	}

}
