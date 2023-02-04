package stepDefinitions_API;
// QA Engineer MSEN

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US153_API_bedAndBreakfastStepD {
    Response response;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();
    String id = "";
    String token = "";
    String ilanID = "";
    String userName = ConfigurationReader.get("test_user_name");
    List<Boolean> benzerIlanlar2;

    @Given("user logs in {string} with existing user info via post request")
    public void userLogsInWithExistingUserInfoViaPostRequest(String endpoint) {
        String email = US082_CreateUserStepD.email;
        String sifre = US082_CreateUserStepD.password;
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email);
        requestParams.put("sifre", sifre);

        response = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .post(endpoint);

        id = response.body().jsonPath().get("_id");

        token = response.body().jsonPath().get("token");
    }

    @Then("user verifies that status code is {int} for login.")
    public void userVerifiesThatStatusCodeIsForLogin(int expectedStatusCode) {
        int actualStatusCode = response.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);
    }

    @And("user creates an add on bed and breakfast page")
    public void userCreatesAnAddOnBedAndBreakfastPage() {
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
        addressMap.put("placeId", "mpoo654");


//        Date date = new Date();
//        Instant startDate = java.time.Clock.systemUTC().instant();


        ArrayList<JSONObject> available_datesList = new ArrayList();
        JSONObject available_datesMap = new JSONObject();
        available_datesMap.put("start_date", "2022-01-04T05:00:00.000Z");
        available_datesMap.put("end_date", "2022-01-04T05:00:00.000Z");
        available_datesList.add(available_datesMap);

        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/BedAndBreakfast/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/BedAndBreakfast/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/BedAndBreakfast/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/BedAndBreakfast/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/BedAndBreakfast/5.jpg");

        requestParams.put("user", userMap.toString());
        requestParams.put("address", addressMap.toString());
        requestParams.put("available_dates", available_datesList.toString());
        requestParams.put("tip", 1);
        requestParams.put("cesit", 1);
        requestParams.put("kahvalti", true);
        requestParams.put("kendineaitoda", true);
        requestParams.put("kisisayisi", 2);
        requestParams.put("cinsiyet", 1);
        requestParams.put("yasaralik", "3");
        requestParams.put("otobus", "1");
        requestParams.put("tren", "1");
        requestParams.put("tramway", "1");
        requestParams.put("arac", 1);
        requestParams.put("surface_area", 50);
        requestParams.put("bedrooms", 1);
        requestParams.put("bathrooms", 1);
        requestParams.put("toilets", 1);
        requestParams.put("teras", 1);
        requestParams.put("tv", 1);
        requestParams.put("wifi", 1);
        requestParams.put("caymakinesi", 1);
        requestParams.put("dryer", 1);
        requestParams.put("minibuzdolabi", 1);
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
        requestParams.put("kahvemakinesi", 1);
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
        requestParams.put("camii", 1);
        requestParams.put("child", true);
        requestParams.put("pet", false);
        requestParams.put("cigarette", true);
        requestParams.put("carexchange", true);
        requestParams.put("petcare", false);
        requestParams.put("plantcare", true);
        requestParams.put("home_description", "3+1");
        requestParams.put("room_description", "double_bed with AC");
        requestParams.put("breakfast_description", "V0");

        response = given().relaxedHTTPSValidation().contentType(ContentType.MULTIPART)
                .spec(request.queryParam("secret_token", token))
                .multiPart("photo0", photo0)
                .multiPart("photo1", photo1)
                .multiPart("photo2", photo2)
                .multiPart("photo3", photo3)
                .multiPart("photo4", photo4)
                .formParams(requestParams)
                .post("/bedbreakfasts");
        ilanID = response.jsonPath().get("_id");

        Assert.assertEquals(response.statusCode(), 202);
    }


    @Then("user verifies that he can see the similar adds")
    public void userVerifiesThatHeCanSeeSimilarAdds() {

        response = given().relaxedHTTPSValidation().accept(ContentType.JSON)
                .spec(request).queryParam("address_list", "Rue de l'Arnon, Sainte-Croix, Suisse")
                .pathParam("id", ilanID)
                .get("/bedbreakfasts/{id}/benzerilanlar");

        Assert.assertEquals(200, response.statusCode());

        // List<Map<String, Object>> benzerIlanlar= response.as(List.class);
        benzerIlanlar2 = response.jsonPath().getList("kahvalti");
        //assertion using with lamda expression
        benzerIlanlar2.forEach(l -> Assert.assertEquals(l, true));

    }


    @Then("user verifies that there are max {int} similar adds")
    public void userVerifiesThatThereAreMaxSimilarAdds(int addsMaxNumber) {
        Assert.assertEquals(addsMaxNumber, benzerIlanlar2.size());
    }
}
