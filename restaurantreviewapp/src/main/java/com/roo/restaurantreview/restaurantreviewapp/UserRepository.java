package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Long>{
    
    public UserDTO findByUserName (String userName);

    public UserDTO findByEmail(String email);

    public UserDTO findByUserId(Long userId);
}
