package com.roo.restaurantreview.restaurantreviewapp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
public class UserDTO {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    private Long userId;

    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
 
    @Getter
    @Setter
    @NotBlank(message = "Name is required")
    @Column(unique = true, nullable = false)
    private  String userName;

    @Getter
    @Setter
    @NotBlank(message = "Email is required")
    @Column(nullable = false)
    private String email;

    @Getter
    @Setter
    @Column(nullable = false)
    @Pattern(regexp=PASSWORD_PATTERN, message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, one special character, and be at least 8 characters long.")
    private String password;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String state;

    @Getter
    @Setter
    private String zipcode;

    @Getter
    @Setter
    private Boolean peanutAllergy;

    @Getter
    @Setter
    private Boolean eggAllergy;

    @Getter
    @Setter
    private Boolean dairyAllergy;

    
}
