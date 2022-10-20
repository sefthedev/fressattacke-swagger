package com.backend.fressattacke.repo;

import com.backend.fressattacke.model.Kommentar;
import com.backend.fressattacke.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
