package com.example.demo;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.dao.ProductRepository;

@SpringBootApplication
public class RepositoryApplication implements CommandLineRunner{

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

		productRepository.save(p);

		productRepository.save(p2);

	}
}