package com.crackermarket.app.shopmanagement.services.ServiceImpl;

import com.crackermarket.app.shopmanagement.entities.ParameterValue;
import com.crackermarket.app.shopmanagement.repository.ParameterValueDAO;
import com.crackermarket.app.shopmanagement.services.ParameterValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParameterValueServiceImpl implements ParameterValueService {

    private ParameterValueDAO parameterValueDAO;

    @Autowired
    public ParameterValueServiceImpl (ParameterValueDAO parameterValueDAO) {
        this.parameterValueDAO = parameterValueDAO;
    }

    public ParameterValueServiceImpl() {

    }

    @Override
    public void save(ParameterValue parameterValue) {
        parameterValueDAO.save(parameterValue);
    }

    @Override
    public ParameterValue findById(UUID id) {
        return parameterValueDAO.findById(id);
    }

    @Override
    public List<ParameterValue> findAll() {
        return parameterValueDAO.findAll();
    }

    @Override
    public void delete(ParameterValue parameterValue) {
        parameterValueDAO.delete(parameterValue);
    }
}
