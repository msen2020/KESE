package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US003_MainPageOdaKiralaStepD {

    MainPage mainPage = new MainPage();

    @Then("the user verifies that the {string} button is displayed and clickable")
    public void theUserVerifiesThatTheButtonIsDisplayedAndClickable(String odaKiralaButton) {
        Assert.assertTrue(mainPage.odaKiralaButton.isDisplayed());
        Assert.assertTrue(mainPage.odaKiralaButton.isEnabled());

    }

    @When("the user clicks the Oda Kirala button")
    public void the_user_clicks_the_Oda_Kirala_button() {
        mainPage.odaKiralaButton.click();
    }

    @Then("the user verifies that the Oda Kirala Button is selected")
    public void theUserVerifiesThatTheOdaKiralaButtonIsSelected() {
        Assert.assertFalse(mainPage.odaKiralaButton.isSelected());
        boolean isodaKiralaButtonSelected = mainPage.odaKiralaButton.isEnabled();
        System.out.println("Is the Oda Kirala Button Button Selected?  " + isodaKiralaButtonSelected);
        Assert.assertTrue(isodaKiralaButtonSelected);

    }

    @Then("the user verifies that the text {string} is displayed.")
    public void theUserVerifiesThatTheTextShouldIsDisplayed(String text) {

        Assert.assertTrue(mainPage.odaDegisimiYapmakIstediginizYerText.isDisplayed());
        System.out.println(text);

    }

    @Then("the user verifies that ilan ara input is enabled")
    public void theUserVerifiesThatIlanAraInputIsEnabled() {
        Assert.assertTrue(mainPage.evDegisimiButton.isEnabled());
        boolean isEvDegisimiButtonEnabled = mainPage.evDegisimiButton.isEnabled();
        System.out.println("Is the Ev Degisimi Button Enabled?  " + isEvDegisimiButtonEnabled);
        Assert.assertTrue(isEvDegisimiButtonEnabled);
    }


}


