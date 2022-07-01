package com.nttdata.freetogame;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static net.serenitybdd.rest.SerenityRest.given;

public class ValidarStatusError {
    private static String URL_CONSULTA = "https://www.freetogame.com/api/games?platform=pc&category=shootesr";
    Response response = RestAssured.get(URL_CONSULTA);

    @Test
    public void consultarFreetoGame(){
        if(URL_CONSULTA=="https://www.freetogame.com/api/games?platform=pc&category=shooter"){
            System.out.println("Estoy consultando mediante parámetros PLATFORM y CATEGORY");
        }
        else{
            System.out.println("ERROR 404: Los parámetros de la consulta son diefrentes de PLATFORM y CATEGORY");
        }
    }
    @Test
    public void validarStatus404 (){
        System.out.println("Status Code : "+ response.getStatusCode());
        given().
                get(URL_CONSULTA).
                then().
                statusCode(404);
    }
}
