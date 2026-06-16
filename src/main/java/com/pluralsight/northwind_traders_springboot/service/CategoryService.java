package com.pluralsight.northwind_traders_springboot.service;


import com.pluralsight.northwind_traders_springboot.model.Category;
import com.pluralsight.northwind_traders_springboot.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService (CategoryRepository categoryRepository){
    this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository
    }




}
