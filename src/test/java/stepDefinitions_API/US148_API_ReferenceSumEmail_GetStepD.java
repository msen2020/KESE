package stepDefinitions_API;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US148_API_ReferenceSumEmail_GetStepD {

    public static int statusCode;
    public static Response response;
    //RequestSpecification spec= new RequestSpecBuilder().setBaseUri(ConfigurationReader.get("kese_URI")).build();

    @Given("user connects to {string} endpoint with {string}")
    public void user_connects_to_endpoint_with(String endPoint, String email) {

         response = given().relaxedHTTPSValidation().accept(ContentType.JSON)
                .and().pathParam("email", email)
                .when().get(ConfigurationReader.get("kese_URI") + endPoint);
         //response.prettyPrint();
        statusCode= response.statusCode();


    }


    @Then("verify status code is {int} in reference of email endPoint")
    public void verify_status_code_is_in_reference_of_email_endPoint(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode,statusCode);

    }



    @And("verify in the response has a value for sum key")
    public void verify_in_the_response_has_a_value_for_sum_key() {
        //System.out.println("method3 prettyprint here:");
        //response.prettyPrint();
        JsonPath jsonPath= response.jsonPath();
        String sum= jsonPath.getString("sum");
        //System.out.println("sum = " + sum);
        Assert.assertTrue(sum!=null);

    }


    @Then("verify in the response has NO value for sum key")
    public void verify_in_the_response_has_NO_value_for_sum_key() {
       //response.prettyPrint();
       Assert.assertFalse(response.prettyPrint().contains("sum"));
    }

}
