package com.example.platzi_play.web.controller;

import com.example.platzi_play.domain.dto.MovieDto;
import com.example.platzi_play.domain.service.MovieService;
import com.example.platzi_play.persistence.crud.CrudMovieEntity;
import com.example.platzi_play.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }

    @GetMapping("/{id}")
    public MovieDto getById(@PathVariable long id) {
        return this.movieService.getById(id);
    }
}
