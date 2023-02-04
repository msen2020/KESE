package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US002_MainPageStepD {
    MainPage mainPage = new MainPage();

    @Given("User is on the login page")
    public void user_is_on_login_the_page_http_test_kese_nl() {

        Driver.get().get(ConfigurationReader.get("ui_url"));

    }

    @Then("the user verifies that the {string} button is displayed and enabled")
    public void theUserVerifiesThatTheButtonIsDisplayedAndEnabled(String button) {

        Assert.assertTrue(mainPage.evDegisimiButton.isDisplayed());
        boolean isEvDegisimiButtonDisplayed = mainPage.evDegisimiButton.isDisplayed();
        System.out.println("Is the Ev Degisimi Button Displayed?  " + isEvDegisimiButtonDisplayed);
        Assert.assertTrue(isEvDegisimiButtonDisplayed);

        Assert.assertTrue(mainPage.evDegisimiButton.isEnabled());
        boolean isEvDegisimiButtonEnabled = mainPage.evDegisimiButton.isEnabled();
        System.out.println("Is the Ev Degisimi Button Enabled?  " + isEvDegisimiButtonEnabled);
        Assert.assertTrue(isEvDegisimiButtonEnabled);

    }

    @When("the user clicks Ev Degisimi Button")
    public void theUserClicksEvDegisimiButton() {
        mainPage.evDegisimiButton.click();
    }

    @Then("the user verifies that Ev Degisimi is selected")
    public void theUserVerifiesThatEvDegisimiIsSelected() {
        Assert.assertFalse(mainPage.evDegisimiButton.isSelected());
        boolean isEvDegisimiButtonSelected = mainPage.evDegisimiButton.isEnabled();
        System.out.println("Is the Ev Degisimi Button Selected?  " + isEvDegisimiButtonSelected);
        Assert.assertTrue(isEvDegisimiButtonSelected);

    }

    @Then("the user verifies that the text {string} is displayed")
    public void theUserVerifiesThatTheTextIsDisplayed(String text) {
        Assert.assertTrue(mainPage.evDegisimiYeriText.isDisplayed());
        boolean isTextDisplayed = mainPage.evDegisimiYeriText.isDisplayed();
        System.out.println("Is the text displayed?  " + isTextDisplayed);
        Assert.assertTrue(isTextDisplayed);

    }

    @And("the user enters {string} into the ilan Ara inbox")
    public void theUserEntersIntoTheIlanAraInbox(String arg0) {

        mainPage.ilanAraInputBox.sendKeys("Sevilla");
        BrowserUtils.waitFor(1);
        mainPage.ilanAraInputBox.sendKeys(Keys.ENTER);

    }

    @When("the user clicks the Ilan Ara Button")
    public void theUserClicksTheIlanAraButton() {
        mainPage.ilanAraButton.click();
    }

    @Then("the user verifies that the Ilan results are displayed on the result page")
    public void theUserVerifiesThatTheIlanResultsOnIsDisplayedOnTheResultPage() {
        String ilanResultText = mainPage.ilanResultText.getText();
        Assert.assertEquals(mainPage.ilanResultText.getText(), "Sevilla, İspanya: 0 ev bulundu");
        System.out.println("ilanResultText = " + ilanResultText);
    }

    @Given("The user verifies that he can see the text {string}")
    public void theUserVerifiesThatHeCanSeeTheText(String expectedtext) {

        String actualtext = mainPage.ilanAraButton.getText();
        Assert.assertEquals(expectedtext, actualtext);

    }


}
