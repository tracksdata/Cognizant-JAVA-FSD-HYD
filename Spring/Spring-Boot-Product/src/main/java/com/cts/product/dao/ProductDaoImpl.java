package com.cts.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository("prodDao")
public class ProductDaoImpl{

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product prod) {
		prodDao.save(prod);
		System.out.println("---- ProductDao: " + prod.getProdName() + " saved to DB");
	}

}
