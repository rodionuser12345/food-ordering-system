package com.rodion.springboot.order.service.domain.ports.output.message.publisher.payment;

import com.rodion.springboot.domain.event.publisher.DomainEventPublisher;
import com.rodion.springboot.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
