package com.example.webpos.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.webpos.repository.ProductRepository;
import com.example.webpos.model.Product;

@Component
public class DataInitializer implements CommandLineRunner {
    private final ProductRepository repository;

    @Autowired
    public DataInitializer(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            repository.save(new Product( "1", "3", "drink", 16, "cola", 1, "Cola.jpg"));
            repository.save(new Product("2", "4", "drink", 12, "sprite", 1, "Sprite.png"));
            repository.save(new Product("3", "5", "drink", 5, "red bull", 1, "Redbull.jpg"));
            repository.save(new Product("4", "5", "drink", 5, "Milk", 1, "Milk.jpg"));
        }
    }
}
