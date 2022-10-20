package com.backend.fressattacke.controller;

import com.backend.fressattacke.model.Kommentar;
import com.backend.fressattacke.model.Restaurant;
import com.backend.fressattacke.model.User;
import com.backend.fressattacke.service.FressattackeService;
import com.backend.fressattacke.service.KommentarService;
import com.backend.fressattacke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class FressattackeController {

    @Autowired
    public FressattackeService fressattackeService;
    @Autowired
    public KommentarService kommentarService;

    @Autowired
    public UserService userService;

    @PostMapping("/restaurant")
    public void saveRestaurant(@RequestBody Restaurant restaurant) { fressattackeService.addRestaurant(restaurant);}

    @GetMapping("/restaurant/{ID}")
    public Restaurant getRestaurantbyID(@PathVariable(value="ID") Long Id)  { return fressattackeService.findRestaurantById(Id);}

    @GetMapping("/restaurant")
    public List<Restaurant> getRestaurants() { return fressattackeService.getRestaurants();}

    @PostMapping("/kommentar")
    public void saveKommentar(@RequestBody Kommentar kommentar) {
        kommentarService.addKommentar(kommentar);}

    @GetMapping("/kommentar")
    public List<Kommentar> getAllComments() {return kommentarService.getAllComments();}

   @GetMapping("/kommentar/{RestaurantID}")
    public List<Kommentar> getCommentById(@PathVariable(value="RestaurantID") String restaurantID) {
        return kommentarService.getAllCommentsByRestaurantId(restaurantID);
   }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) { userService.addUser(user);}

    @GetMapping("/user/{ID}")
    public User getUserbyID(@PathVariable(value="ID") Long Id)  { return userService.findUserById(Id);}

    @GetMapping("/user")
    public List<User> getUser() { return userService.getUsers();}

}
