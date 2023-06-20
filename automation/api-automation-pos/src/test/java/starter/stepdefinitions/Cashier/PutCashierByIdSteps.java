package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.PutCashierByIdPage;

public class PutCashierByIdSteps {
    @Steps
    PutCashierByIdPage putCashierByIdPage;
    @Given("admin has api endpoint update cashier")
    public void adminHasApiEndpointUpdateCashier() {
        putCashierByIdPage.adminHasApiEndpointUpdateCashier();
    }

    @When("admin send HTTP request update cashier")
    public void adminSendHTTPRequestUpdateCashier() {
        putCashierByIdPage.adminSendHTTPRequestUpdateCashier();
    }

    @And("admin validate response body update cashier")
    public void adminValidateResponseBodyUpdateCashier() {
        putCashierByIdPage.adminValidateResponseBodyUpdateCashier();
    }
}
