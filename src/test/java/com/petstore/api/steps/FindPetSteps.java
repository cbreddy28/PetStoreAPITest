package com.petstore.api.steps;

import com.petstore.api.model.pet.Pets;
import com.petstore.api.world.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.junit.Assert;

public class FindPetSteps {

    private WorldHelper helper;


    public FindPetSteps(WorldHelper helper) {
        this.helper = helper;
    }

    @Given("^I have access to pet service$")
    public void iHaveAccessToPetService() throws Throwable {
        helper.baseVerb().setUp();
    }

    @When("^I find pet by availability$")
    public void iFindPetByAvailability() throws Throwable {
        String endpoint = "/v2/pet/findByStatus?status=available";
        helper.getVerb().getApi(endpoint);
    }

    @Then("^the pet is available$")
    public void thePetIsAvailable() throws Throwable {

        Response response = helper.getVerb().getResponse();
        Pets[] pets =  response.as(Pets[].class, ObjectMapperType.GSON);
        int numberofDoggie = 0;
        for (Pets pet: pets) {
            if(!pet.getName().equalsIgnoreCase("doggie")) continue;
            numberofDoggie = numberofDoggie+1;
        }
        Assert.assertEquals(numberofDoggie,192);
    }
}
