package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.SignUpPage;
import com.kese.stepdefinitions_UI.mainPage.US004_MainPageStepD;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US021_signupPageStepD {

    SignUpPage signUpPage = new SignUpPage();
    US004_MainPageStepD pageStepD = new US004_MainPageStepD();

    @Given("the user goes to the {string} page")
    public void theUserGoesToThePage(String arg0) {
        Driver.get().get(ConfigurationReader.get("signup_url"));

    }

    @And("the user types a {string}")
    public void theUserTypesA(String username) {
        signUpPage.kullaniciAdi.sendKeys(BrowserUtils.generateAName());
    }

    @When("the user types a valid {string} into the email Box")
    public void theUserTypesAValidIntoTheEmailBox(String email) {
        signUpPage.emailAdres.sendKeys(BrowserUtils.generateAnEmail());
    }

    @When("the user types {string}")
    public void theUserTypes(String sifre) {
        signUpPage.sifreBox.sendKeys(sifre);

    }

    @And("the user retypes the same {string}")
    public void theUserRetypesTheSame(String retypeSifre) {
        signUpPage.sifreTekrariBox.sendKeys(retypeSifre);

    }

    @Then("the user verifies that the inputs of Sifre are the same")
    public void theUserVerifiesThatTheInputsOfSifreAreTheSame() {
        Assert.assertEquals(signUpPage.signupPasswordBox.getText(), signUpPage.reInputPassword.getText());
    }

    @When("the user accepts the terms of use and privacy policy.")
    public void theUserAcceptsTheTermsOfUseAndPrivacyPolicy() {
        signUpPage.privacyPolicyCheckBox.click();
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
        signUpPage.kayitOlusturButton.click();

    }

    @Then("the user verifies that the text {string} is displayed")
    public void the_user_verifies_that_the_text_is_displayed(String text) {
        Assert.assertEquals(signUpPage.kaydinizOlusturulduText.getText(), text);

    }

    @And("the user retypes {string} with a mistake")
    public void theUserRetypesWithAMistake(String retypeSifre) {
        signUpPage.sifreTekrariBox.sendKeys(retypeSifre);

    }

    @Then("the user verifies that the warning message {string} is displayed")
    public void theUserVerifiesThatTheWarningMessageIsDisplayed(String message) {
        Assert.assertEquals(signUpPage.sifrelerUyusmuyorText.getText(), message);
    }
}
