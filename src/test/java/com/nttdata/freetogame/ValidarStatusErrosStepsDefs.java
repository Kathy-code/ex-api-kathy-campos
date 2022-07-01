package com.nttdata.freetogame;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidarStatusErrosStepsDefs {
    @Steps
    ValidarStatusError validarStatusError;


    @When("consulto mediante los parámetros platform <platform>, category <otro>")
    public void consultoMedianteLosParámetrosPlatformPlatformCategoryOtro() {
        validarStatusError.consultarFreetoGame();
    }

    @Then("el código de error debe ser <statusCode>")
    public void elCódigoDeErrorDebeSerStatusCode() {
        validarStatusError.validarStatus404();
    }
}
