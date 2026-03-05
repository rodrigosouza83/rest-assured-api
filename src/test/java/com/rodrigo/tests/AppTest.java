package com.rodrigo.tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AppTest {

    @Test
    void shouldGetUser() {
        given()
        .when()
            .get("https://jsonplaceholder.typicode.com/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }
}