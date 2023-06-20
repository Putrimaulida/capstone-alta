package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.PostCreateTransactionPage;

public class PostCreateTransactionSteps {
    @Steps
    PostCreateTransactionPage postCreateTransactionPage;
    @Given("cashier has api endpoint add new transaction")
    public void cashierHasApiEndpointAddNewTransaction() {
        postCreateTransactionPage.cashierHasApiEndpointAddNewTransaction();
    }

    @When("cashier send HTTP request add new transaction")
    public void cashierSendHTTPRequestAddNewTransaction() {
        postCreateTransactionPage.cashierSendHTTPRequestAddNewTransaction();
    }

    @And("cashier validate response body post add new transaction")
    public void cashierValidateResponseBodyPostAddNewTransaction() {
        postCreateTransactionPage.cashierValidateResponseBodyPostAddNewTransaction();
    }
}
