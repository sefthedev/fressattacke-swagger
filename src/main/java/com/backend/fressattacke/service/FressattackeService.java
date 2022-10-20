package com.backend.fressattacke.service;

import com.backend.fressattacke.exception.RestaurantNotFoundException;
import com.backend.fressattacke.model.Restaurant;
import com.backend.fressattacke.repo.FressattackeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service

public class FressattackeService {

    private final FressattackeRepo fressattackeRepo;

    public FressattackeService(FressattackeRepo fressattackeRepo) {
       this.fressattackeRepo = fressattackeRepo;
    }

    public Restaurant addRestaurant(Restaurant restaurant){
        return fressattackeRepo.save(restaurant);
    }

    public Restaurant findRestaurantById(Long id) {
        return fressattackeRepo.findRestaurantById(id).orElseThrow(() -> new RestaurantNotFoundException("Test"));
    }


    public List<Restaurant> getRestaurants() {
        return fressattackeRepo.findAll();
    }
}
