package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Authentication.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginAdmin;
    @Given("admin set the api POST endpoint")
    public void adminSetTheApiPOSTEndpoint() {
        loginAdmin.iSetPOSTApiEndpoints();
    }

    @When("admin send HTTP POST request")
    public void adminSendHTTPPOSTRequest() {
        loginAdmin.iSendGETHTTPRequest();
    }

    @Then("admin receive valid HTTP response code 200")
    public void adminReceiveValidHTTPResponseCode() {
        loginAdmin.iReceiveValidHTTPResponseCode200();
    }

    @And("admin received the token")
    public void adminReceivedTheToken() {
        loginAdmin.iReceivedTheToken();
    }
}
