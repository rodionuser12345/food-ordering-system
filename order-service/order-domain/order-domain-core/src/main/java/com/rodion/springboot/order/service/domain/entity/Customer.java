package com.rodion.springboot.order.service.domain.entity;


import com.rodion.springboot.domain.entity.AggregateRoot;
import com.rodion.springboot.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
