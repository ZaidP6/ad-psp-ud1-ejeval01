package com.salesianostriana.dam.resteval;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository repository;


    public List<Place> getPlaces(){
        return repository.getAll();
    }

    public Optional<Place> getPlace(Long id){
        return Optional.ofNullable(repository.get(id).orElseThrow(() ->
                new IllegalArgumentException("El lugar con id: " + id + " no se ha encontrado.")));

    }

    public Place addPlace(){

        return new Place(

        )
    }


}
