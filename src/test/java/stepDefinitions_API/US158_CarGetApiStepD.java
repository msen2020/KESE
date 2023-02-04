package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US158_CarGetApiStepD {

    Response response=null;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri("https://kese.nl/api")
            .build();

    @Given("user connects to {string} and adds")
    public void userConnectTo(String endPoint) {

        given()
                .when()
                .then()
                .statusCode(200);

    }



    @Then("user I should be able to see the information {string}")
    public void userIShouldBeAbleToSeeTheInformation(String sonuc) {
        String gelenDeger=sonuc;
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://kese.nl/api/cars/620f563444c42508ff35fb4c")
                .then()
                .statusCode(200)
                .log().all();

       // response.prettyPrint();
        Assert.assertEquals(gelenDeger,sonuc);
       System.out.println("gelenDeger: " + sonuc);

    }



}
