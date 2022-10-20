package com.backend.fressattacke.repo;

import com.backend.fressattacke.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FressattackeRepo extends JpaRepository<Restaurant, Long> {

     Optional<Restaurant> findRestaurantById(Long Id);
}


