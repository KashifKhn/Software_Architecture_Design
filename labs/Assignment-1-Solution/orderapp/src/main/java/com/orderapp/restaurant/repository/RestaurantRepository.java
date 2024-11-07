package com.orderapp.restaurant.repository;

import com.orderapp.restaurant.model.Restaurant;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepository {
  public Restaurant findById(Long id) {
    // Fetch restaurant logic
    return new Restaurant();
  }
}
