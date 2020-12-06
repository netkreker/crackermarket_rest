package com.crackermarket.app.controllers;

import com.crackermarket.app.entities.*;
import com.crackermarket.app.services.CategoryDAO;
import com.crackermarket.app.services.ParameterDAO;
import com.crackermarket.app.services.ParameterValueDAO;
import com.crackermarket.app.services.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    CategoryDAO categoryDAO;
    @Autowired
    ParameterDAO parameterDAO;
    @Autowired
    ProductDAO productDAO;
    @Autowired
    ParameterValueDAO parameterValueDAO;
        @GetMapping("/")
        public String mainPage() {
            return "index";
        }

        @GetMapping("/test")
        public String test() {
            Category category = new Category();
            category.setName("TV");

            Product product = new Product();
            product.setName("MyTV");

            Parameter parameter = new Parameter();
            parameter.setName("Model");
            parameter.setParameterType(ParameterType.STRING);

            ParameterValue parameterValue = new ParameterValue();
            parameterValue.setParameter(parameter);
            parameterValue.setProduct(product);
            parameterValue.setParameterValue("Samsung QLED");

            product.setCategory(category);
            product.setPrice(BigDecimal.valueOf(14999.99));
            product.setCount(1);

            category.addParameter(parameter);


            categoryDAO.saveCategory(category);
            productDAO.saveProduct(product);
            parameterValueDAO.saveParameterValue(parameterValue);
            return "index";
        }
}
