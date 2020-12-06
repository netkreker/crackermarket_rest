package com.crackermarket.app.shopmanagement.services.ServiceImpl;

import com.crackermarket.app.shopmanagement.entities.Product;
import com.crackermarket.app.shopmanagement.repository.ProductDAO;
import com.crackermarket.app.shopmanagement.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public ProductServiceImpl() {

    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public Product findById(UUID id) {
        return productDAO.findById(id);
    }

    @Override
    public List<Product>findByName(String name) {
        return productDAO.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void delete(Product product) {
        productDAO.delete(product);
    }
}
