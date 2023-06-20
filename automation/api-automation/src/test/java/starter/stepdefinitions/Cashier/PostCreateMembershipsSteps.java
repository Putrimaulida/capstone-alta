package starter.stepdefinitions.Cashier;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cashier.PostCreateMembershipsPage;

public class PostCreateMembershipsSteps {
    @Steps
    PostCreateMembershipsPage postCreateMembershipsPage;
    @Given("cashier has api endpoint add new memberships")
    public void cashierHasApiEndpointAddNewMemberships() {
        postCreateMembershipsPage.cashierHasApiEndpointAddNewMemberships();
    }

    @When("cashier send HTTP request add new memberships")
    public void cashierSendHTTPRequestAddNewMemberships() {
        postCreateMembershipsPage.cashierSendHTTPRequestAddNewMemberships();

    }

    @And("cashier validate response body post add new memberships")
    public void cashierValidateResponseBodyPostAddNewMemberships() {
        postCreateMembershipsPage.cashierValidateResponseBodyPostAddNewMemberships();
    }
}
