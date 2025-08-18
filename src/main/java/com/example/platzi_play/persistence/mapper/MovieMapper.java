package com.example.platzi_play.persistence.mapper;

import com.example.platzi_play.domain.dto.MovieDto;
import com.example.platzi_play.persistence.entity.MovieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, StatusMapper.class})
public interface MovieMapper {
    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "duracion", target = "duration")
    @Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
    @Mapping(source = "fechaEstreno", target = "releaseData")
    @Mapping(source = "clasificacion", target = "rating")
    @Mapping(source = "estado", target = "status", qualifiedByName = "stringToBoolean")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDto(Iterable<MovieEntity> entities);

    @InheritInverseConfiguration
    @Mapping(source = "genre", target = "genero", qualifiedByName = "genreToString")
    @Mapping(source = "status", target = "estado", qualifiedByName = "booleanToString")
    MovieEntity toEntity(MovieDto movieDto);
}
