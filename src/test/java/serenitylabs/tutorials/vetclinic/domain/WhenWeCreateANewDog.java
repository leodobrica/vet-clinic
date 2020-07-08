package serenitylabs.tutorials.vetclinic.domain;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class WhenWeCreateANewDog {

//    @Test
//    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
//        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
//
//        Assert.assertEquals("Fido",fido.getName());
//        Assert.assertEquals("Labrador", fido.getBreed());
//        Assert.assertEquals("Black", fido.getColour());
//    }
//
//    @Test
//    public void a_dog_should_be_printed_in_a_readable_form() {
//        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
//
//        assertThat(fido.toString(), is(equalToIgnoringCase("Fido the black Labrador")));
//        assertThat(fido.toString(), startsWith("Fido"));
//        assertThat(fido.toString(), endsWith("labrador"));
//        assertThat(fido.toString(), containsString("black"));
//    }

    @Test
    public void a_dog_have_several_colors() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black", "White");

        assertThat(fido.getColour(), hasItem("Black"));
        assertThat(fido.getColour(), not(hasItem("Red")));
        assertThat(fido.getColour(), hasItems("Black", "White"));
        assertThat(fido.getColour(), contains("Black", "White"));
    }
}
