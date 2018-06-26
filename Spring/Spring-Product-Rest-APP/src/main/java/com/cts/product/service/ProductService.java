package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	// save product
	String saveProduct(Product product);

	// find Product by Id
	Product findById(int id);

	// Find all products by Name
	List<Product> findByName(String name);

	// list all products
	List<Product> listAll();

	// Update Product using product Id
	String updateProduct(Product product);

	// Delete product by Id
	String deleteProduct(int id);

}