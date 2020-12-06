package com.crackermarket.app.shopmanagement.services.ServiceImpl;

import com.crackermarket.app.shopmanagement.entities.Parameter;
import com.crackermarket.app.shopmanagement.repository.ParameterDAO;
import com.crackermarket.app.shopmanagement.services.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParameterServiceImpl implements ParameterService {

    private ParameterDAO parameterDAO;

    @Autowired
    public ParameterServiceImpl(ParameterDAO parameterDAO) {
        this.parameterDAO = parameterDAO;
    }

    public ParameterServiceImpl() {

    }

    @Override
    public void save(Parameter parameter) {
        parameterDAO.save(parameter);
    }

    @Override
    public Parameter findById(UUID id) {
        return parameterDAO.findById(id);
    }

    @Override
    public List<Parameter> findByName(String name) {
        return parameterDAO.findByName(name);
    }

    @Override
    public List<Parameter> findAll() {
        return null;
    }

    @Override
    public void delete(Parameter parameter) {
        parameterDAO.delete(parameter);
    }
}
