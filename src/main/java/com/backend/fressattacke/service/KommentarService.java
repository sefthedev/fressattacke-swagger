package com.backend.fressattacke.service;

import com.backend.fressattacke.exception.KommentarNotFoundException;
import com.backend.fressattacke.exception.RestaurantNotFoundException;
import com.backend.fressattacke.model.Kommentar;
import com.backend.fressattacke.model.Restaurant;
import com.backend.fressattacke.repo.KommentarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KommentarService {
    private final KommentarRepo kommentarRepo;

    public KommentarService(KommentarRepo kommentarRepo) {
        this.kommentarRepo = kommentarRepo;
    }

    public Kommentar addKommentar(Kommentar kommentar){
        return kommentarRepo.save(kommentar);
    }
    public List<Kommentar> getAllComments(){ return kommentarRepo.findAll(); }

    public List<Kommentar> getAllCommentsByRestaurantId (String restaurantID) {
        return kommentarRepo.findKommentarsByRestaurantID(restaurantID);
    }

}
