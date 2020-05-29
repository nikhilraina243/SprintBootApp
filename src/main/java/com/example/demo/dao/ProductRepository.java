package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by nikhirai on 5/28/2020.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,String>{
}