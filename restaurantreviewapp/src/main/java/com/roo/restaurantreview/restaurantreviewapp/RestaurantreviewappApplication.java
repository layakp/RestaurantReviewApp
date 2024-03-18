package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories   //only required if packages other than base package/subpackages contain jpa repository
public class RestaurantreviewappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantreviewappApplication.class, args);
	}

}
