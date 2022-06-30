package com.nttdata.freetogame;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CrearUsuario {

    private static String CREATE_USER = "https://www.freetogame.com/api/games?platform=pc&category=shooter";

    @Step("Crear usuario {0} en PetStore")
    public void crearUsuario(String username, String firstName, String lastName){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \""+username+"\",\n" +
                        "  \"firstName\": \""+firstName+"\",\n" +
                        "  \"lastName\": \""+lastName+"\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .get(CREATE_USER);

    }
}
