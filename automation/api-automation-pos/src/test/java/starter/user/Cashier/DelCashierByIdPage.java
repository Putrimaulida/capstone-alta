package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DelCashierByIdPage {
    @Step("admin has api endpoint delete cashier")
    public String adminHasApiEndpointDeleteCashier() {
        return LoginPage.url + "admin/cashier/35";
    }

    @Step("admin send HTTP request delete cashier")
    public void adminSendHTTPRequestDeleteCashier() {
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token)
                .delete(adminHasApiEndpointDeleteCashier());
    }

    @Step("admin validate response body delete cashier")
    public void adminValidateResponseBodyDeleteCashier() {
        restAssuredThat(response -> response.body("meta.code", equalTo(200)));
        restAssuredThat(response -> response.body("meta.status", equalTo("Success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("Cashier deleted")));
        restAssuredThat(response -> response.body("data", equalTo("")));
    }
}
