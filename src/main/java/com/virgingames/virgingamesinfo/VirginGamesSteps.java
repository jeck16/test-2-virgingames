package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesSteps {
    @Step("Getting all bingo data information")
    public ValidatableResponse getAllBingoInfo() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.GET_ALL_BINGODATA)
                .then();
    }
}
