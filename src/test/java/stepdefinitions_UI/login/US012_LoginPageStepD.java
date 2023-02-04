package stepdefinitions_UI.login;

import com.kese.pages.UI.LoginPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US012_LoginPageStepD {

    LoginPage page = new LoginPage();

    @Given("the user is on the login page as this url {string}")
    public void theUserIsOnTheLoginPageAsThisUrl(String loginPageUrl) {
        Driver.get().get(loginPageUrl);

    }

    @Then("the user verifies that the link {string} is displayed")
    public void theUserVerifiesThatTheLinkIsDisplayed(String expectedMessage) {

        String actualText = LoginPage.getMyText();
        Assert.assertEquals(actualText, expectedMessage);
        System.out.println(expectedMessage);
    }

    @Then("the user verifies that the link Sifremi Unuttum should be active")
    public void theUserVerifiesThatTheLinkSifremiUnuttumShouldBeActive() {
        boolean myActualResult = LoginPage.isMyElementDisplayed();
        Assert.assertTrue(myActualResult);
        System.out.println(myActualResult);
    }

    @Then("the user verifies that the link Sifremi Unuttum is {string}")
    public void theUserVerifiesThatTheLinkSifremiUnuttumIs(String expectedCssValue) {
        String actualMessage = LoginPage.getMyCss();
        Assert.assertTrue(actualMessage.contains(expectedCssValue));
        System.out.println(expectedCssValue);

    }

    @When("the user clicks on the Sifremi Unuttum link")
    public void theUserClicksOnTheSifremiUnuttumLink() {
        page.sifremiUnuttumButton.click();

    }

    @Then("user should be redirected to {string} page")
    public void userShouldBeRedirectedToPage(String expectedUrl) {
        String actualUrl = LoginPage.getMyPageUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        System.out.println(expectedUrl);

    }
}
