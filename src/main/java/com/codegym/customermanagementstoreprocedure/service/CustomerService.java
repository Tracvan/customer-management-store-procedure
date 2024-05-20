package com.codegym.customermanagementstoreprocedure.service;

import com.codegym.customermanagementstoreprocedure.model.Customer;
import com.codegym.customermanagementstoreprocedure.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService  {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}
