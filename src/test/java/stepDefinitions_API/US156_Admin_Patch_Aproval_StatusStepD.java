package stepDefinitions_API;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.API.Breakfast;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;


public class US156_Admin_Patch_Aproval_StatusStepD {

    Response response = null;
    Breakfast breakfast=new Breakfast("621246a844c42508ff407b04", 2);
    JsonPath jspath;



    @Given("user connects to {string} and change the exist ads status")
    public void user_connects_to_and_change_the_exist_ads_status(String endPoint) {

        response = given().
                relaxedHTTPSValidation().
                queryParam("secret_token", Breakfast.adminToken).

                body(breakfast).
                //formParams(breakfast.patchMap()).
                contentType("application/json; charset=UTF-8").
                when().
                patch(ConfigurationReader.get("kese_URI") +endPoint);

    }

    @Then("user verifies the bedbreakfasts advertise status changed and status code is {int}")
    public void user_verifies_the_bedbreakfasts_advertise_status_changed_and_status_code_is(int statusCode) {

        response.prettyPrint();

        Assert.assertEquals(statusCode, response.getStatusCode());
        String modifiedValue = response.getBody().jsonPath().getString("nModified");
        Assert.assertTrue(modifiedValue.contains("1"));
        System.out.println("modified value: " + modifiedValue);

    }
}
