package stepDefinitions_API;

import com.kese.pages.API.Cars;
import com.kese.pages.API.Photos;
import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;


public class US157_User_Post_Car_CreateStepD {

    Response response = null;

    Photos pht=new Photos();
    Cars cars=new Cars();

    @Given("user connects to {string} and adds a new cars adds")


    public void user_connects_to_and_adds_a_new_cars_adds(String endPoint) {

        response = given()
                .relaxedHTTPSValidation()
                .queryParam("secret_token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZmFmNGQ0NjYwNmNkMzg5MThhY2ViOSIsImVtYWlsIjoiY2VtYWxAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6IkNlbWFsUUEiLCJkdXJ1bSI6MX0sImlhdCI6MTY0MzgzNjg5NiwiZXhwIjoxNjc1MzcyODk2fQ.cf9bcgMj9XcrbcrucSoX97on7cLs3gX9BKzHs78bPTY" )

                .formParams(cars.dataCars())
                .contentType("multipart/form-data; charset=UTF-8")

                .multiPart("photo0", pht.carPhotosMap().get("photo0"))
                .multiPart("photo1", pht.carPhotosMap().get("photo1"))
                .multiPart("photo2", pht.carPhotosMap().get("photo2"))
                .multiPart("photo3", pht.carPhotosMap().get("photo3"))
                .multiPart("photo4", pht.carPhotosMap().get("photo4"))

                .when()
                .post(ConfigurationReader.get("kese_URI") +endPoint);

    }

    @Then("user verifies the cars advertise added and status code is {int}")
    public void user_verifies_the_cars_advertise_added_and_status_code_is(int statusCode) {

        response.prettyPrint();
        Assert.assertEquals(statusCode, response.getStatusCode());

    }


}
