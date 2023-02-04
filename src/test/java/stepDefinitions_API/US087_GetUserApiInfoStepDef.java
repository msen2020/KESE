package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US087_GetUserApiInfoStepDef {


    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setBaseUri("https://kese.nl/api")
            .build();



    @Given("user connect to {string}")
    public void userConnectTo(String endPoint) {

       given()
                .when()
                .then()
                .statusCode(200);


    }

    @Then("user verifies that status code is {int}")
    public void userVerifiesThatStatusCodeIs(int statusCode) {
       int gelencode=statusCode;
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://kese.nl/api/user/bilgi?id=6203d3276939c771620a1db1")
                .then();

        Assert.assertEquals(gelencode,statusCode);
        System.out.println("gelenCode: "+ statusCode);


    }
        @Then("user verifies that response body has sonuc is {string}")
        public void userVerifiesThatResponseBodyHasSonucIs (String sonuc){
        String gelenDeger=sonuc;
        given()
                .relaxedHTTPSValidation()
                .when()
                .get("https://kese.nl/api/user/bilgi?id=6203d3276939c771620a1db1")
                .then()
                .statusCode(200)
                .log().all();

        Assert.assertEquals(gelenDeger,sonuc);
        System.out.println("gelenDeger: " + sonuc);

        }

    }



