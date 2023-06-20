package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutCashierByIdPage {
    @Step("admin has api endpoint update cashier")
    public String adminHasApiEndpointUpdateCashier() {
        return LoginPage.url + "admin/cashier/17";
    }

    @Step("admin send HTTP request update cashier")
    public void adminSendHTTPRequestUpdateCashier() {
        String body = " {\n" +
                "    \"username\": \"putriupdate1\",\n" +
                "    \"password\": \"putriupdate1\",\n" +
                "    \"role\": \"cashier\"\n" +
                "  }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token)
                .contentType("application/json").body(reqBody.toString()).put(adminHasApiEndpointUpdateCashier());
    }

    @Step("admin validate response body update cashier")
    public void adminValidateResponseBodyUpdateCashier() {
        restAssuredThat(response -> response.body("meta.code", equalTo(200)));
        restAssuredThat(response -> response.body("meta.status", equalTo("Success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("Cashier edited")));
        //restAssuredThat(response -> response.body("data.name", equalTo("CS-update")));
    }
}
