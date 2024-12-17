package com.salesianostriana.dam.resteval;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
public record PlaceDto (Long id,String nombre,String calle,String ciudad,String latitud,String longitud,String descripcion,List<String> tags,String urlImagen){

    public PlaceDto toPlaceDto(Place place){
       place.setAddress(calle + ", " + ciudad);
       place.setCoords(latitud + ", " + longitud);

       return new PlaceDto();
    }


}
