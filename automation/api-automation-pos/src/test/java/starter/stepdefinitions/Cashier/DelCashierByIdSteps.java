package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.DelCashierByIdPage;

public class DelCashierByIdSteps {
    @Steps
    DelCashierByIdPage delCashierByIdPage;
    @Given("admin has api endpoint delete cashier")
    public void adminHasApiEndpointDeleteCashier() {
        delCashierByIdPage.adminHasApiEndpointDeleteCashier();
    }

    @When("admin send HTTP request delete cashier")
    public void adminSendHTTPRequestDeleteCashier() {
        delCashierByIdPage.adminSendHTTPRequestDeleteCashier();
    }

    @And("admin validate response body delete cashier")
    public void adminValidateResponseBodyDeleteCashier() {
        delCashierByIdPage.adminValidateResponseBodyDeleteCashier();
    }
}
