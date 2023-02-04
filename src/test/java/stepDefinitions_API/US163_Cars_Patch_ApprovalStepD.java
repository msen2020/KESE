package stepDefinitions_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import pages.API.Users;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US163_Cars_Patch_ApprovalStepD {
    Response loginResponse;
    Response response;
    String id = ConfigurationReader.get("id");
    String token = ConfigurationReader.get("secret_token");
    int approval = 0;
    int statusCode = 202;

    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();

    @Given("user logs in with email and sifre using POST for API")
    public void userLogsInWithEmailAndSifreUsingPOSTForAPI() {
        String email = US082_CreateUserStepD.email;
        String password = US082_CreateUserStepD.password;
        Users user = new Users();
        loginResponse = user.postUserLogin(email, password);
        token = loginResponse.body().jsonPath().get("secret_token").toString();
        id = loginResponse.body().jsonPath().get("_id").toString();
        loginResponse.prettyPrint();

    }


    @And("user can update approval value with {string} using Patch")
    public void userCanUpdateApprovalValueWithUsingPatch(String endPoint) {
        JSONObject jsonPath = new JSONObject();
        jsonPath.put("id", id).
                put("approval", 2);

        response = given().
                relaxedHTTPSValidation().
                spec(request).
                queryParam("secret_token", token).
                body(jsonPath.toString()).
                contentType("application/json; charset=UTF-8").
                when().
                patch(ConfigurationReader.get("kese_URI") + endPoint);
        response.prettyPrint();

    }

    @Then("verify updated approval value")
    public void verifyUpdatedApprovalValue() {
        Assert.assertEquals(statusCode, response.getStatusCode());
        String nModified = response.body().jsonPath().getString("nModified");
        Assert.assertTrue(nModified.contains("2"));

    }


}
