package stepDefinitions_API;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US090_DeleteHomesIlanStepD {

    Response responseDelete;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();
    String id = "";
    String token = "";
    String ilanID = "";

    @Then("user logs in {string} with new user info via post request")
    public void user_logs_in_with_new_user_info_via_post_request(String endpoint) {
        String email = US082_CreateUserStepD.email;
        String sifre = US082_CreateUserStepD.password;
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email);
        requestParams.put("sifre", sifre);

        responseDelete = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .post(endpoint);

        id = responseDelete.body().jsonPath().get("_id");


        token = responseDelete.body().jsonPath().get("token");

    }

    @Then("user verifies that status code is {int} for login")
    public void userVerifiesThatStatusCodeIsForLogin(int expectedStatusCode) {

        int actualStatusCode = responseDelete.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);
    }

    @Then("user connects to {string} to create new home with new user info via post request")
    public void userConnectsToToCreateNewHomeWithNewUserInfoViaPostRequest(String endpoint) {

        HashMap<String, Object> requestParams = new HashMap<>();


        JSONObject userMap = new JSONObject();
        userMap.put("username", US082_CreateUserStepD.username);
        userMap.put("id", id);


        ArrayList<String> address = new ArrayList();
        address.add("Rue de l'Arnon");
        address.add("Sainte-Croix");
        address.add("Suisse");

        JSONObject addressMap = new JSONObject();
        addressMap.put("label", "Rue de l'Arnon, Sainte-Croix, Suisse");
        addressMap.put("list", address);
        addressMap.put("placeId", "Ei5SdWUgZGUgbCdBcm5vbiwgMTQ1MCBTYWludGUtQ3JvaXgsIFN3aXR6ZXJsYW5kIi4qLAoUChIJh62G63a4jUcR2t4HEFElbIoSFAoSCbc_icRkuI1HEeWIqvIIYsk6");


        ArrayList<JSONObject> available_datesList = new ArrayList();
        JSONObject available_datesMap = new JSONObject();
        available_datesMap.put("start_date", "2022-01-04T05:00:00.000Z");
        available_datesMap.put("end_date", "2022-01-04T05:00:00.000Z");
        available_datesList.add(available_datesMap);

        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");

        requestParams.put("user", userMap.toString());
        requestParams.put("address", addressMap.toString());
        requestParams.put("available_dates", available_datesList.toString());
        requestParams.put("tip", 1);
        requestParams.put("otobus", "1");
        requestParams.put("tren", "1");
        requestParams.put("tramway", "1");
        requestParams.put("arac", 1);
        requestParams.put("surface_area", 0);
        requestParams.put("bedrooms", 1);
        requestParams.put("bathrooms", 1);
        requestParams.put("toilets", 1);
        requestParams.put("singlebeds", 1);
        requestParams.put("doublebeds", 5);
        requestParams.put("childbeds", 5);
        requestParams.put("babybeds", 5);
        requestParams.put("single_putup", 5);
        requestParams.put("double_putup", 5);
        requestParams.put("child_putup", 5);
        requestParams.put("cribs", 2);
        requestParams.put("salon", 2);
        requestParams.put("teras", 1);
        requestParams.put("tv", 1);
        requestParams.put("wifi", 1);
        requestParams.put("dishwasher", 1);
        requestParams.put("dryer", 1);
        requestParams.put("washing_machine", 1);
        requestParams.put("microwave_oven", 1);
        requestParams.put("baby_gear", 1);
        requestParams.put("computer", 1);
        requestParams.put("private_garden", 1);
        requestParams.put("bbq", 1);
        requestParams.put("ac", 1);
        requestParams.put("private_parking_space", 1);
        requestParams.put("private_parking_space_paid", 1);
        requestParams.put("bicycle_child", 1);
        requestParams.put("bicycle", 1);
        requestParams.put("video_game_console", 1);
        requestParams.put("balcony", 1);
        requestParams.put("lift", 1);
        requestParams.put("warehouse", 1);
        requestParams.put("lunapark", 1);
        requestParams.put("plaj", 1);
        requestParams.put("bisiklet", 1);
        requestParams.put("muzeler", 1);
        requestParams.put("baliktutma", 1);
        requestParams.put("kayakyapma", 1);
        requestParams.put("sporsalonu", 1);
        requestParams.put("dogayuruyusu", 1);
        requestParams.put("meydan", 1);
        requestParams.put("oyunparki", 1);
        requestParams.put("helalrestorant", 1);
        requestParams.put("avm", 1);
        requestParams.put("sinema", 1);
        requestParams.put("child", true);
        requestParams.put("pet", false);
        requestParams.put("cigarette", true);
        requestParams.put("camii", 1);
        requestParams.put("carexchange", true);
        requestParams.put("petcare", false);
        requestParams.put("plantcare", true);
        requestParams.put("home_description", "V0");

        System.out.println(requestParams);

        responseDelete = given().relaxedHTTPSValidation().contentType(ContentType.MULTIPART)
                .spec(request.queryParam("secret_token", token))
                .multiPart("photo0", photo0).multiPart("photo1", photo1).multiPart("photo2", photo2).multiPart("photo3", photo3).multiPart("photo4", photo4)
                .formParams(requestParams)
                .post("/homes");

    }

    @Then("user verifies that status code is {int} for create new home")
    public void userVerifiesThatStatusCodeIsForCreateNewHome(int expectedStatusCode) {

        int actualStatusCode = responseDelete.getStatusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);
    }

    @When("user connects to {string} for search homes with {string} {string} {string} {string}")
    public void userConnectsToForSearchHomesWith(String endPoint, String bulundugu_sayfa, String address, String address_list, String order) {


        responseDelete = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .queryParam("address", address)
                .queryParam("address_list", address_list)
                .queryParam("order", order)
                .pathParam("bulundugu_sayfa", bulundugu_sayfa)
                .when()
                .get(endPoint);
        JsonPath jsonPath = responseDelete.jsonPath();
        Map<String, Object> firstIlan = (Map<String, Object>) jsonPath.getList("list").get(0);
        ilanID = (String) firstIlan.get("_id");


    }


    @Then("user verifies that status code {int} for delete home")
    public void userVerifiesThatStatusCodeForDeleteHome(int expectedStatusCode) {
        int actualStatusCode = responseDelete.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);
    }

    @Then("user verifies that delete home with request {string}")
    public void userVerifiesThatDeleteHomeWithRequest(String endPoint) {

        responseDelete = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .queryParam("secret_tokenn", token)
                .pathParam("id", ilanID)
                .when()
                .delete(endPoint);


    }

    @Then("user verifies that deletedCount {int}")
    public void userVerifiesThatDeletedCount(int expectedCount) {
        int actualCount = responseDelete.jsonPath().get("deletedCount");
        Assert.assertEquals(expectedCount,actualCount);

    }

    @Then("user verifies {int} status code with invalid {string} {string} to request {string}")
    public void userVerifiesStatusCodeWithInvalidToRequest(int expectedStatusCode, String ilanID, String token, String endPoint) {
        responseDelete = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .queryParam("secret_token", token)
                .pathParam("id", ilanID)
                .when()
                .delete(endPoint);

        int actualStatusCode = responseDelete.statusCode();
        Assert.assertEquals(expectedStatusCode,actualStatusCode);

    }
}
