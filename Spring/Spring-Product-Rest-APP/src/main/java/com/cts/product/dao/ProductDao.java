package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	@Query("from Product")
	List<Product> listAll();
	
	@Query("select prod.id,prod.name,prod.price from Product prod where prod.name like %:name%")
	List<Product>findByName(@Param("name") String id);
}
