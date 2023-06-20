package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateMembershipsPage {
    @Step("cashier has api endpoint add new memberships")
    public String cashierHasApiEndpointAddNewMemberships() {
        return LoginPage.url + "cashier/membership";
    }

    @Step("cashier send HTTP request add new memberships")
    public void cashierSendHTTPRequestAddNewMemberships() {
        String body = "{\n" +
                "    \"name\":" + "Kim Jennie" + ",\n" +
                "    \"email\":" + "jennie123@gmail.com" + ",\n" +
                "    \"phone\":" + 839489311 + ",\n" +
                "    \"birth_day\":" + "2001-05-19" + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).contentType("application/json")
                .body(reqBody.toString()).post(cashierHasApiEndpointAddNewMemberships());
    }

    @Step("cashier validate response body post add new memberships")
    public void cashierValidateResponseBodyPostAddNewMemberships() {
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(201)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("Success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("Membership created")));
        restAssuredThat(response -> response.body("'data'.'name'", equalTo("Kim Jennie")));
        restAssuredThat(response -> response.body("'data'.'email'", equalTo("jennie123@gmail.com")));
    }
}
