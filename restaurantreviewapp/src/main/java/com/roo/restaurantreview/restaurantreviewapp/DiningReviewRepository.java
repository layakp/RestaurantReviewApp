package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiningReviewRepository extends JpaRepository<DiningReviewDTO,Long> {
    
}
