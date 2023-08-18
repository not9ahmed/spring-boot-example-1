package com.notahmed.catsfinder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notahmed.catsfinder.models.Breed;
import com.notahmed.catsfinder.models.Cat;
import com.notahmed.catsfinder.models.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Column;

import java.util.ArrayList;
import java.util.Date;

public record CatDetails (
        Long id,
        String name,
        Breed breed,
        User owner,
        Date birth_date,
        ArrayList<String> images,
        ArrayList<String> toys
){


}
