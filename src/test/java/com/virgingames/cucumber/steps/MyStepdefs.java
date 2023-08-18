package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.VirginGamesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class MyStepdefs {

    static ValidatableResponse response;

    @Steps
    VirginGamesSteps virginGamesSteps;


    @When("^I send a Get request$")
    public void iSendAGetRequest() {
        response = virginGamesSteps.getAllBingoInfo();
    }

    @Then("^I get valid response code (\\d+)$")
    public void iGetValidResponseCode(int arg0) {
        response.statusCode(200);
    }

    @And("^I verify currency GBP in bingo data$")
    public void iVerifyCurrencyGBPInBingoData() {
        response.body("data.pots[2].currency", equalTo("GBP"));
    }


    @And("^I verify name is Enterprise in bingo data$")
    public void iVerifyNameBubbleUpBingoVGNInBingoData() {
        response.body("data.pots[2].name", equalTo("Enterprise"));
    }


    @Then("^I verify id (\\d+) is equal to 'CrystalMazeVirgin' in bingo data$")
    public void iVerifyIdIsEqualToCloudVGN(int arg0) {
        response.extract().jsonPath().get("data.pots[4].id").equals("CrystalMazeVirgin");
    }
}
