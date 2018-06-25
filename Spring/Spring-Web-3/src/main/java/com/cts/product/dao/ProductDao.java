package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.product.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer>{

	@Query(value="from Product")
	List<Product> listAll();
}
