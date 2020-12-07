package com.crackermarket.app.controllers.category;

import com.crackermarket.app.shopmanagement.entities.Category;
import com.crackermarket.app.shopmanagement.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Category>> showAllCategories() {
        List<Category> categories = categoryService.findAll();
        if(categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if(category == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        categoryService.save(category);
        return new ResponseEntity<>(category, httpHeaders, HttpStatus.CREATED);
    }
}
