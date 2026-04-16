package com.SekharSVB.ex_03_RestAssured_TestNG_Advance.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Test
    public void test_POST_NonBDDStyle_Create_Token() {

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.header("","");
        r.body(payload).log().all();

        System.out.println("............Part2.......");

        //Making HTTP Request Part2
        response = r.when().log().all().post();


        System.out.println("..........Part3........");


        //Verification part ->part3

        vr = response.then().log().all();
        vr.statusCode(200);



    }
}
