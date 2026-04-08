package com.SekharSVB.ex_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWorld {

    @Test
    public void testHelloWorld(){

        // RestAssured
        // Given
        //When
        //Then

        RestAssured
                // Step 1- re- Req
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                // Step 2- Action
                .when()
                .get()
                // Step 3- Validation
                .then()
                .statusCode(201);

    }

    @Test
    public void testHelloWorld_Positive(){

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/ping")
                .when()
                    .get()
                .then()
                .statusCode(200);
    }
}
