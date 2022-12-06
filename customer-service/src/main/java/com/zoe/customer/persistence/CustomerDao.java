package com.zoe.customer.persistence;

import com.zoe.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository <Customer, Integer> {

    Customer searchCustomerByCustomerId (int customerId);

}
