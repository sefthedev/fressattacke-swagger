package com.backend.fressattacke.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Kommentar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kommentar;
    private String restaurantID;
    private Date datum;

}
