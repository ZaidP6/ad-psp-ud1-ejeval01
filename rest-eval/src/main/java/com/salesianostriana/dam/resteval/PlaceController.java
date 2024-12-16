package com.salesianostriana.dam.resteval;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceService service;

    @GetMapping("/")
    public List<Place> getAll(){
        return service.getPlaces();
    }

    @GetMapping("/{id}")
    public Optional<Place> getPlace(@RequestParam Long id){

        return service.getPlace(id);
    }
    @PostMapping("/")
    public Place createPlace(){
        return service.addPlace();
    }
}
