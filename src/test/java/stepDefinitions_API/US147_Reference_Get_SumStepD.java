package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US147_Reference_Get_SumStepD {
    Response response;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();


    @Given("user connects to {string} with endpoint")
    public void userConnectsToWithEndpoint(String endPoint) {

        response = given().
                queryParam("secret_token", ConfigurationReader.get("secret_token") ).
                contentType(ContentType.JSON).
                spec(request).
                get(endPoint);

        response.prettyPrint();
    }

    @Then("user verifies the response status code is {int}")
    public void userVerifiesTheResponseStatusCodeIs(int statusCode) {
            Assert.assertEquals(statusCode, response.getStatusCode());
        }

    @Then("user verifies the reference value of sum {string} count")
    public void userVerifiesTheReferenceValueOfSumCount(String sum) {
        System.out.println(response.jsonPath().getString("sum"));
        String actualSum=response.jsonPath().getString("sum");
        System.out.println(actualSum);
        Assert.assertEquals(sum,actualSum);
    }
}

