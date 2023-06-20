package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetCategoryPage;

public class GetCategorySteps {
    @Steps
    GetCategoryPage getCategoryPage;
    @Given("cashier has api endpoint get category")
    public void cashierHasApiEndpointGetCategory() {
        getCategoryPage.cashierHasApiEndpointGetCategory();
    }

    @When("cashier send HTTP request get category")
    public void cashierSendHTTPRequestGetCategory() {
        getCategoryPage.cashierSendHTTPRequestGetCategory();
    }

    @And("cashier validate response body category")
    public void cashierValidateResponseBodyCategory() {
        getCategoryPage.cashierValidateResponseBodyCategory();
    }
}
