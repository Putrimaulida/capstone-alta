package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.GetAllCashierPage;

public class GetAllCashierSteps {
    @Steps
    GetAllCashierPage getAllCashierPage;
    @Given("admin has api endpoint get all cashier")
    public void adminHasApiEndpointGetAllCashier() {
        getAllCashierPage.adminHasApiEndpointGetAllCashier();
    }

    @When("admin send HTTP request get all cashier")
    public void adminSendHTTPRequestGetAllCashier() {
        getAllCashierPage.adminSendHTTPRequestGetAllCashier();
    }

    @Then("admin receive response code 200")
    public void adminReceiveResponseCode() {
        getAllCashierPage.adminReceiveResponseCode();
    }

    @And("admin validate response body get cashier information")
    public void adminValidateResponseBodyGetCashierInformation() {
        getAllCashierPage.adminValidateResponseBodyGetCashierInformation();
    }
}
