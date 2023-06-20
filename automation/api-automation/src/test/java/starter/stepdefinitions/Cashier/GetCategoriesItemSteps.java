package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetCategoriesItemPage;

public class GetCategoriesItemSteps {
    @Steps
    GetCategoriesItemPage getCategoriesItemPage;
    @Given("cashier has api endpoint get categories & items")
    public void cashierHasApiEndpointGetCategoriesItems() {
        getCategoriesItemPage.cashierHasApiEndpointGetCategoriesItems();
    }

    @When("cashier send HTTP request get categories & items")
    public void cashierSendHTTPRequestGetCategoriesItems() {
        getCategoriesItemPage.cashierSendHTTPRequestGetCategoriesItems();
    }

    @Then("cashier receive response code 200")
    public void cashierReceiveResponseCode() {
        getCategoriesItemPage.cashierReceiveResponseCode200();
    }

    @And("cashier validate response body get categories & items")
    public void cashierValidateResponseBodyGetCategoriesItems() {
        getCategoriesItemPage.cashierValidateResponseBodyGetCategoriesItems();
    }
}
