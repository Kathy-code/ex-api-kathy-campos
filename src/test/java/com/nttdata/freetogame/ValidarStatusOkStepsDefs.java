package com.nttdata.freetogame;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ValidarStatusOkStepsDefs {

    @Steps
    ValidarStatusOk validarStatusOk;


    @Given("estoy en la página de FreeToGame")
    public void estoy_en_la_página_de_free_to_game() {
        System.out.println("El usuario está en la pagina de Free to Game");
    }
    @When("consulto mediante los parámetros platform <platform>, category <category>")
    public void consulto_mediante_los_parámetros_platform_platform_category_category() {
        validarStatusOk.consultarFreetoGame();
    }

    @Then("el código de respuesta debe ser <statusCode>")
    public void elCódigoDeRespuestaDebeSerStatusCode() {
        validarStatusOk.validarStatusOk();
    }

    @And("imprimo en pantalla el id y el title de los juegos")
    public void imprimoEnPantallaElIdYElTitleDeLosJuegos() {
        System.out.println("se imprime en pantalla el id y titulos de los juegos obtenidos");
        validarStatusOk.imprimoBody();

    }

    @When("consulto mediante los parámetros platform <platform>, category <otro>")
    public void consultoMedianteLosParámetrosPlatformPlatformCategoryOtro() {
        validarStatusOk.consultarFreetoGame();
    }

    @Then("el código de error debe ser <statusCode>")
    public void elCódigoDeErrorDebeSerStatusCode() {
        validarStatusOk.validarStatus404();
    }
}
