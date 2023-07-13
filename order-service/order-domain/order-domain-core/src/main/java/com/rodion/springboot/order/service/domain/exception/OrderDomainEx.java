package com.rodion.springboot.order.service.domain.exception;


import com.rodion.springboot.domain.exception.DomainException;

public class OrderDomainEx extends DomainException {

    public OrderDomainEx(String message) {
        super(message);
    }

    public OrderDomainEx(String message, Throwable cause) {
        super(message, cause);
    }
}
