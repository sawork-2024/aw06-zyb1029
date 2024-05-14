package com.example.webpos.controller;

import com.example.webpos.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @GetMapping("")
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setId("1711853606");
        category.setName("drink");
        category.set_id(1711853606);
        categories.add(category);
        return categories;
    }
}
