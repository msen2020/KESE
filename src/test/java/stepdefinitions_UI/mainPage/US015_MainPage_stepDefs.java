package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.SignUpPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US015_MainPage_stepDefs {

    @Given("the user goes to {string} page")
    public void theUserGoesToPage(String signupPageUrl) {

        Driver.get().get(signupPageUrl);

    }

    @And("the user asserts that the Giris Yap Button is visible and enabled")
    public void theUserAssertsTheGirisYapButtonIsVisibleAndEnabled() {

        boolean isDisplayed = SignUpPage.girisYapButtonIsDisplayed();
        boolean isEnabled = SignUpPage.girisYapButtonIsEnabled();
        Assert.assertTrue(isDisplayed);
        Assert.assertTrue(isEnabled);
    }

    @When("the user clicks Giris Yap button")
    public void theUserClicksGirisYapButton() {
        SignUpPage.clickGirisYapButton();
    }

    @Then("the user asserts that he is able to go to {string} page")
    public void theUserAssertsThatHeIsAbleToGoToPage(String expectedUrl) {
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);
        System.out.println(expectedUrl);
    }
}
