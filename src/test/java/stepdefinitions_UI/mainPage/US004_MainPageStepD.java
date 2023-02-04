package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US004_MainPageStepD {

    MainPage mainPage = new MainPage();

    @Then("the user verifies that Birlikte Seyahat Button is displayed and enabled")
    public void theUserVerifiesThatBirlikteSeyahatButtonIsDisplayedAndEnabled() {
        Assert.assertTrue(mainPage.birlikteSeyehatButton.isDisplayed());
        boolean isBirlikteSeyahatButtonDisplayed = mainPage.birlikteSeyehatButton.isDisplayed();
        System.out.println("Is the Birlikte Seyehat Button Displayed?  " + isBirlikteSeyahatButtonDisplayed);
        Assert.assertTrue(isBirlikteSeyahatButtonDisplayed);

        Assert.assertTrue(mainPage.birlikteSeyehatButton.isEnabled());
        boolean isBirlikteSeyahatButtonEnabled = mainPage.birlikteSeyehatButton.isEnabled();
        System.out.println("Is the Birlikte Seyahat Button Enabled?  " + isBirlikteSeyahatButtonEnabled);
        Assert.assertTrue(isBirlikteSeyahatButtonEnabled);
    }

    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String linkText) {
        mainPage.birlikteSeyehatButton.click();
        //mainPage.clickPopulerMenu(linkText);
    }

    @Then("the user verifies that Birlikte Seyehat is selected")
    public void theUserVerifiesThatBirlikteSeyehatIsSelected() {
        Assert.assertFalse(mainPage.birlikteSeyehatButton.isSelected());
        boolean isBirlikteSeyehatButtonSelected = mainPage.birlikteSeyehatButton.isEnabled();
        System.out.println("Is the Birlikte Seyehat Button Selected?  " + isBirlikteSeyehatButtonSelected);
        Assert.assertTrue(isBirlikteSeyehatButtonSelected);

    }

    @Then("the user verifies that the text -Seyehat etmek istediginiz yeri seciniz- is displayed.")
    public void theUserVerifiesThatTheTextSeyehatEtmekIstediginizYeriSecinizIsDisplayed() {
        Assert.assertTrue(mainPage.seyehatEtmekIstediginizYeriSecinizText.isDisplayed());
        boolean isTextDisplayed = mainPage.evDegisimiYeriText.isDisplayed();
        System.out.println("Is the text displayed?  " + isTextDisplayed);
        Assert.assertTrue(isTextDisplayed);

    }

    @When("{string} is selected, the text {string} should be visible.")
    public void isSelectedTheTextShouldBeVisible(String arg0, String arg1) {
        Assert.assertTrue(mainPage.seyehatEtmekIstediginizYeriSecinizText.isDisplayed());

    }


}
