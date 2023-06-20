package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateCashierPage {
    @Step("admin has api endpoint create new cashier")
    public String adminHasApiEndpointCreateNewCashier() {
        return LoginPage.url + "admin/cashier";
    }

    @Step("admin send HTTP request create new cashier")
    public void adminSendHTTPRequestCreateNewCashier() {
        String body = " {\n" +
                "    \"username\": \"CS-04\",\n" +
                "    \"password\": \"cashier04\",\n" +
                "    \"role\": \"cashier\"\n" +
                "  }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization","Bearer " + LoginPage.token)
                .contentType("application/json").body(reqBody.toString()).post(adminHasApiEndpointCreateNewCashier());
    }

    @Step("admin validate response body post create new cashier")
    public void adminValidateResponseBodyPostCreateNewCashier() {
        restAssuredThat(response -> response.body("meta.code", equalTo(201)));
        restAssuredThat(response -> response.body("meta.status", equalTo("Success")));
        restAssuredThat(response -> response.body("meta.message", equalTo("Cashier created")));
        //restAssuredThat(response -> response.body("data.name", equalTo("CS-03")));
    }
}
