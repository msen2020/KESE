package stepDefinitions_API;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.API.Homes;
import utilities.TemporaryConfigUtils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US091_HomeAdsApiStepD {

    private String email = "coder52@nonmail.com";
    private String password = "1234";
    private final String apiUrl = "https://kese.nl/api";
    private String address_list = "Lorton, Virginia, Amerika Birleşik Devletleri";
    private JsonPath jsonPath = null;
    private Response response = null;
    Homes hms = new Homes();

    @When("GET all of ads on {int}. page as JSON in {string} order")
    public void orderedAdsAsJSONInPage(int page, String orderType) {
        jsonPath = given().relaxedHTTPSValidation()
//                .log().uri()
                .queryParam("address_list", address_list)
                .queryParam("order", orderType)
                .pathParam("page", page)
                .when()
                .get("https://kese.nl/api/homes/search/ilanlistesi/{page}")
                .then()
//                .log().body()
                .statusCode(200)
                .extract().jsonPath();
    }

    @Then("user asserts that there are a maximum of {int} ads")
    public void maximumNumberOfAdsOnPage(int maximumAds) {
        List<Object> adsAsJsonList = jsonPath.getList("list");
        Assert.assertTrue(adsAsJsonList.size() <= maximumAds);
    }

    @And("user asserts whether the advertisements are in {string} order")
    public void checkOrderOfAds(String orderType) {
        int countAds = jsonPath.getList("list").size();
        boolean flag = true;
        switch (orderType) {
            case "date": {
                // We get the creation date of first ad from JSON
                String dateStr = jsonPath.getString("list[0].createdAt");
                //Convert string to LocalDateTime format (Date format:  "2022-02-02T22:14:49.587Z")
                LocalDateTime dateOfAd =
                        LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
                for (int i = 1; i < countAds; i++) {
                    String dateOfNextAdStr = jsonPath.getString("list[" + i + "].createdAt");
                    //Convert string to LocalDateTime format (Date format:  "2022-02-02T22:14:49.587Z")
                    LocalDateTime dateOfNextAd =
                            LocalDateTime.parse(dateOfNextAdStr, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
                    if (dateOfNextAd.isAfter(dateOfAd)) { // If the creation date of the ad we are interested in is newer
                        flag = false;
                        break;
                    }
                    dateOfAd = dateOfNextAd;
                }
                Assert.assertTrue(flag);
                break;
            }
            case "viewed":  //okunmasayisi
            {
                // We get the number of views of first ad from JSON
                int countOfView = Integer.parseInt(jsonPath.getString("list[0].okunmasayisi"));
                for (int i = 1; i < countAds; i++) {
                    int countOfViewForNextAd = Integer.parseInt(jsonPath.getString("list[" + i + "].okunmasayisi"));
                    if (countOfViewForNextAd > countOfView) { // If the number of reads of the ad we are interested in
                        flag = false;                            // is more than the number of reads of the previous ad,
                        break;                                                                  // there is a problem.
                    }
                    countOfView = countOfViewForNextAd;
                }
                Assert.assertTrue(flag);
                break;
            }
            default:
                Assert.fail(orderType + " not implemented.");
        }
    }

    @Given("GET secret_token, id and user name for authorized user")
    public void getTokenIdNameForAuthorizedUser() {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("email", email);
        credentials.put("sifre", password);
        jsonPath = given()
                .relaxedHTTPSValidation()
//                .log().uri()
                .contentType(ContentType.JSON)
                .body(credentials)
                .when()
                .post(apiUrl + "/user/account/login")
                .then()
//                .log().body()
                .statusCode(200)
                .extract().jsonPath();
        TemporaryConfigUtils.deleteTemporaryFile();
        TemporaryConfigUtils.writeDataToTemporaryFile("username", jsonPath.getString("kullanici_adi"));
        TemporaryConfigUtils.writeDataToTemporaryFile("secret_token", jsonPath.getString("token"));
        TemporaryConfigUtils.writeDataToTemporaryFile("userId", jsonPath.getString("_id"));

    }

    @Then("POST a new home advertisement and get id of it")
    public void postANewHomeAdvertisementAndGetIdOfIt() {
        File photo0 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/home/1.jpg");
        File photo1 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/home/2.jpg");
        File photo2 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/home/3.jpg");
        File photo3 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/home/4.jpg");
        File photo4 = new File(System.getProperty("user.dir") + "/src/test/resources/pictures/home/5.jpg");

        String username = TemporaryConfigUtils.readDataFromTemporaryFile("username");
        String secret_token = TemporaryConfigUtils.readDataFromTemporaryFile("secret_token");
        String userId = TemporaryConfigUtils.readDataFromTemporaryFile("userId");
        // Change user name and password
        Homes homes = new Homes();
        Map<String, Object> formParameters = homes.dataMap();
        formParameters.replace("user", "{\"username\": \"" + username + "\", \"id\" : \"" + userId + "\"}");
        // Get home Id
        String homeId = given().relaxedHTTPSValidation()
                .queryParam("secret_token", secret_token)
                .formParams(formParameters)
                .contentType(ContentType.JSON)
                .contentType("multipart/form-data; charset=UTF-8")  // Türkçe karakterler için gerekli charset-UTF-8
                .multiPart("photo0", photo0)
                .multiPart("photo1", photo1)
                .multiPart("photo2", photo2)
                .multiPart("photo3", photo3)
                .multiPart("photo4", photo4)
                .when()
                .post(apiUrl + "/homes")
                .then()
//                .log().body()
                .statusCode(202)
                .extract()
                .jsonPath()
                .getString("_id");
        TemporaryConfigUtils.writeDataToTemporaryFile("homeId", homeId);
    }

    @And("DELETE the advertisement with users secret_token and id of home")
    public void deleteHomeAd() {
        response = given()
                .relaxedHTTPSValidation()
                .pathParam("id", TemporaryConfigUtils.readDataFromTemporaryFile("homeId"))
                .queryParam("secret_token", TemporaryConfigUtils.readDataFromTemporaryFile("secret_token"))
                .contentType("application/json; charset=UTF-8")
                .when()
                .delete(apiUrl + "/homes/{id}")
        ;

    }

    @Then("user asserts that home has been by authorized user deleted")
    public void userAssertsThatHomeHasBeenByAuthorizedUserDeleted() {
        response.then().statusCode(200);
    }

    @And("DELETE the advertisement with unauthorized user")
    public void deleteTheAdvertisementWithUnauthorizedUser() {
        response = given()
                .relaxedHTTPSValidation()
                .pathParam("id", TemporaryConfigUtils.readDataFromTemporaryFile("homeId"))
                .contentType("application/json; charset=UTF-8")
                .when()
                .delete(apiUrl + "/homes/{id}")
        ;

    }

    @Then("user asserts that home has been by unauthorized user not deleted")
    public void userAssertsThatHomeHasBeenByUnauthorizedUserNotDeleted() {
        response.then().statusCode(401);
    }
}
