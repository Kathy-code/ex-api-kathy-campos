package com.nttdata.freetogame;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;

import static net.serenitybdd.rest.SerenityRest.given;

public class ValidarStatusOk {

    private static String URL_CONSULTA = "https://www.freetogame.com/api/games?platform=pc&category=shooter";
    Response response = RestAssured.get(URL_CONSULTA);

    @Test
    public void consultarFreetoGame(){
        if(URL_CONSULTA=="https://www.freetogame.com/api/games?platform=pc&category=shooter"){
           System.out.println("Estoy consultando mediante parámetros PLATFORM y CATEGORY");
        }
        else{
            System.out.println("ERROR 404: Los parámetros de la consulta deberían ser PLATFORM y CATEGORY");
        }
    }

    @Test
    public void validarStatusOk(){
        System.out.println("Status Code : "+ response.getStatusCode());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void imprimoBody(){
        System.out.println("Body ordenado: "+ response.getBody().asPrettyString());
    }

//    @Test
//    public void validarStatus200 (){
//
//        given().
//                get(URL_CONSULTA).
//                then().
//                statusCode(200);
//
//    }

}
