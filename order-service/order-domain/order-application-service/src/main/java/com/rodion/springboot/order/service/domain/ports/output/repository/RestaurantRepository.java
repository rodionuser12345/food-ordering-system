package com.rodion.springboot.order.service.domain.ports.output.repository;


import com.rodion.springboot.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
