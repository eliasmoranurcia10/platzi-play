package com.example.platzi_play.domain.dto;

import com.example.platzi_play.domain.Genre;

import java.time.LocalDate;

public record UpdateMovieDto(
        String title,
        LocalDate releaseData,
        Double rating,
        Boolean status
) {

}
