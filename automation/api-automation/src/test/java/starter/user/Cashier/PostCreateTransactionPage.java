package starter.user.Cashier;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.user.Authentication.LoginPage;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateTransactionPage {
    @Step("cashier has api endpoint add new transaction")
    public String cashierHasApiEndpointAddNewTransaction() {
        return LoginPage.url + "cashier/checkout";
    }

    @Step("cashier send HTTP request add new transaction")
    public void cashierSendHTTPRequestAddNewTransaction() {
        String body = "{\n" +
                "    \"name\":" + "Ahmad" + ",\n" +
                "    \"order_option\":" + "DINE_IN" + ",\n" +
                "    \"order_table\":" + 4 + ",\n" +
                "    \"payment\":" + "BCA" + ",\n" +
                "    \"items\":" + "[" + "\n" +
                        "{" + "\n" +
                            "    \"product_id\":" + 2 + ",\n" +
                            "    \"quantity\":" + 7 + ",\n" +
                            "    \"note\":" + "less saus" + ",\n" +
                        "}" + ",\n" +
                        "{" + "\n" +
                        "    \"product_id\":" + 3 + ",\n" +
                        "    \"quantity\":" + 10 + ",\n" +
                        "    \"note\":" + " " + ",\n" +
                        "}" + "\n" +
                    "]" + "\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + LoginPage.token).contentType("application/json")
                .body(reqBody.toString()).post(cashierHasApiEndpointAddNewTransaction());
    }

    @Step("cashier validate response body post add new transaction")
    public void cashierValidateResponseBodyPostAddNewTransaction() {
    }
}
