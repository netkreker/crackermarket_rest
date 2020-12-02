package com.crackermarket.app.controllers.category;

import com.crackermarket.app.entities.Category;
import com.crackermarket.app.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping
    public List<Category> listCategories() {
        return categoryDAO.findAllCategories();
    }
}
