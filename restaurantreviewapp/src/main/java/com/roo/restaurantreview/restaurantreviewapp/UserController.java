package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/profile")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<Long> createProfile(@Valid@RequestBody UserDTO user){
         //after validation successful try saving to database
       
           UserDTO newUser = userService.createUserProfile(user);
           return ResponseEntity.ok().body(newUser.getUserId());
     
    }

    @GetMapping("/{userName}")
    public  ResponseEntity<UserDTO> getProfile(@PathVariable String userName){
         
              UserDTO user = userService.getUserProfile(userName);
              return ResponseEntity.ok().body(user);
        
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<?> updateProfile(@RequestBody UserDTO user, @PathVariable long userId){
    
        if(user.getUserName()!=null){
            throw new RuntimeException("Username cannot be modified");
        }
          userService.updateProfile(user, userId);
   
        return ResponseEntity.ok().build();
         
    }
    
}
