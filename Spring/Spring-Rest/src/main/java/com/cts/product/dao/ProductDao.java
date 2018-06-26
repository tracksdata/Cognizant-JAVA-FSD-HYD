package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	@Query("from Product")
	List<Product> listAll();
}
