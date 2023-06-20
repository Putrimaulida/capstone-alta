package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetSearchCashierPage;

public class GetSearchCashierSteps {
    @Steps
    GetSearchCashierPage getSearchCashierPage;
    @Given("admin has api endpoint get cashier")
    public void adminHasApiEndpointGetCashier() {
        getSearchCashierPage.adminHasApiEndpointGetCashier();
    }

    @When("admin send HTTP request get cashier")
    public void adminSendHTTPRequestGetCashier() {
        getSearchCashierPage.adminSendHTTPRequestGetCashier();
    }

    @And("admin validate response body get search cashier information")
    public void adminValidateResponseBodyGetSearchCashierInformation() {
        getSearchCashierPage.adminValidateResponseBodyGetSearchCashierInformation();
    }
}
