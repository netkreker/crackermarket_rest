package com.crackermarket.app.shopmanagement.services;

import com.crackermarket.app.shopmanagement.entities.Category;
import com.crackermarket.app.shopmanagement.entities.ParameterValue;

import java.util.List;
import java.util.UUID;

public interface ParameterValueService {
    public void save(ParameterValue parameterValue);
    public ParameterValue findById(UUID id);
    public List<ParameterValue> findAll();
    public void delete(ParameterValue parameterValue);
}
