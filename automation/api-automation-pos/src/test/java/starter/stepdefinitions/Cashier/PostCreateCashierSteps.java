package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.PostCreateCashierPage;

public class PostCreateCashierSteps {
    @Steps
    PostCreateCashierPage postCreateCashierPage;
    @Given("admin has api endpoint create new cashier")
    public void adminHasApiEndpointCreateNewCashier() {
        postCreateCashierPage.adminHasApiEndpointCreateNewCashier();
    }

    @When("admin send HTTP request create new cashier")
    public void adminSendHTTPRequestCreateNewCashier() {
        postCreateCashierPage.adminSendHTTPRequestCreateNewCashier();
    }

    @And("admin validate response body post create new cashier")
    public void adminValidateResponseBodyPostCreateNewCashier() {
        postCreateCashierPage.adminValidateResponseBodyPostCreateNewCashier();
    }
}
