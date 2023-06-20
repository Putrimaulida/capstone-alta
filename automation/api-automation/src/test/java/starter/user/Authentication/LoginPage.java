package starter.user.Authentication;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class LoginPage {
    public static String url = "http://128.199.206.32:8000/api/v1/";
    public static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MzQsImV4cCI6MTY4Njg2NTM3M30.XXx9VDANJ3A8luhwJor5MXbFPmxd5Z0SK_ISIjZ6MXs";

    @Step("I set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "cashier/login";
    }
    @Step("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = " {\n" +
                "    \"username\": \"ITMT-3351\",\n" +
                "    \"password\": \"kasir\"\n" +
                "  }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received the token")
    public void iReceivedTheToken(){
        restAssuredThat(response -> response.body("'meta'.'code'", equalTo(200)));
        restAssuredThat(response -> response.body("'meta'.'status'", equalTo("success")));
        restAssuredThat(response -> response.body("'meta'.'message'", equalTo("successfully login")));
        restAssuredThat(response -> response.body("'data'.'username'", equalTo("kasir")));
        restAssuredThat(response -> response.body("'data'.'user_code'", equalTo("ITMT-3351")));
        //restAssuredThat(response -> response.body("'data'.'token'", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MywiZXhwIjoxNjg2NjQ4NTA5fQ.RsHurRhPp8xiVlZIqtI1a4FkK0zyi19Loe083CDTh-M")));
    }
}
