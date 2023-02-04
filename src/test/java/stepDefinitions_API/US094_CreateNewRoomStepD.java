package stepDefinitions_API;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class US094_CreateNewRoomStepD {
    public static String roomID;
    public static String tokenID;
    public static String userID;
    public static String username;
    public static String address = "{\"label\" : \"London, Birleşik Krallık\", \"list\" : [\"London\", \"Birleşik Krallık\"], \"placeId\" : \"ChIJdd4hrwug2EcRmSrV3Vo6llI\"}";
    public static String dates = "[{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]";
    Response response = null;
    Response response1 = null;
    RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api")
            .build();

    @Given("user logged in with API")
    public void user_logged_in_with_api() {
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("email", "kullanici3@gmail.com");
        userInfo.put("sifre", "1234");

        response = given().relaxedHTTPSValidation().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(userInfo)
                .when().post("https://kese.nl/api/user/account/login");
        response.prettyPrint();
        tokenID = response.path("token").toString();
        userID = response.path("_id").toString();
        username = response.path("kullanici_adi").toString();
        System.out.println("username = " + username);
        System.out.println("userID = " + userID);
        System.out.println("tokenID = " + tokenID);

    }

    @When("user enters required data")
    public void user_enters_required_data() {
        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_5.jpg");
        Random rn = new Random();
        Map<String, Object> reqData = new HashMap<>();
        reqData.put("user", "{\"username\":\"" + username + "\",\"id\":\"" + userID + "\"}");
        reqData.put("address", address);
        reqData.put("available_dates", dates);
        reqData.put("tip", rn.nextInt(3));
        reqData.put("degisim", rn.nextInt(2));
        reqData.put("kirala", rn.nextInt(2));
        reqData.put("membercount", rn.nextInt(15) + 1); //1-15 dahil
        reqData.put("cinsiyet", rn.nextInt(3));
        reqData.put("yasaralik", "[" + (rn.nextInt(3) + 1) + "," + (rn.nextInt(3) + 1) + "]");
        reqData.put("otobus", rn.nextInt(2));
        reqData.put("tren", rn.nextInt(2));
        reqData.put("tramway", rn.nextInt(2));
        reqData.put("arac", rn.nextInt(2));
        reqData.put("surface_area", rn.nextInt(300) + 101); //0-300 100den 200e kadar
        reqData.put("bedrooms", rn.nextInt(10) + 1);
        reqData.put("bathrooms", rn.nextInt(10) + 1);
        reqData.put("toilets", rn.nextInt(2));
        reqData.put("salon", rn.nextInt(2));
        reqData.put("teras", rn.nextInt(2));
        reqData.put("tv", rn.nextInt(2));
        reqData.put("wifi", rn.nextInt(2));
        reqData.put("dishwasher", rn.nextInt(2));
        reqData.put("dryer", rn.nextInt(2));
        reqData.put("washing_machine", rn.nextInt(2));
        reqData.put("microwave_oven", rn.nextInt(2));
        reqData.put("baby_gear", rn.nextInt(2));
        reqData.put("computer", rn.nextInt(2));
        reqData.put("private_garden", rn.nextInt(2));
        reqData.put("bbq", rn.nextInt(2));
        reqData.put("ac", rn.nextInt(2));
        reqData.put("private_parking_space", rn.nextInt(2));
        reqData.put("private_parking_space_paid", rn.nextInt(2));
        reqData.put("bicycle_child", rn.nextInt(2));
        reqData.put("bicycle", rn.nextInt(2));
        reqData.put("video_game_console", rn.nextInt(2));
        reqData.put("balcony", rn.nextInt(2));
        reqData.put("lift", rn.nextInt(2));
        reqData.put("warehouse", rn.nextInt(2));
        reqData.put("lunapark", rn.nextInt(2));
        reqData.put("plaj", rn.nextInt(2));
        reqData.put("bisiklet", rn.nextInt(2));
        reqData.put("muzeler", rn.nextInt(2));
        reqData.put("baliktutma", rn.nextInt(2));
        reqData.put("kayakyapma", rn.nextInt(2));
        reqData.put("sporsalonu", rn.nextInt(2));
        reqData.put("dogayuruyusu", rn.nextInt(2));
        reqData.put("meydan", rn.nextInt(2));
        reqData.put("oyunparki", rn.nextInt(2));
        reqData.put("helalrestorant", rn.nextInt(2));
        reqData.put("avm", rn.nextInt(2));
        reqData.put("sinema", rn.nextInt(2));
        reqData.put("camii", rn.nextInt(2));
        reqData.put("pet", rn.nextBoolean());
        reqData.put("cigarette", rn.nextBoolean());
        reqData.put("plantcare", rn.nextBoolean());
        reqData.put("room_description", "US094_Sample_Text");

        response1 = given().relaxedHTTPSValidation().queryParam("secret_token", tokenID)
                .multiPart("photo0", photo0)
                .multiPart("photo1", photo1)
                .multiPart("photo2", photo2)
                .multiPart("photo3", photo3)
                .multiPart("photo4", photo4)
                .and().formParams(reqData)
                .contentType("multipart/form-data; charset=UTF-8")
                .when().spec(spec)
                .post("/rooms");
        response1.prettyPrint();
        System.out.println("response1.statusCode() = " + response1.statusCode());
        roomID = response1.path("_id").toString();
        System.out.println("roomID = " + roomID);

    }

    @Then("verify status code is {int}")
    public void verify_status_code_is(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response1.statusCode());
    }

    @When("user enters all requirement data without sending secret token")
    public void user_enters_all_requirement_data_without_sending_secret_token() {
        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/rooms/Room_5.jpg");
        Random rn = new Random();
        Map<String, Object> reqData = new HashMap<>();
        reqData.put("user", "{\"username\":\"" + username + "\",\"id\":\"" + userID + "\"}");
        reqData.put("address", address);
        reqData.put("available_dates", dates);
        reqData.put("tip", rn.nextInt(3));
        reqData.put("degisim", rn.nextInt(2));
        reqData.put("kirala", rn.nextInt(2));
        reqData.put("membercount", rn.nextInt(15) + 1); //1-15 dahil
        reqData.put("cinsiyet", rn.nextInt(3));
        reqData.put("yasaralik", "[" + (rn.nextInt(3) + 1) + "," + (rn.nextInt(3) + 1) + "]");
        reqData.put("otobus", rn.nextInt(2));
        reqData.put("tren", rn.nextInt(2));
        reqData.put("tramway", rn.nextInt(2));
        reqData.put("arac", rn.nextInt(2));
        reqData.put("surface_area", rn.nextInt(300) + 101); //0-300 100den 200e kadar
        reqData.put("bedrooms", rn.nextInt(10) + 1);
        reqData.put("bathrooms", rn.nextInt(10) + 1);
        reqData.put("toilets", rn.nextInt(2));
        reqData.put("salon", rn.nextInt(2));
        reqData.put("teras", rn.nextInt(2));
        reqData.put("tv", rn.nextInt(2));
        reqData.put("wifi", rn.nextInt(2));
        reqData.put("dishwasher", rn.nextInt(2));
        reqData.put("dryer", rn.nextInt(2));
        reqData.put("washing_machine", rn.nextInt(2));
        reqData.put("microwave_oven", rn.nextInt(2));
        reqData.put("baby_gear", rn.nextInt(2));
        reqData.put("computer", rn.nextInt(2));
        reqData.put("private_garden", rn.nextInt(2));
        reqData.put("bbq", rn.nextInt(2));
        reqData.put("ac", rn.nextInt(2));
        reqData.put("private_parking_space", rn.nextInt(2));
        reqData.put("private_parking_space_paid", rn.nextInt(2));
        reqData.put("bicycle_child", rn.nextInt(2));
        reqData.put("bicycle", rn.nextInt(2));
        reqData.put("video_game_console", rn.nextInt(2));
        reqData.put("balcony", rn.nextInt(2));
        reqData.put("lift", rn.nextInt(2));
        reqData.put("warehouse", rn.nextInt(2));
        reqData.put("lunapark", rn.nextInt(2));
        reqData.put("plaj", rn.nextInt(2));
        reqData.put("bisiklet", rn.nextInt(2));
        reqData.put("muzeler", rn.nextInt(2));
        reqData.put("baliktutma", rn.nextInt(2));
        reqData.put("kayakyapma", rn.nextInt(2));
        reqData.put("sporsalonu", rn.nextInt(2));
        reqData.put("dogayuruyusu", rn.nextInt(2));
        reqData.put("meydan", rn.nextInt(2));
        reqData.put("oyunparki", rn.nextInt(2));
        reqData.put("helalrestorant", rn.nextInt(2));
        reqData.put("avm", rn.nextInt(2));
        reqData.put("sinema", rn.nextInt(2));
        reqData.put("camii", rn.nextInt(2));
        reqData.put("pet", rn.nextBoolean());
        reqData.put("cigarette", rn.nextBoolean());
        reqData.put("plantcare", rn.nextBoolean());
        reqData.put("room_description", "US094_Sample_Text");


        response1 = given().relaxedHTTPSValidation()
                .multiPart("photo0", photo0)
                .multiPart("photo1", photo1)
                .multiPart("photo2", photo2)
                .multiPart("photo3", photo3)
                .multiPart("photo4", photo4)
                .and().formParams(reqData)
                .contentType("multipart/form-data; charset=UTF-8")
                .when().spec(spec)
                .post("/rooms");
        response1.prettyPrint();
        System.out.println("response1.statusCode() = " + response1.statusCode());
    }


}
