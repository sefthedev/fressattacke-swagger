package com.backend.fressattacke.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String beschreibung;
    private String kontakt;

    // private String anschrift sobald Objekt erstellt wurde // hätte auch als Objekt erstellt werden können aber aktuell zu umständlich daher als String

    private String plz;
    private String stadt;
    private String strasse;

   private String imagePath;



}
