package stepDefinitions_API;

import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

// Nursel
public class US086_UserApiGetListofIlansStepD {

    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();
    Response response = null;
    JSONObject jsonObject = new JSONObject();
    String token = "";

    @When("user logs in with {string} and {string} to {string} with GET for user API")
    public void user_logs_in_with_and_to_with_get_for_user_api(String email, String password, String endpoint) {

        jsonObject.put("email", email);
        jsonObject.put("sifre", password);

        response = given().contentType(ContentType.JSON)
                .relaxedHTTPSValidation()
                .spec(request)
                .body(jsonObject.toString())
                .when()
                .post(endpoint);

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.body().jsonPath().get("sonuc"), true);
        assertEquals(response.body().jsonPath().get("rol"), "kullanici");

    }

    @When("user enters user's token to {string} to list all the ilans with GET for user API")
    public void user_enters_user_s_token_to_to_list_all_the_ilans_with_get_for_user_api(String endpoint) {

        token = response.body().jsonPath().get("token").toString();

        given()
                .queryParam("secret_token", token)
                .relaxedHTTPSValidation()
                .spec(request)
                .when().get(endpoint)
                .then()
                .assertThat()
                .statusCode(200)
                .assertThat().body("$", hasKey("homes"),
                        "$", hasKey("rooms"),
                        "$", hasKey("bedBreakfasts"),
                        "$", hasKey("cars"),
                        "$", hasKey("cargos"));

    }
}
