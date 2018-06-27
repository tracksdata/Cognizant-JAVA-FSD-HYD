package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	
	//save product
	@Override
	public String saveProduct(Product product) {
		prodDao.save(product);
		return "Product Id " + product.getId() + " is saved to DB";
	}

	// find Product by Id
	@Override
	public Product findById(int id) {
		return prodDao.findOne(id);
	}

	
	// Find all products by Name
	@Override
	public List<Product> findByName(String name) {
		return prodDao.findByName(name);
	}
	
	

	// list all products
	@Override
	public List<Product> listAll() {
		return prodDao.listAll();
	}
	
	

	// Update Product using product Id
	@Override
	public String updateProduct(Product product) {
		prodDao.save(product);
		return product.getId() + " is updated to DB";
	}
	
	

	// Delete product by Id
	@Override
	public String deleteProduct(int id) {
		prodDao.delete(id);
		return id + " is deleted from DB";
	}

}
