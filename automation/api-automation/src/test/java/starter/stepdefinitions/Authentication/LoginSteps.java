package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Authentication.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;
    @Given("I set the api POST endpoint")
    public void iSetTheApiPOSTEndpoint() {
        login.iSetPOSTApiEndpoints();
    }

    @When("I send HTTP POST request")
    public void iSendHTTPPOSTRequest() {
        login.iSendGETHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200() {
        login.iReceiveValidHTTPResponseCode200();
    }

    @And("I received the token")
    public void iReceivedTheToken() {
        login.iReceivedTheToken();
    }

}
