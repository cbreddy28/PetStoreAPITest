package com.petstore.api.httpsVerbs;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseVerb {

    protected RequestSpecification requestSpecification;
    protected String mediaType = "application/json";



    public RequestSpecification setUp(){
        requestSpecification = given()
                .accept(mediaType)
                .contentType(mediaType);
        return requestSpecification;
    }
    
}
