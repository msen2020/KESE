package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class US159_CarDeleteApiStepD {

   Response response=null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api")
            .setRelaxedHTTPSValidation()
            .build();


    @Given("user connects to {string} for car API")
    public void userConnectsToForRoomsAPI(String endPoint) {
        response = given().
                queryParam("secret_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYyMDNkMzI3NjkzOWM3NzE2MjBhMWRiMSIsImVtYWlsIjoicXdlQGdtYWlsLmNvbSIsInJvbCI6Imt1bGxhbmljaSIsImt1bGxhbmljaV9hZGkiOiJ5dXN1ZjEyMzQiLCJkdXJ1bSI6MX0sImlhdCI6MTY0NTYyNjE5NCwiZXhwIjoxNjc3MTYyMTk0fQ.wuL1xXpCPmOdpWWJqo0_4P5c97dbgTKt20ltlCUWyFQ").
                contentType(ContentType.JSON).
                spec(request).
                delete(endPoint);
    }

    @Then("verify if the car is deleted")
    public void verifyIfTheCarIsDeleted(int statusCode) {

     //  Assert.assertEquals(200,response.statusCode());

    }




  //  @And("verify if the value of delete count is {int}")
   // public void verifyIfTheValueOfDeleteCountIs(int count) {
      //  int deletedCount = response.jsonPath().getInt("deletedCount");
      //  Assert.assertEquals(count,deletedCount);
   // }
}
