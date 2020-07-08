package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBuilder implements WithColor{
    private static String name;
    private String breed;
    private LocalDateTime birthday;
    private String favouriteFood;
    private String colour;

    public static DogBuilder aDog() {
        return new DogBuilder();
    }

    public static DogBuilder aLargeDog() {
        return aDog().ofBreed("Labrador")
                .ofColour("Black");
    }

    public DogBuilder called(String name){
        this.name = name;
        return this;
    }

    public DogBuilder ofBreed(String breed) {
        this.breed = breed;
        return this;}

    public Dog bornOn(LocalDateTime birthday) {
        return new Dog(name, breed, birthday, favouriteFood, colour);
    }

    public DogBuilder withFavouriteFood(String favouriteFood){
        this.favouriteFood = favouriteFood;
        return this;
    }

    @Override
    public DogBuilder ofColour(String colour) {
        this.colour = colour;
        return this;
    }
}
