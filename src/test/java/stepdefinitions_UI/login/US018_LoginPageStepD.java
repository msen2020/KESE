package stepdefinitions_UI.login;

import com.kese.pages.UI.LogginPage;
import com.kese.pages.UI.LoginPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US018_LoginPageStepD {

    LogginPage logginPage = new LogginPage();

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String loginPageUrl) {
        Driver.get().get(loginPageUrl);
    }

    @When("user enters valid username {string}")
    public void userEntersValidUsername(String userName) {

        LogginPage.entersUserName(userName);
    }

    @And("user enters valid password {string}")
    public void userEntersValidPassword(String password) {

        LogginPage.enterPassword(password);
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {

        LogginPage.clickSubmitbutton();
    }

    @Then("user gets the url of the page")
    public void userGetsTheUrlOfThePage() {

        String currentUrl = BrowserUtils.myGetCurrentUrlMethod();

    }

    @And("page url should be {string}")
    public void pageUrlShouldBe(String expectedUrl) {

        System.out.println("You are at the " + expectedUrl + " Page");
        Assert.assertTrue((Driver.get().getCurrentUrl().contains(expectedUrl)));
    }

    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String invalidPassword) {

        LogginPage.enterPassword(invalidPassword);

    }

    @Then("user should get the message {string}")
    public void userShouldGetTheMessage(String expectederrorMessage) {

        String currentErrorMessage = LoginPage.getErrorMessage();
        Assert.assertTrue(expectederrorMessage.contains(currentErrorMessage));

    }

    @When("users enter invalid username {string}")
    public void usersEnterInvalidUsername(String invalidUsername) {

        LogginPage.entersUserName(invalidUsername);
    }

    @When("user enters invalid username {string}")
    public void userEntersInvalidUsername(String invalidUsername) {

        LogginPage.entersUserName(invalidUsername);
        
    }
}
