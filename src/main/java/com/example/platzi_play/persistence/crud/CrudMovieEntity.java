package com.example.platzi_play.persistence.crud;

import com.example.platzi_play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

    MovieEntity findFirstByTitulo(String titulo);
}
