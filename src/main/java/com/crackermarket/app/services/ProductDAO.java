package com.crackermarket.app.services;


import com.crackermarket.app.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class ProductDAO {

    @Autowired
    EntityManager entityManager;

    public void saveProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
    }
}
