package com.codegym.customermanagementstoreprocedure.service;

import com.codegym.customermanagementstoreprocedure.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
