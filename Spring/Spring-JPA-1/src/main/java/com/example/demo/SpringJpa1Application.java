package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.example.demo.repository"})
public class SpringJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpa1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner test(ProductRepository productRepository) {
		return (args)->{
			
			Product product=new Product();
			product.setId(1111);
			product.setName("Laptop");
			
			productRepository.save(product);
			System.out.println("saved..");
			
		};
	}
	
}
