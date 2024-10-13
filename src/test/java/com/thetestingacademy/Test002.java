package com.thetestingacademy;

import io.restassured.RestAssured;

public class Test002 {
    public static void main(String[] args) {
        System.out.println("GET Request Demo");

        RestAssured


                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/booking/1")
                .when()
                .get()
                .then()
                .statusCode(200);
    }
}