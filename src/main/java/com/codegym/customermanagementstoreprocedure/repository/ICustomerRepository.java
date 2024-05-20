package com.codegym.customermanagementstoreprocedure.repository;

import com.codegym.customermanagementstoreprocedure.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}