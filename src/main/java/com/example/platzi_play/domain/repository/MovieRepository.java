package com.example.platzi_play.domain.repository;

import com.example.platzi_play.domain.dto.MovieDto;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
    MovieDto getById(long id);
}
