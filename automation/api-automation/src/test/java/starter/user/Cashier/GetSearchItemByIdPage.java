package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchItemByIdPage {
    @Step("cashier has api endpoint get search item by id")
    public String cashierHasApiEndpointGetSearchItemById() {
        return LoginPage.url + "cashier/order/item/71";
    }

    @Step("cashier send HTTP request get search item by id")
    public void cashierSendHTTPRequestGetSearchItemById() {
        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).get(cashierHasApiEndpointGetSearchItemById());
    }

    @Step("cashier validate response body get search item by id")
    public void cashierValidateResponseBodyGetSearchItemById() {
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("successfully retrieved data")));
    }
}
