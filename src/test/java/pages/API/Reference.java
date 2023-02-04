package pages.API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
//Nursel
public class Reference {

    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();

    public Response createNewReference(String userToken, String memberEmail){

        JSONObject requestParams = new JSONObject();
        requestParams.put("reference_member",memberEmail);

        Response response = given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .queryParam("secret_token",userToken)
                .when()
                .post("/reference");

        return response;
    }


 }
