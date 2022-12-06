package com.zoe.customer.service;


import com.zoe.customer.entity.Customer;

public interface CustomerService {

    Customer searchCustomerByCustomerId (int customerId);
}
