package stepDefinitions_API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US098_API_StepD {
    //http://test.kese.nl/api     /rooms/id/benzerilanlar

    Response response = null;

    RequestSpecification specification = new RequestSpecBuilder()
            .setBaseUri("https://kese.nl/api").build();


    @Given("user send get request on benzer ilanlar page with this id {string} and this address {string}")
    public void userSendGetRequestOnBenzerIlanlarPageWithThisIdAndThisAddress(String id, String address) {

        String endPoint = "/rooms/" + id + "/benzerilanlar";
        System.out.println(endPoint);

        response = given().
                relaxedHTTPSValidation().

                queryParam("address_list", address).
                contentType(ContentType.JSON).
                spec(specification).
                get(endPoint);

    }

    @Then("user verifies that there are at most {int} benzer ilan listed")
    public void userVerifiesThatThereAreAtMostBenzerIlanListed(int ilanCount) {

        List<String> totalIdNumber = response.body().jsonPath().getList("_id");

        System.out.println("total number of size: " + totalIdNumber.size());
        System.out.println(response.prettyPrint());
        //response.prettyPrint();
        Assert.assertTrue(totalIdNumber.size() <= ilanCount && totalIdNumber.size() > 0);
    }

    @Then("user verifies that this {string} is not listed on the response")
    public void userVerifiesThatThisIsNotListedOnTheResponse(String id) {

        List<String> totalIdList = response.body().jsonPath().getList("_id");

        for (String e : totalIdList) {
            System.out.println("tot id ler: " + e);
            Assert.assertFalse(e.contains(id));

        }
    }

    //Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)
    @Then("user verifies that the address was sent {string} should be common with benzer ilanlar")
    public void userVerifiesThatTheAddressWasSentShouldBeCommonWithBenzerIlanlar(String address) {

        List<ArrayList<String>> totalAddressList = response.body().jsonPath().getList("address_list");

        String[] addressList = address.split(",", 3);

        List<String> fixedLengthList = Arrays.asList(addressList);

        ArrayList<String> listOfString = new ArrayList<>(fixedLengthList);


        boolean result = false;

        for (ArrayList e : totalAddressList) {


            for (String s : listOfString) {

                String trimmedListElement = s.trim();
                if (e.contains(trimmedListElement)) {

                    result = true;
                    break;
                }

            }

        }

        Assert.assertTrue(result);

    }


}
