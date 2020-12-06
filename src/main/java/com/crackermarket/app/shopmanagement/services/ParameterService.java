package com.crackermarket.app.shopmanagement.services;

import com.crackermarket.app.shopmanagement.entities.Category;
import com.crackermarket.app.shopmanagement.entities.Parameter;

import java.util.List;
import java.util.UUID;

public interface ParameterService {
    public void save(Parameter parameter);
    public Parameter findById(UUID id);
    public List<Parameter> findByName(String name);
    public List<Parameter> findAll();
    public void delete(Parameter parameter);
}
