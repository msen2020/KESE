package stepDefinitions_API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pages.API.Cargos;
import pages.API.Users;

import static org.junit.Assert.assertEquals;
// Nursel
public class US169_Cargo_Patch_StatusStepD {

    Response loginResponse = null;
    Response patchStatusResponse = null;
    String loginToken;

    @Given("user logs in with {string} and {string} with POST for user API")
    public void user_logs_in_with_and_with_POST_for_user_API(String email, String password) {

        Users user = new Users();
        loginResponse = user.postUserLogin(email, password);
        loginToken = loginResponse.body().jsonPath().get("token").toString();
    }

    @And("user updates {string} for {string} with PATCH for cargo API")
    public void user_updates_for_with_PATCH_for_cargo_API(String status, String id) {

        patchStatusResponse = new Cargos().updateCargoStatus(status, id, loginToken);
    }

    @Then("status code should be {int} and modified info should be {int} for cargo API")
    public void status_code_should_be_and_modified_info_should_be_for_cargo_API(int statusCode, int nModified) {

        assertEquals(patchStatusResponse.statusCode(), statusCode);
        assertEquals(patchStatusResponse.body().jsonPath().getInt("nModified"), nModified);
    }
}
