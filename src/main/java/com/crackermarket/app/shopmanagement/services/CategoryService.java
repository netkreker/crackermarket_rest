package com.crackermarket.app.shopmanagement.services;

import com.crackermarket.app.shopmanagement.entities.Category;
import com.crackermarket.app.shopmanagement.entities.Product;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    public void save(Category category);
    public Category findById(UUID id);
    public List<Category> findByName(String name);
    public List<Category> findAll();
    public void delete(Category category);
}
