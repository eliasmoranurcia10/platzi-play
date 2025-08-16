package com.example.platzi_play.domain.dto;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        String genre,
        LocalDate releaseData,
        Double rating
) {

}
