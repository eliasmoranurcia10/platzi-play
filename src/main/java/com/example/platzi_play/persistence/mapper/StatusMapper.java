package com.example.platzi_play.persistence.mapper;

import org.mapstruct.Named;

public class StatusMapper {

    @Named("stringToBoolean")
    public static Boolean stringToBoolean(String estado) {
        if (estado==null) return null;

        return switch (estado.toUpperCase()) {
            case "D" -> true;
            case "N" -> false;
            default -> null;
        };
    }

    @Named("booleanToString")
    public static String booleanToString(Boolean status) {
        return status == null ? null : (status ? "D":"N");
    }

}
