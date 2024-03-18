package com.roo.restaurantreview.restaurantreviewapp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class DiningReviewDTO {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long reviewId;

    @Getter
    @Setter
    @Column(unique = true,nullable = false)
    private String displayName;

    @Getter
    private Long restaurantId;

    @Getter 
    @Setter
    private int peanutScore ;

    @Getter
    @Setter
    private int eggScore ;
    
    @Getter
    @Setter
    private int dairyScore ;

    @Getter
    @Setter
    private String commentary;

    @Getter
    private enum reviewStatus {
        NEW, ACCEPTED, REJECTED
    }
    

}
