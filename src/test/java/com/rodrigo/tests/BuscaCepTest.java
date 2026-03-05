package com.rodrigo.tests;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BuscaCepTest {

    @Test
        void SearchZipCode() {
            given()
            .when()
            .get("https://viacep.com.br/ws/01001000/json/")
                .then()
                .log() .all()
                .statusCode(200)
                .body("logradouro", equalTo("Praça da Sé"))
                ;
            }

        }

        
