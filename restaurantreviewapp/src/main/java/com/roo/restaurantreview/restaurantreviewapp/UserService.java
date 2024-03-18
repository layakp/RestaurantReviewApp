package com.roo.restaurantreview.restaurantreviewapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micrometer.common.util.StringUtils;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUserProfile(UserDTO user) {

        if (userRepository.findByUserName(user.getUserName()) != null) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("email already exists");
        }
        return userRepository.save(user);

    }

    public UserDTO getUserProfile(String userName) {
        if (userRepository.findByUserName(userName) != null) {
            return userRepository.findByUserName(userName);
        } else {
            throw new RuntimeException("user not found");
        }
    }

    public UserDTO updateProfile(UserDTO updatedUser, Long userId) {

        if (updatedUser == null) {
            throw new RuntimeException("User object is null");
        }

        if (userRepository.existsById(userId)) {
            UserDTO existingUser = userRepository.findByUserId(userId);
            if (StringUtils.isNotBlank(updatedUser.getEmail())) {
                existingUser.setEmail(updatedUser.getEmail());
            }
            if (StringUtils.isNotBlank(updatedUser.getCity())) {
                existingUser.setCity(updatedUser.getCity());
            }
            if (StringUtils.isNotBlank(updatedUser.getState())) {
                existingUser.setState(updatedUser.getState());
            }
            if (StringUtils.isNotBlank(updatedUser.getZipcode())) {
                existingUser.setZipcode(updatedUser.getZipcode());
            }
            if(updatedUser.getPeanutAllergy()!=null){
                existingUser.setPeanutAllergy(updatedUser.getPeanutAllergy());;
            }
            if(updatedUser.getDairyAllergy()!=null){
                existingUser.setDairyAllergy(updatedUser.getDairyAllergy());;
            }
            if(updatedUser.getEggAllergy()!=null){
                existingUser.setEggAllergy(updatedUser.getEggAllergy());;
            }
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("User not found");
        }
    }

}