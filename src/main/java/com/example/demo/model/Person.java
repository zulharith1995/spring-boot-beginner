package com.example.demo.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Zulharith Zainol
 * Date 29/6/2022
 */
public class Person {

    private final UUID id;
    
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name")  String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    



    
}