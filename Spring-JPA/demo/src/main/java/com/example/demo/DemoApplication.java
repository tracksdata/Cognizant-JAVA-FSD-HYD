package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.prod.dao.ProductDao;
import com.cts.prod.entity.Product;

@ComponentScan({"com.cts.prod.dao"})
@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);

		Product prod = new Product();
		prod.setProdId(100);
		prod.setProdName("Mac Book Pro");
		prod.setPrice(228000);
		
		ProductDao prodDao=ac.getBean(ProductDao.class);
		prodDao.save(prod);
		
		
		
		
		

	}
}
