package com.salesianostriana.dam.resteval;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
public record PlaceDto {

    private Long id;
    private String nombre;
    private String calle;
    private String ciudad;
    private String latitud;
    private String longitud;
    private String descripcion;
    private List<String> tags;
    private String urlImagen;

    public PlaceDto toPlaceDto(Place place){
       place.setAddress(calle + ", " + ciudad);
       place.setCoords(latitud + ", " + longitud);

       return new PlaceDto();
    }


}
