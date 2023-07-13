package com.rodion.springboot.domain.entity;

import lombok.Data;

@Data
public abstract class BaseEntity<ID> {
    private ID id;
}
