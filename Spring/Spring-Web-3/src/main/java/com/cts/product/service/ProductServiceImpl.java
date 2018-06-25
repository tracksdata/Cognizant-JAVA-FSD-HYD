package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;

	@Override
	public void saveProduct(Product product) {
		prodDao.save(product);
	}

	@Override
	public List<Product> listAll() {
		
		//prodDao.
		
		return prodDao.listAll();
	}

	@Override
	public void deleteProduct(int id) {

	}

	@Override
	public Product findProduct(int id) {
		return prodDao.findOne(id);
	}

	@Override
	public void updateProduct(Product product) {

	}
}
