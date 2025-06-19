package com.lab_S7.flightbooking.repository;


import com.lab_S7.flightbooking.model.Customer;
import com.lab_S7.flightbooking.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface CustomerRepository extends JpaRepository<Customer, Long> {
        List<Customer> findByStatus(CustomerStatus status);

}
