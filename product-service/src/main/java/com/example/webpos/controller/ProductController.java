package com.example.webpos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.*;
import com.example.webpos.model.Product;
import com.example.webpos.repository.ProductRepository;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    
    @GetMapping("")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable("id") String _id) {
        return repository.findBy_id(_id);
    }

    @PatchMapping("{id}")
    public Product updateProductQuantity(@PathVariable("id") String id,  @RequestBody Map<String, Integer> requestBody) {
        Integer newQuantity = requestBody.get("quantity");
        Product product = repository.findBy_id(id);
        if (product != null) {
            product.setQuantity(newQuantity);
            repository.save(product);
            return product;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
    }
}
