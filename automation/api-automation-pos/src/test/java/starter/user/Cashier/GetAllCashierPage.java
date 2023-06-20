package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCashierPage {
    @Step("admin has api endpoint get all cashier")
    public String adminHasApiEndpointGetAllCashier() {
        return LoginPage.url + "admin/cashier?page=1";
    }

    @Step("admin send HTTP request get all cashier")
    public void adminSendHTTPRequestGetAllCashier() {
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token).get(adminHasApiEndpointGetAllCashier());
    }

    @Step("admin receive response code 200")
    public void adminReceiveResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("admin validate response body get cashier information")
    public void adminValidateResponseBodyGetCashierInformation() {
        restAssuredThat(response -> response.body("meta.code", equalTo(200)));
        restAssuredThat(response -> response.body("meta.status", equalTo("success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("successfully retrieved data")));
        restAssuredThat(response -> response.body("data[0].name", equalTo("kaffein")));
    }
}
