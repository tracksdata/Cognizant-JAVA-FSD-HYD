package com.cts.product.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public interface ProductDao  extends CrudRepository<Product, Integer>{

	void saveProduct(Product prod);

}