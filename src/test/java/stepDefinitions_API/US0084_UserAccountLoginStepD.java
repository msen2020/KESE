package stepDefinitions_API;


import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class US0084_UserAccountLoginStepD {


    Response responseLogin=null;

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("api_URI")).build();


    @Given("user connects to {string} for login with {string} and {string}")
    public void user_connects_to_for_login_with_and(String endPoint, String email, String password) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("email",email);
        requestParams.put("sifre",password);



        responseLogin = given().contentType(ContentType.JSON)
                .spec(requestSpecification)
                .body(requestParams.toString())
                .when().post(endPoint);



    }


    @Then("user verifies that status code is {string} for login with email and password")
    public void userVerifiesThatStatusCodeIsForLoginWithEmailAndPassword(String statusCode) {
        int expectedStatusCode = Integer.parseInt(statusCode);
        int actualStatusCode = responseLogin.statusCode();
        Assert.assertEquals(expectedStatusCode,actualStatusCode);
    }

    @Then("user verifies that response body has infos")
    public void user_verifies_that_response_body_has_infos(List<String> infos) {
        JsonPath jsonPath = responseLogin.jsonPath();
        Object actualResult;
        for (String info : infos) {
            actualResult = jsonPath.get(info);
            Assert.assertNotEquals(null,actualResult);
        }
    }



}
