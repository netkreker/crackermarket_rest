package com.crackermarket.app.controllers;

import com.crackermarket.app.entities.Category;
import com.crackermarket.app.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    CategoryDAO categoryDAO;
        @GetMapping("/")
        public String mainPage() {

            for (int i = 0; i < 10; i ++) {
                Category category = new Category();
                String name = "Category " + i;
                category.setName(name);
                categoryDAO.saveCategory(category);
            }
            return "index";
        }
}
