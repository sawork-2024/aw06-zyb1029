package com.example.webpos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String _id;
    private String price;
    private String category;
    private Integer quantity;
    private String name;
    private Integer stock; 
    private String img;

    public Product() {}

    public Product(String _id, String price, String category, Integer quantity, String name, Integer stock, String img) {
        this._id = _id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.stock = stock;
        this.img = img;
    }
}
