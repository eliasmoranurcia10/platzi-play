package com.example.platzi_play.web.controller;

import com.example.platzi_play.domain.dto.MovieDto;
import com.example.platzi_play.domain.dto.SuggestRequestDto;
import com.example.platzi_play.domain.dto.UpdateMovieDto;
import com.example.platzi_play.domain.service.MovieService;
import com.example.platzi_play.domain.service.PlatziPlayAiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movies", description = "Operaciones acerca de películas de PlatziMovies")
public class MovieController {

    private final MovieService movieService;
    private final PlatziPlayAiService aiService;

    public MovieController(MovieService movieService, PlatziPlayAiService aiService) {
        this.movieService = movieService;
        this.aiService = aiService;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        return ResponseEntity.ok(this.movieService.getAll());
    }

    @Operation(
            summary = "Obtener una película por su identificador",
            description = "Retorna la película que coincida con el identificador enviado",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Película encontrada"),
                    @ApiResponse(responseCode = "404", description = "Película no encontrada", content = @Content),
            }
    )
    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(
            @Parameter(description = "Identificador de la película a recuperar", example = "9")
            @PathVariable long id
    ) {
        MovieDto movieDto = this.movieService.getById(id);
        if(movieDto == null) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movieDto);
    }

    @PostMapping("/suggest")
    public ResponseEntity<String> generateMoviesSuggestion(
            @RequestBody SuggestRequestDto suggestRequestDto
    ) {
        return ResponseEntity.ok(this.aiService.generateMoviesSuggestion(suggestRequestDto.userPreferences()));
    }

    @PostMapping
    public ResponseEntity<MovieDto> add(@RequestBody @Valid MovieDto movieDto) {
        MovieDto movieDtoResponse = this.movieService.add(movieDto);
        return ResponseEntity.status(HttpStatus.CREATED).body( movieDtoResponse );
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> update(
            @PathVariable long id,
            @RequestBody @Valid UpdateMovieDto updateMovieDto
    ) {
        return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        this.movieService.delete(id);
        return ResponseEntity.ok().build();
    }
}
