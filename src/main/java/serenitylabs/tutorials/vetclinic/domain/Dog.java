package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {

    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;
    private final String colour;

    public Dog(String name, String breed, LocalDateTime dateOfBirth) {

        this(name, breed, dateOfBirth, null);
    }

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
        this(name, breed, dateOfBirth, favouriteFood, null);
    }

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getColour() {
        return colour;
    }

}
