package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryPage {
    @Step("cashier has api endpoint get category")
    public String cashierHasApiEndpointGetCategory() {
        return LoginPage.url + "cashier/order/category";
    }

    @Step("cashier send HTTP request get category")
    public void cashierSendHTTPRequestGetCategory() {
        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).get(cashierHasApiEndpointGetCategory());
    }

    @Step("cashier validate response body category")
    public void cashierValidateResponseBodyCategory() {
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("successfully retrieved data")));
    }
}
