package starter.stepdefinitions.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Order.GetOrderPage;

public class GetOrderSteps {
    @Steps
    GetOrderPage getOrderPage;
    @Given("admin has api endpoint get all order")
    public void adminHasApiEndpointGetAllOrder() {
        getOrderPage.adminHasApiEndpointGetAllOrder();
    }

    @When("admin send HTTP request get all order")
    public void adminSendHTTPRequestGetAllOrder() {
        getOrderPage.adminSendHTTPRequestGetAllOrder();
    }

    @And("admin validate response body get order information")
    public void adminValidateResponseBodyGetOrderInformation() {
        getOrderPage.adminValidateResponseBodyGetOrderInformation();
    }
}
