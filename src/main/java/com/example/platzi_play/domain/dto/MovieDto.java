package com.example.platzi_play.domain.dto;

import com.example.platzi_play.domain.Genre;

import java.time.LocalDate;

public record MovieDto(
        Long id,
        String title,
        Integer duration,
        Genre genre,
        LocalDate releaseData,
        Double rating,
        Boolean status
) {

}
