package stepDefinitions_API;


import com.kese.utilities.TemporaryConfigUtils;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;

public class US164_CreatNewCargoAd {


    @Then("POST a new cargo transport ad")
    public void postANewCargoTransportAd() {
        String username = TemporaryConfigUtils.readDataFromTemporaryFile("username");
        String userId = TemporaryConfigUtils.readDataFromTemporaryFile("userId");
        String secret_token = TemporaryConfigUtils.readDataFromTemporaryFile("secret_token");
        System.out.println(secret_token);
        given()
                .relaxedHTTPSValidation()
                .log().all()
                .queryParam("secret_token", secret_token)
                .formParam("user", "{\"username\": \""+username+"\", \"id\" : \""+userId+"\"}")
                .formParam("baslangic_address "," {\"label\" : \"Lorton, Virginia, Amerika Birleşik Devletleri\", \"list\" : [\"Lorton\",\"Virginia\" ,\"Amerika Birleşik Devletleri\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}")
                .formParam("bitis_address ", "{\"label\" : \"Amsterdam, Hollanda\", \"list\" : [\"Amsterdam\",\"Hollanda\"], \"placeId\" : \"ChIJoaSgdMNStokRo_WCsliVI68\"}")
                .formParam("available_dates ", " [{\"start_date\" : \"2022-01-04T05:00:00.000Z\" ,\"end_date\" : \"2022-01-04T05:00:00.000Z\"}]")
                .formParam("tip", "[1,2,3]")
                .formParam("saat", "14:30")
                .formParam("destination_list","[ { \"label\": \"Utrecht, Hollanda\", \"list\": [ \"Utrecht\", \"Hollanda\" ], \"placeId\": \"ChIJNy3TOUNvxkcR6UqvGUz8yNY\", \"lat\": 52.09073739999999, \"lng\": 5.1214201 }, { \"label\": \"Arnhem, Hollanda\", \"list\": [ \"Arnhem\", \"Hollanda\" ], \"placeId\": \"ChIJcyKbzpG6x0cR18pz-eBaHBY\", \"lat\": 51.9851034, \"lng\": 5.898729599999999 } ]")
                .formParam("car_description ", "Lory")
//                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .accept("multipart/form-data")
                .contentType("application/json; charset=utf-8")
                .when()
                .post("https://kese.nl/api/cargos")
                .then()
                .log().all()
                .contentType("text/html; charset=utf-8")
                .statusCode(202);




    }


}
