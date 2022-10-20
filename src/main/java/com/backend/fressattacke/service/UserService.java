package com.backend.fressattacke.service;

import com.backend.fressattacke.exception.RestaurantNotFoundException;
import com.backend.fressattacke.model.Restaurant;
import com.backend.fressattacke.model.User;
import com.backend.fressattacke.repo.FressattackeRepo;
import com.backend.fressattacke.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
       this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public User findUserById(Long id) {
        return userRepo.findById(id).get();
    }


    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
