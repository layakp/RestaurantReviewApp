package com.roo.restaurantreview.restaurantreviewapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class RestaurantDTO {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long restaurantId;

    @Getter
    @Setter
    private int averageScore;

    @Getter
    @Setter
    private int rating ;

}
