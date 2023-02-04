package stepDefinitions_API;

import com.kese.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class US092_HomesBenzerIlanlarGetApiStepD {

    //http://test.kese.nl/api/homes/61fe52dae970093ad0e4bef3/benzerilanlar?address=Frankfurt, Almanya&address_list=Frankfurt, Almanya

    Response response = null;
    RequestSpecification request = new RequestSpecBuilder()
            .setBaseUri(ConfigurationReader.get("url"))
            .build();


    @Given("connect to home benzerilanlar with endpoint {string}  query data {string} use get")
    public void connectToHomeBenzerilanlarWithEndpointQueryDataUseGet(String id, String query) {
        response =given().relaxedHTTPSValidation().
                contentType(ContentType.JSON).
                spec(request).
                get("/homes/"+id+"/benzerilanlar"+query);

        response.prettyPrint();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Then("verify the response includes maximum of {int} advertisements")
    public void verifyTheResponseIncludesMaximumOfAdvertisements(int numberOfHomes) {

        JsonPath jsonPath = response.body().jsonPath();
        List<String> addressList = jsonPath.getList("address_list");
        int advertisementNum = addressList.size();
        System.out.println(advertisementNum);
        if (!addressList.isEmpty()) {
           Assert.assertTrue(0<advertisementNum && advertisementNum<=numberOfHomes);
        }else{
           Assert.assertFalse(advertisementNum>numberOfHomes);
        }

    }

    @Then("verify the id list should not include sent id {string}")
    public void verifyTheIdListShouldNotIncludeSentId(String homeId) {
        List<String> idList = response.body().jsonPath().getList("_id");
            Assert.assertFalse(idList.contains(homeId));

    }

    @Then("verify address information must be same as at least one of {string} and {string}")
    public void verifyAddressInformationMustBeSameAsAtLeastOneOfAnd(String address1, String address2) {
        JsonPath jsonPath = response.body().jsonPath();
        List<String> addressList = jsonPath.getList("address_list");
        for (int i = 0; i < addressList.size(); i++) {
            boolean address1Inculuded = (jsonPath.getString("address_list[" + i + "]").contains(address1));
            boolean address2Inculuded = (jsonPath.getString("address_list[" + i + "]").contains(address2));
            Assert.assertTrue((address1Inculuded && address2Inculuded) || address2Inculuded);

        }
    }


}