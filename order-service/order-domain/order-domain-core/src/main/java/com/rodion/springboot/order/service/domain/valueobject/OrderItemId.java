package com.rodion.springboot.order.service.domain.valueobject;


import com.rodion.springboot.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
