package com.rodion.springboot.order.service.domain.ports.output.message.publisher.restaurantapproval;


import com.rodion.springboot.domain.event.publisher.DomainEventPublisher;
import com.rodion.springboot.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
