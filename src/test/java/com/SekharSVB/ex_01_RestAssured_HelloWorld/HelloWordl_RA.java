package com.SekharSVB.ex_01_RestAssured_HelloWorld;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HelloWordl_RA {

    @Test
    public void test_RA(){
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(200).log().all();
    }

    @Test
    public void test_RA1(){
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(201).log().all();
    }
    @Test
    public void test_RA2(){
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(202).log().all();
    }
    @Test
    public void test_RA3(){
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(200).log().all();
    }
    @Test
    public void test_RA4(){
        RestAssured.given().baseUri("https://google.com").log().all().when().get().then().statusCode(200).log().all();
    }
}
