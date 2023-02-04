package stepDefinitions_API;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.API.Homes;
import pages.API.Photos;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US088_UserCreateNewHomeStepD {

    Response response = null;

    Photos pht=new Photos();
    Homes hms=new Homes();


    @Given("user connects to {string} and adds a new home adds")
    public void user_connects_to_and_adds_a_new_home_adds(String endPoint) {

        response = given()


                .relaxedHTTPSValidation()
                .queryParam("secret_token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZmFmNGQ0NjYwNmNkMzg5MThhY2ViOSIsImVtYWlsIjoiY2VtYWxAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6IkNlbWFsUUEiLCJkdXJ1bSI6MX0sImlhdCI6MTY0MzgzNjg5NiwiZXhwIjoxNjc1MzcyODk2fQ.cf9bcgMj9XcrbcrucSoX97on7cLs3gX9BKzHs78bPTY" )

                .formParams(hms.dataMap())
                .contentType("multipart/form-data; charset=UTF-8")

                .multiPart("photo0", pht.PhotosMap().get("photo0"))
                .multiPart("photo1", pht.PhotosMap().get("photo1"))
                .multiPart("photo2", pht.PhotosMap().get("photo2"))
                .multiPart("photo3", pht.PhotosMap().get("photo3"))
                .multiPart("photo4", pht.PhotosMap().get("photo4"))

                .when()
                .post(ConfigurationReader.get("kese_URI") +endPoint);
    }

    @Then("user verifies the home advertise added and status code is {int}")
    public void userVerifiesTheHomeAdvertiseAddedAndStatusCodeIs(int statusCode) {
        response.prettyPrint();
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
}

