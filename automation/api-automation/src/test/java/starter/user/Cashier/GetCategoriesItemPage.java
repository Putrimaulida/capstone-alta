package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoriesItemPage {
    @Step("cashier has api endpoint get categories & items")
    public String cashierHasApiEndpointGetCategoriesItems() {
        return LoginPage.url + "cashier/order?category=Minuman&limit=10&page=1";
    }

    @Step("cashier send HTTP request get categories & items")
    public void cashierSendHTTPRequestGetCategoriesItems() {
        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).get(cashierHasApiEndpointGetCategoriesItems());
    }

    @Step("cashier receive response code 200")
    public void cashierReceiveResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("cashier validate response body get categories & items")
    public void cashierValidateResponseBodyGetCategoriesItems() {
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("Data retrieved successfully")));
    }
}
