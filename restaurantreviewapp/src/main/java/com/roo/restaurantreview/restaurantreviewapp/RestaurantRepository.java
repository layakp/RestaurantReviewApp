package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantDTO,Long> {
    
}
