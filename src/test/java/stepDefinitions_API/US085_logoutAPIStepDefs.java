package stepDefinitions_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US085_logoutAPIStepDefs {
    Response response2 = null;
    RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri("https://test.kese.nl/api")
            .build();

    @When("user connects to {string}")
    public void user_connects_to(String endPoint) {
        response2 = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .and().spec(spec).get(endPoint);
        response2.prettyPrint();
    }

    @Then("the user verifies that the status code is {int}")
    public void the_user_verifies_that_status_code_is(int expectedStatusCode) {

        Assert.assertEquals(expectedStatusCode, response2.statusCode());
    }

    @And("the user verifies that the response body has sonuc is {string}")
    public void theUserVerifiesThatTheResponseBodyHasSonucIs(String expectedWord) {

        System.out.println("response2.path(\"sonuc\") = " + response2.path("sonuc"));
        String actualSonuc = response2.path("sonuc").toString();
        System.out.println("sonuc = " + actualSonuc);
        Assert.assertEquals(expectedWord, actualSonuc);

    }



}
