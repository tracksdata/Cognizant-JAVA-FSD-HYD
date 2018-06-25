package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

	@Query(value="from Product")
	List<Product> listAll();
	
//	@Modifying(clearAutomatically = true)
//	@Query("update Product as prod set prod.name =:name,prod.price=:price where prod.id =:id")
//	public void updatePrpduct(@Param("name")String name,@Param("price")double price,@Param("id")int id);
	
	
	
	//void markEntryAsRead(@ModelAttribute() Product prod);
	
	
	

}
