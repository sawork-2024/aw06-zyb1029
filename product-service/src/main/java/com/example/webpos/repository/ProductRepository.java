package com.example.webpos.repository;
import  com.example.webpos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository
  extends JpaRepository<Product, Long> {
    Product findBy_id(String _id);
   }