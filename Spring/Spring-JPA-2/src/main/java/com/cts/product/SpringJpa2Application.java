package com.cts.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.product.repository.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories
public class SpringJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@Bean
	public CommandLineRunner test(ProductRepository productRepository) {
	
		return(args)->{
		
			

			
//		Product product=new Product();
//		
//		product.setId(103);
//		product.setName("Mac PC");
//		product.setPrice(125000);
//		
//		productRepository.save(product);
//		System.out.println("----- Product is saved to DB");
			
		
			//----------------------------------------------
			
			
//			Product prod=productRepository.findOne(103);
//			
//			System.out.println("Id: "+prod.getId());
//			System.out.println("Name: "+prod.getName());
//			System.out.println("Price: "+prod.getPrice());
			
			
//			Iterable<Product> prods= productRepository.findAll();
//			Iterator<Product> it= prods.iterator();
//			
//			
//			while(it.hasNext()) {
//				Product prod=it.next();
//				System.out.println("Id: "+prod.getId());
//				System.out.println("Name: "+prod.getName());
//				System.out.println("Price: "+prod.getPrice());
//				System.out.println("---------------------------------");
//				
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	     		
		
		
	};
}

}
