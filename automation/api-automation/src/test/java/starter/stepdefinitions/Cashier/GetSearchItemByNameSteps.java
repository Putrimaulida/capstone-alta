package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetSearchItemByNamePage;

public class GetSearchItemByNameSteps {
    @Steps
    GetSearchItemByNamePage getSearchItemByNamePage;
    @Given("cashier has api endpoint get search item by name")
    public void cashierHasApiEndpointGetSearchItemByName() {
        getSearchItemByNamePage.cashierHasApiEndpointGetSearchItemByName();
    }

    @When("cashier send HTTP request get search item by name")
    public void cashierSendHTTPRequestGetSearchItemByName() {
        getSearchItemByNamePage.cashierSendHTTPRequestGetSearchItemByName();
    }

    @And("cashier validate response body get search item by name")
    public void cashierValidateResponseBodyGetSearchItemByName() {
        getSearchItemByNamePage.cashierValidateResponseBodyGetSearchItemByName();
    }
}
