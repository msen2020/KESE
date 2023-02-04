package stepDefinitions_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;


public class US099_API_GetRoomsHomePageIIans {

    Response response = null;
    RequestSpecification specification = new RequestSpecBuilder()
            .setBaseUri("http://test.kese.nl/api/rooms").build();

    @Given("user connects to {string} with get request")
    public void userConnectsToWithGetRequest(String endPoint) {

        response = given().
                contentType(ContentType.JSON).
                spec(specification).
                get(endPoint);
    }


    @And("User should be able to see max eight postings")
    public void userShouldBeAbleToSeeMaxEightPostings() {

        List<Integer> totalIdNumber = response.body().jsonPath().getList("_id");
        System.out.println(totalIdNumber.size());
    }

    @And("Posts should be in order by okunmasayisi")
    public void postesShouldBeOrderedByOkunmasayisi() {

        System.out.println(response.jsonPath().getString("okunmasayisi"));


            List<Integer> listedNumberofOkunmaSayisi = response.body().jsonPath().getList("okunmasayisi");

            List<Integer> sortedReadCounterList = new ArrayList<Integer>(listedNumberofOkunmaSayisi);
            sortedReadCounterList.sort(Collections.reverseOrder());

            Assert.assertEquals(sortedReadCounterList, listedNumberofOkunmaSayisi);

        }


    @And("status code should be {int}")
    public void statusCodeShouldBe(int arg0) {


        Assert.assertEquals( 200, response.getStatusCode());

        //response.prettyPrint();

    }
}
