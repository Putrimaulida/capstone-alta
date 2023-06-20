package starter.user.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOrderPage {
    @Step("admin has api endpoint get all order")
    public String adminHasApiEndpointGetAllOrder() {
        return LoginPage.url + "admin/orders";
    }

    @Step("admin send HTTP request get all order")
    public void adminSendHTTPRequestGetAllOrder() {
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token).get(adminHasApiEndpointGetAllOrder());
    }

    @Step("admin validate response body get order information")
    public void adminValidateResponseBodyGetOrderInformation() {
        restAssuredThat(response -> response.body("meta.code", equalTo(200)));
        restAssuredThat(response -> response.body("meta.status", equalTo("success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("successfully get data order")));

    }
}
