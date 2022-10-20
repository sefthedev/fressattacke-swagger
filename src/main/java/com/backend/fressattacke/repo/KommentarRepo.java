package com.backend.fressattacke.repo;

import com.backend.fressattacke.model.Kommentar;
import com.backend.fressattacke.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KommentarRepo extends JpaRepository<Kommentar, Long> {

    List<Kommentar> findKommentarsByRestaurantID (String RestaurantId);


}
