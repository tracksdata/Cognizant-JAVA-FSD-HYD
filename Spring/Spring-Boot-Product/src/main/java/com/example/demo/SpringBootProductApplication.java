package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
//@ComponentScans(value = { @ComponentScan("com.cts.product.dao"), @ComponentScan("com.cts.product.service") })
@ComponentScan(value= {"com.cts.product.dao,com.cts.product.service"})
public class SpringBootProductApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootProductApplication.class, args);

		Product prod = new Product();

		prod.setPrice(666);
		prod.setProdId("P001");
		prod.setProdName("Mac Book Pro");

		//ProductService prodService = ac.getBean("prodService", ProductService.class);
		
		ProductDao  dao=ac.getBean(ProductDao.class);
		//prodService.addProduct(prod);
		dao.save(prod);
		
		

	}
}
