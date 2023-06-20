package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchCashierPage {
    @Step("admin has api endpoint get cashier")
    public String adminHasApiEndpointGetCashier() {
        return LoginPage.url + "admin/cashier/search?user_code=LHGY-4033";
    }

    @Step("admin send HTTP request get cashier")
    public void adminSendHTTPRequestGetCashier() {
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token).get(adminHasApiEndpointGetCashier());
    }

    @Step("admin validate response body get search cashier information")
    public void adminValidateResponseBodyGetSearchCashierInformation() {
        restAssuredThat(response -> response.body("meta.code", equalTo(200)));
        restAssuredThat(response -> response.body("meta.status", equalTo("Success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("Cashier found")));
        //restAssuredThat(response -> response.body("data.name", equalTo("kaffein")));
    }
}
