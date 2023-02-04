package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US005_MainPage_BaB_StepD {

    MainPage mainPage = new MainPage();

    @Then("the user verifies that the Bed & Breakfast button is displayed and clickable")
    public void theUserVerifiesThatTheBedBreakfastButtonIsDisplayedAndClickable() {
        Assert.assertTrue(mainPage.bedAndBreakfastOption3.isDisplayed());
        Assert.assertTrue(mainPage.bedAndBreakfastOption3.isEnabled());
    }

    @When("the user clicks the Bed & Breakfast button")
    public void theUserClicksTheBedBreakfastButton() {
        mainPage.bedAndBreakfastOption3.click();
    }

    @Then("the user verifies that Bed & Breakfast is selected")
    public void theUserVerifiesThatBedBreakfastIsSelected() {
        mainPage.bedAndBreakfastOption3.isSelected();
    }

    @Then("the user verifies that the text {string} is visible.")
    public void theUserVerifiesThatTheTextIsVisible(String text) {
        Assert.assertTrue(mainPage.gitmekIstediginizYerText.isDisplayed());
        System.out.println(text);
    }

    @When("the user click ilan ara button")
    public void theUserClickIlanAraButton() {
        mainPage.ilanAraButton.click();
    }


}
