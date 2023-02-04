package stepDefinitions_API;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;


public class US093_HomesApiPopulerIlanlarStepD {

    String baseUrl= ConfigurationReader.get("kese_URI");
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(baseUrl)
            .build();
    Response response = null;

    @When("user connects to {string} with GET for home API")
    public void user_connects_to_with_GET_for_home_api(String endPoint) {
        response = given()
                .spec(request)
                .get(endPoint);

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Then("system should display max {int} populer ev ilani for home API")
    public void system_should_display_max_populer_ev_ilani_for_home_api(int advNumber) {

        List<String> homeList = response.body().jsonPath().getList("_id");
        Assert.assertEquals(advNumber,homeList.size());
    }

    @Then("populer ev ilanlari should be displayed by read count order for home API")
    public void populer_ev_ilanlari_should_be_displayed_by_read_count_order_for_home_api() {

        List<Integer> actualReadCounterList = response.body().jsonPath().getList("okunmasayisi");

        List<Integer> sortedReadCounterList = new ArrayList<>(actualReadCounterList);
        sortedReadCounterList.sort(Collections.reverseOrder());

        Assert.assertEquals(sortedReadCounterList, actualReadCounterList);
    }
}
