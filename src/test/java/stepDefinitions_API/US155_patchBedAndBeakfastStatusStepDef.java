package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US155_patchBedAndBeakfastStatusStepDef {

    String validToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZmE1ZDYwYWZiYjNhMjhiMTIyODFhMiIsImVtYWlsIjoibWFtaWNlQGdtYWlsLmNvbSIsInJvbCI6Imt1bGxhbmljaSIsImt1bGxhbmljaV9hZGkiOiJtYW1pY2UiLCJkdXJ1bSI6MX0sImlhdCI6MTY0NTM3Mjc0NywiZXhwIjoxNjc2OTA4NzQ3fQ.PRcSBahO4wR08JSssWi3k5ldi_i9eF2mzn0haNlD_8Q";
    String inValidToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZDIyYzMxODk3MDhhMmQyYWVlZGExYyIsImVtYWlsIjoia3VsbGFuaWNpMUBnbWFpbC5jb20iLCJyb2wiOiJ5ZXRraWxpIiwia3VsbGFuaWNpX2FkaSI6Imt1bGxhbmljaTEiLCJkdXJ1bSI6MX0sImlhdCI6MTY0NDk3MDMyNSwiZXhwIjoxNjc2NTA2MzI1fQ.FXejLthqzVbXA8GH2KfAiBTea-piduAJdjgKukynQQg";

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setContentType(ContentType.JSON)
            .setBaseUri("https://kese.nl/api")
            .build();

    @Given("user patch status on {string} with valid token")
    public void userPatchStatusOnWithToken(String endPoint) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "621246a844c42508ff407b04");
        jsonObject.put("status", false);

        response = given().
                queryParam("secret_token", validToken).
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                patch(endPoint);


    }

    @Then("assert that status code {int} and nModified is {int}")
    public void assertThatStatusCodeAndNModifiedIs(int statusCode, int nModified) {

        System.out.println("response.getStatusCode() = " + response.getStatusCode());
        Assert.assertEquals(202, response.getStatusCode());

        response.prettyPrint();

        int nModifiedStatus = response.jsonPath().getInt("nModified");
        System.out.println("nModifiedStatus = " + nModifiedStatus);

    }

    @Given("user patch status on {string} with invalid token")
    public void userPatchStatusOnWithInvalidToken(String endPoint) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "621246a844c42508ff407b04");
        jsonObject.put("status", false);

        response = given().
                queryParam("secret_token", inValidToken).
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                patch(endPoint);

    }

    @Given("user patch status on {string} with invalid token invalid id")
    public void userPatchStatusOnWithInvalidTokenInvalidId(String endPoint) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "620c5d6a44c42508ff30d267");
        jsonObject.put("status", false);

        response = given().
                queryParam("secret_token", inValidToken).
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                patch(endPoint);

    }

    @Given("user patch status on {string} with valid token invalid id")
    public void userPatchStatusOnWithValidTokenInvalidId(String endPoint) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "620c5d6a44c42508ff30d267");
        jsonObject.put("status", false);

        response = given().
                queryParam("secret_token", validToken).
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                patch(endPoint);

    }
}
