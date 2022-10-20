package com.backend.fressattacke.exception;

public class KommentarNotFoundException extends RuntimeException{

    public KommentarNotFoundException(String message) {
        super(message);
    }
}
