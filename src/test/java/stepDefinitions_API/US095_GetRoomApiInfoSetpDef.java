package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US095_GetRoomApiInfoSetpDef {

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api/rooms/")
            .build();
    @Given("user connects to {string} with GET request")
    public void userConnectsToWithGETRequest(String endPoint) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("_id", "61ff7af7b8cdad2aca702c48");
        response = given().relaxedHTTPSValidation().
                //queryParam("id","61ff7af7b8cdad2aca702c48").
                contentType(ContentType.JSON).
                spec(request).
//                body(jsonObject.toString()).
                get(endPoint);
    }

    @Then("user should able to see the room information")
    public void userShouldAbleToSeeTheRoomInformation() {
       Assert.assertEquals(200,response.getStatusCode());
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}
