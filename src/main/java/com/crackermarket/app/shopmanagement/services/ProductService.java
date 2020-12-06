package com.crackermarket.app.shopmanagement.services;

import com.crackermarket.app.shopmanagement.entities.ParameterValue;
import com.crackermarket.app.shopmanagement.entities.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    public void save(Product product);
    public Product findById(UUID id);
    public List<Product> findByName(String name);
    public List<Product> findAll();
    public void delete(Product product);
}
