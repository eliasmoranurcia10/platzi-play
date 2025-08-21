package com.example.platzi_play.domain.exception;

public class IdMovieNotExistsException extends RuntimeException{
    public IdMovieNotExistsException(Long idMovie) {
        super("El id: " + idMovie + " no existe");
    }
}
