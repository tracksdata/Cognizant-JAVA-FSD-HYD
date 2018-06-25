package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product product);

	List<Product> listAll();

	void deleteProduct(int id);

	Product findProduct(int id);

	void updateProduct(Product product);
	// void updateProduct(String name,double price,int id);

}