package starter.user.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPage {
    public static String url = "http://128.199.206.32:8000/api/v1/";
    public static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MiwiZXhwIjoxNjg2OTAwNzE2fQ.tsyKjy04A8Zzngl_96ZBUuUOfiks8X4TpWG-fQgubUQ";

    @Step("cashier set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "admin/login";
    }
    @Step("cashier send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = " {\n" +
                "    \"username\": \"admin\",\n" +
                "    \"password\": \"admin\"\n" +
                "  }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("cashier receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("cashier received the token")
    public void iReceivedTheToken(){
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("successfully login")));
        restAssuredThat(response -> response.body("'data'.'username'", equalTo("admin")));
        restAssuredThat(response -> response.body("'data'.'user_code'", equalTo("AM-01")));
        //restAssuredThat(response -> response.body("'data'.'token'", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MywiZXhwIjoxNjg2NjQ4NTA5fQ.RsHurRhPp8xiVlZIqtI1a4FkK0zyi19Loe083CDTh-M")));
    }
}
