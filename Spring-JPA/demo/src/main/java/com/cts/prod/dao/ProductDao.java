package com.cts.prod.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.prod.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
