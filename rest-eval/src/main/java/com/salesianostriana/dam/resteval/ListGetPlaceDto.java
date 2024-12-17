package com.salesianostriana.dam.resteval;

import java.util.List;

public record ListGetPlaceDto(
        long count,
        List<GetPlaceDto> items
) {

    public static ListGetPlacedto of(List<Place> list){
        return new ListGetPlaceDto(
                list.size(),
                list.stream()
                        .map(GetPlaceDto::of)
                        .toList()
        );
    }
}