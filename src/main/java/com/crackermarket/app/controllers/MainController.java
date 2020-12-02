package com.crackermarket.app.controllers;

import com.crackermarket.app.entities.Category;
import com.crackermarket.app.entities.Parameter;
import com.crackermarket.app.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    CategoryDAO categoryDAO;
        @GetMapping("/")
        public String mainPage() {
            for (int i = 0; i < 3; i ++) {
                String paramName = "Parameter " + i;
                String categoryName = "Category " + i;

                Category category = new Category();
                Parameter parameter = new Parameter();

                category.setName(categoryName);
                parameter.setName(paramName);

                category.addParameter(parameter);
                categoryDAO.saveCategory(category);
            }
            return "index";
        }
}
