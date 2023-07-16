package com.rodion.springboot.order.service.domain.ports.output.message.publisher.payment;


import com.rodion.springboot.domain.event.publisher.DomainEventPublisher;
import com.rodion.springboot.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
