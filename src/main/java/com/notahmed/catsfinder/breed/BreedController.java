package com.notahmed.catsfinder.breed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/breeds")
public class BreedController {


    // what happens to route /breeds ?

    @GetMapping("/")
    public ResponseEntity<List<Breed>> getAllBreeds() {

        List<Breed> breeds = new ArrayList<>();

        breeds.add(new Breed(
                19L,
                "himmie",
                "cute cat",
                null
        ));

        return ResponseEntity.ok(breeds);
    }


    @PostMapping("/")
    public ResponseEntity<String> createBreed() {

        return ResponseEntity.ok("Successfully created");
    }


}
