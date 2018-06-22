package com.cts.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.cts.product.entities.Product;

public interface ProductRepository extends Repository<Product, Integer> {
	
// need to provide all built in abstract methods
	
	@Query("select prod.id,prod.name,prod.price from Product as prod where prod.name=?")
	List<Product> findAllByName();
	
	
}
