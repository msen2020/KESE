package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class US083KullaniciBilgileriGuncellemeStepD {

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZjg4MDNkOGNhN2VjNDM2YzViODhhZiIsImVtYWlsIjoiYXppemkuMTRAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6ImF6aXozNDM4IiwiZHVydW0iOjF9LCJpYXQiOjE2NDM4OTc3NDAsImV4cCI6MTY3NTQzMzc0MH0.2zWIRRSvKaVDWba0B1CsqRSHWH4r9dNGaDX5ImAFq4Y";
    String url = "http://test.kese.nl/api/user/account";  //kullanmadim
    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setRelaxedHTTPSValidation()
            .setContentType(ContentType.JSON)
            .setBaseUri("https://kese.nl/api")
            .build();


    @Given("assert that user connects to {string}")
    public void assertThatUserConnectsTo(String endPoint) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "azizi.14@gmail.com");
        jsonObject.put("sifre", "1234");

        response = given()
                .spec(request)
                .body(jsonObject.toString())
                .post(endPoint + "/login");

        System.out.println("response.statusCode() = " + response.statusCode());
        assertEquals(200, response.getStatusCode());
        response.prettyPrint();
        String token = response.jsonPath().getString("token"); //dinamik token alindi daha sonra istenirse kullanilabilir
        System.out.println("token = " + token);

    }


    @Then("user updates their info and verifies status code")
    public void userUpdatesTheirInfoAndVerifiesStatusCode() {
        //bu kisim body olarak put yapmak icin

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "azizi.14@gmail.com");
        jsonObject.put("kullanici_adi", "aziz40");

        /*
         Map<String, Object> putMap = new HashMap<>();
         putMap.put("email", "azizi.14@gmail.com");  burayi kullanmadim ama dursun burasi da
         putMap.put("kullanici_adi", "ahmet");
         */

        response = given().queryParam("secret_token", token)
                .spec(request)
                .body(jsonObject.toString()) //bodyi burda yolluyoruz
                .when()
                .patch("/user/account");
        response.prettyPrint();
        System.out.println("response.statusCode() = " + response.statusCode());
        assertEquals(202, response.statusCode());
    }

    @Given("assert that user connects with invalid credential and verifies status code")
    public void assertThatUserConnectsWithInvalidCredentialAndVerifiesStatusCode() {

        String invalidToken = "invalidToken";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "azizi.14@gmail.com");
        jsonObject.put("kullanici_adi", "aziz40");

        response = given().queryParam("secret_token", invalidToken)
                .spec(request)
                .body(jsonObject.toString())
                .when()
                .patch("/user/account");

        response.prettyPrint(); //body ekrana yazdir
        System.out.println("response.statusCode() = " + response.statusCode()); //status code ekrana yazdir
        assertEquals(401, response.statusCode());

    }

    @Given("assert that can not patch with invalid email address")
    public void assertThatCanNotPatchWithInvalidEmailAddress() {

        String invalidToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYxZjg4MDNkOGNhN2VjNDM2YzViODhhZiIsImVtYWlsIjoiYXppemkuMTRAZ21haWwuY29tIiwicm9sIjoia3VsbGFuaWNpIiwia3VsbGFuaWNpX2FkaSI6ImF6aXozNDM4IiwiZHVydW0iOjF9LCJpYXQiOjE2NDM4OTc3NDAsImV4cCI6MTY3NTQzMzc0MH0.2zWIRRSvKaVDWba0B1CsqRSHWH4r9dNGaDX5ImAFq4Y";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "azizi.14gmail.com");
        jsonObject.put("kullanici_adi", "aziz40");

        response = given().queryParam("secret_token", invalidToken)
                .spec(request)
                .body(jsonObject.toString())
                .when()
                .patch("/user/account");

        response.prettyPrint(); //body ekrana yazdir
        System.out.println("response.statusCode() = " + response.statusCode()); //status code ekrana yazdir
        assertEquals(200, response.statusCode());
        System.out.println("response.jsonPath().getString(\"sonuc\") = " + response.jsonPath().getString("sonuc")); //patch yapinca gelen bodydeki sonuc property degerini aliyor
        assertEquals("false", response.jsonPath().getString("sonuc"));
        System.out.println("response.getBody().jsonPath().get(\"sonuc\") = " + response.getBody().jsonPath().get("sonuc")); //buda yukardaki kodla ayni isi yapiyor.
    }
}
