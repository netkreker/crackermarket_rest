package com.crackermarket.app.controllers.category;

import com.crackermarket.app.entities.Category;
import com.crackermarket.app.services.CategoryDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.type.MetaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryDAO categoryDAO;

//    @GetMapping
//    public List<Category> listCategories() throws JsonProcessingException {
//        List<Category> categories = categoryDAO.findAllCategories();
//        return categories;
//    }
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryDAO.findAllCategories();
        if(categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
