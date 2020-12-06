package com.crackermarket.app.shopmanagement.repository;


import com.crackermarket.app.shopmanagement.entities.ParameterValue;
import com.crackermarket.app.shopmanagement.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.UUID;

@Component
public class ProductDAO {

    @Autowired
    EntityManager entityManager;

    public void save(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
    }

    public Product findById(UUID id) {
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().commit();
        return product;
    }

    public List<Product> findByName(String name) {
        List<Product> products = null;
        entityManager.getTransaction().begin();
        products = entityManager.createQuery("SELECT c FROM Category c WHERE c.name = :name")
                .setParameter("name", name).getResultList();
        entityManager.getTransaction().commit();
        return products;
    }
    public List<Product> findAll(){
        List<Product> products = null;
        entityManager.getTransaction().begin();
        products = entityManager.createQuery("SELECT c FROM Category c").getResultList();
        entityManager.getTransaction().commit();
        return products;
    }

    public void update(Product product) {
        entityManager.getTransaction().begin();
        entityManager.merge(product);
        entityManager.getTransaction().commit();
    }

    public void delete(Product product) {
        entityManager.getTransaction().begin();
        entityManager.remove(product);
        entityManager.getTransaction().commit();
    }
}
