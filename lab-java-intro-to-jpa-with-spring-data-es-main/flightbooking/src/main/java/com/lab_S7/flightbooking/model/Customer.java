package com.lab_S7.flightbooking.model;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer totalMileage;

    public Customer () {
    }

    public Customer(String name, CustomerStatus status, Integer totalMileage) {
        this.name = name;
        this.status = status;
        this.totalMileage = totalMileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }
}
