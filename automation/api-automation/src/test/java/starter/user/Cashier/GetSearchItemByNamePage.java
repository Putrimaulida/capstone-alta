package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchItemByNamePage {
    @Step("cashier has api endpoint get search item by name")
    public String cashierHasApiEndpointGetSearchItemByName() {
        return LoginPage.url + "cashier/order/search?name=Taro";
    }

    @Step("cashier send HTTP request get search item by name")
    public void cashierSendHTTPRequestGetSearchItemByName() {
        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).get(cashierHasApiEndpointGetSearchItemByName());
    }

    @Step("cashier validate response body get search item by name")
    public void cashierValidateResponseBodyGetSearchItemByName() {
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("Data retrieved successfully")));
    }
}
