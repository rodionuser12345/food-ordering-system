package com.rodion.springboot.order.service.domain.valueobject;


import com.rodion.springboot.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
