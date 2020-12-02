package com.crackermarket.app.services;

import com.crackermarket.app.entities.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class ParameterDAO {

    @Autowired
    private EntityManager entityManager;

    public void saveParameter(Parameter parameter) {
        entityManager.getTransaction().begin();
        entityManager.persist(parameter);
        entityManager.getTransaction().commit();
    }
}
