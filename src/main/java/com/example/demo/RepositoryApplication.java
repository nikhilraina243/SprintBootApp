package com.example.demo;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.dao.ProductRepository;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RepositoryApplication extends SpringBootServletInitializer implements CommandLineRunner{

    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RepositoryApplication.class);
	}
  
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(RepositoryApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Product p = new Product();
		p.setName("Maggi");
		p.setCatagory("Food");
		p.setPrice(30.0);

		Product p2 = new Product();
		p2.setName("Chips");
		p2.setCatagory("Snacks");
		p2.setPrice(20.0);
		
		Product p3 = new Product();
		p3.setName("Sause");
		p3.setCatagory("Snacks");
		p3.setPrice(10.0);

		productRepository.save(p);

		productRepository.save(p2);
		
		productRepository.save(p3);

	}
}
