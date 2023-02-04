package stepDefinitions_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US096_RoomsDeleteIlanlarStepD {


    String baseUri= "https://kese.nl/api";
//    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZjg4MDNkOGNhN2VjNDM2YzViODhhZiIsImVtYWlsIjoiYXppemkuMTRAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6ImF6aXozNDM4IiwiZHVydW0iOjF9LCJpYXQiOjE2NDM4OTc3NDAsImV4cCI6MTY3NTQzMzc0MH0.2zWIRRSvKaVDWba0B1CsqRSHWH4r9dNGaDX5ImAFq4Y";
    Response response=null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(baseUri)
            .setRelaxedHTTPSValidation()
            .build();

    @Given("user connects to {string} for rooms API")
    public void userConnectsToForRoomsAPI(String endPoint) {
        response = given().
                queryParam("secret_token", US094_CreateNewRoomStepD.tokenID).
                contentType(ContentType.JSON).
                spec(request).
                delete(endPoint+"/"+US094_CreateNewRoomStepD.userID);
    }

//    @When("user deletes rooms for rooms API")
//    public void userDeletesRoomsForRoomsAPI() {
//        response = given().queryParam("secret_token", US094_CreatNewRoomStepD.tokenID).
//                contentType(ContentType.JSON).
//                spec(request).
//                when().
//                delete("/"+US094_CreatNewRoomStepD.userID);
//        System.out.println("cok guzel code yazdim yaa "+US094_CreatNewRoomStepD.userID);
//
//
////        Assert.assertEquals(404,response.getStatusCode()); //204
////        Map<String, Object> actualMap = response.as(HashMap.class);
////        System.out.println(actualMap);
////        assertTrue(actualMap.size()==0);
//    }

    @Then("verify if the room is deleted")
    public void verifyIfTheRoomIsDeleted() {
        Assert.assertEquals(200,response.statusCode()); //200
    }


    @And("verify if the value of deleted count is {int}")
    public void verifyTheValueOfDeletedCountIs(int count) {
        int deletedCount = response.jsonPath().getInt("deletedCount");
        Assert.assertEquals(count,deletedCount);

    }

    @And("verify if the room is deleted from the database")
    public void verifyIfTheRoomIsDeletedFromTheDatabase() {

    }
}
