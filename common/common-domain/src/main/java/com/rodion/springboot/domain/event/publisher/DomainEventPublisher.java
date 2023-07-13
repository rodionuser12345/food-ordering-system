package com.rodion.springboot.domain.event.publisher;


import com.rodion.springboot.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
