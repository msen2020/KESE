package stepDefinitions_API;

import com.github.javafaker.Faker;
import com.kese.pages.API.Users;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;


public class US082_CreateUserStepD {

    Users users = new Users();

    public static Faker faker = new Faker();
    public static String username = faker.name().username();
    public static String email = faker.internet().emailAddress();
    public static String password = "1234";

    Response response = null;

    @Given("user creates new user")
    public void user_creates_new_user() {

        response = users.createNewUser(email, username, password);

    }

    @Then("user verifies that status code is {int} for create user")
    public void user_verifies_that_status_code_is(int expectedStatusCode) {

        int actualStatusCode = response.statusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);

    }

    @Then("user verifies that response body has {string} is {string}")
    public void user_verifies_that_response_body_has_sonuc_is(String responseKey, String expectedResponseSonuc) {

        String actualResponseSonuc = users.getValue(response, responseKey);
        Assert.assertEquals(expectedResponseSonuc, actualResponseSonuc);

    }

    @Given("user creates new user with used mail")
    public void user_creates_new_user_with_used_mail() {


        response = users.createNewUser("Aykut@mail.com", username, password);

    }

    @Given("user creates new user with used username")
    public void user_creates_new_user_with_used_username() {

        response = users.createNewUser(email, "Aykut", password);

    }

    @Given("user creates new user with invalid {string}, {string} and {string}")
    public void userCreatesNewUserWithAnd(String invalidEmail, String invalidUsername, String invalidPassword) {
        response = users.createNewUser(invalidEmail, invalidUsername, invalidPassword);

    }
}
