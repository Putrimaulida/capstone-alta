package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetSearchItemByIdPage;

public class GetSearchItemByIdSteps {
    @Steps
    GetSearchItemByIdPage getSearchItemByIdPage;
    @Given("cashier has api endpoint get search item by id")
    public void cashierHasApiEndpointGetSearchItemById() {
        getSearchItemByIdPage.cashierHasApiEndpointGetSearchItemById();
    }

    @When("cashier send HTTP request get search item by id")
    public void cashierSendHTTPRequestGetSearchItemById() {
        getSearchItemByIdPage.cashierSendHTTPRequestGetSearchItemById();
    }

    @And("cashier validate response body get search item by id")
    public void cashierValidateResponseBodyGetSearchItemById() {
        getSearchItemByIdPage.cashierValidateResponseBodyGetSearchItemById();
    }
}
