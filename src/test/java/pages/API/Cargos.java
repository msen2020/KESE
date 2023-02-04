package pages.API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class Cargos {

    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();
    //Nursel

    public Response updateCargoStatus(String status, String id, String token){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", id);
        jsonObject.put("status", status);

        return given()
                .relaxedHTTPSValidation()
                .queryParam("secret_token", token)
                .contentType(ContentType.JSON)
                .spec(request)
                .body(jsonObject.toString())
                .patch("/cargos/status");
    }
}
