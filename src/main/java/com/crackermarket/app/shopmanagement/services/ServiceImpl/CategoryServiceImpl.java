package com.crackermarket.app.shopmanagement.services.ServiceImpl;

import com.crackermarket.app.shopmanagement.entities.Category;
import com.crackermarket.app.shopmanagement.repository.CategoryDAO;
import com.crackermarket.app.shopmanagement.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public CategoryServiceImpl() {

    }

    @Override
    public void save(Category category) {
        categoryDAO.save(category);
    }

    @Override
    public Category findById(UUID id) {
        return categoryDAO.findById(id);
    }

    @Override
    public List<Category> findByName(String name) {
        return categoryDAO.findByName(name);
    }

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    @Override
    public void delete(Category category) {
        categoryDAO.delete(category);
    }
}
