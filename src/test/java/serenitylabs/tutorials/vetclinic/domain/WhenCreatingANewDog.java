package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() {
        LocalDateTime birthday = LocalDateTime.now();
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .bornOn(birthday);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_an_optional_favorite_food() {
        LocalDateTime birthday = LocalDateTime.now();
        Dog fido = DogBuilder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .withFavouriteFood("pizza")
                .bornOn(birthday);

        Assert.assertEquals("pizza", fido.getFavouriteFood());
    }

    @Test
    public void a_new_dog_should_have_a_breed_a_colour_and_a_date_of_birth() {
        LocalDateTime birthday = LocalDateTime.now();
        Dog fido = DogBuilder.aDog()
                    .called("Fido")
                    .ofBreed("Poodle")
                    .withFavouriteFood("pizza")
                    .ofColour("Black")
                    .bornOn(birthday);

        Assert.assertEquals("Black", fido.getColour());
    }

    @Test
    public void a_large_dog_is_black() {
        LocalDateTime birthday = LocalDateTime.now();
        Dog scot = DogBuilder.aLargeDog()
                .called("Fido")
                .withFavouriteFood("pizza")
                .bornOn(birthday);

        Assert.assertEquals("Labrador", scot.getBreed());
        Assert.assertEquals("Black", scot.getColour());
    }
}
