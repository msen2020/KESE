package pages.API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class Users {

    public Response createNewUser(String email,String username, String password  ){
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(ConfigurationReader.get("url"))
                .build();
        JSONObject requestParams = new JSONObject();
        requestParams.put("email",email).put("kullanici_adi",username).put("sifre",password);
        Response response = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .post("/user/account");

        return response;
    }


    public String getValue(Response response, String responseKey ){

        JsonPath jsonPath = response.jsonPath();
        String actualResponseSonuc = jsonPath.getString(responseKey);

        return actualResponseSonuc;
    }

    // Nursel
    public Response postUserLogin(String email, String password){

        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(ConfigurationReader.get("url"))
                .build();

        JSONObject requestParams = new JSONObject();
        requestParams.put("email",email).put("sifre",password);

        Response response = given()
                            .relaxedHTTPSValidation()
                            .contentType(ContentType.JSON)
                            .spec(request)
                            .body(requestParams.toString())
                            .when()
                            .post("/user/account/login");
        return response;
    }

}
