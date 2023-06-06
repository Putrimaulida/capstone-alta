package starter.user.Login;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class LoginPage {
    protected static String url ="128.199.206.32:8000/api/v1/";
    public String token="";

    @Step("I set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "admin/login";
    }
    @Step("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = "{\n" +
                "                username: \"admin\",\n" +
                "                password: \"admin\"\n" +
                "            }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received the token")
    public void iReceivedTheToken(){
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo("200")));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("successfully login")));
        restAssuredThat(response -> response.body("'data'.'username'", equalTo("admin")));
        restAssuredThat(response -> response.body("'data'.'user_code'", equalTo("AM-01")));
        restAssuredThat(response -> response.body("'data'.'token'", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTEsImV4cCI6MTY4NjA3NzAzN30.HwXAos4peasCO0vgqXDUJs-amg4ekcGqH_5RpvHF8JE")));
    }
}
