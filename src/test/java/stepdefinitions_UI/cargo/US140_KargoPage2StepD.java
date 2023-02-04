package stepdefinitions_UI.cargo;

import com.kese.pages.UI.KargoPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US140_KargoPage2StepD {
    KargoPage page2 = new KargoPage();

    @Then("user verifies that {string} is visible")
    public void userVerifiesThatIsVisible(String ilerleButton) {
        page2.ilerleButton.isDisplayed();
        Assert.assertTrue(page2.ilerleButton.isDisplayed());
    }

    @Then("user verifies that {string} should be clickable as default")
    public void userVerifiesThatShouldBeClickableAsDefault(String ilerleButton) {
        page2.ilerleButton.isEnabled();
        Assert.assertTrue(page2.ilerleButton.isEnabled());
    }

    @Then("user verifies that when {string} is clicked it shouldn't pass the next step")
    public void userVerifiesThatWhenIsClickedItShouldnTPassTheNextStep(String ilerleButton) {
        page2.ilerleButton.click();
        Assert.assertFalse(page2.ilerleButton.getAttribute("style").contains("cursor: pointer;"));

    }

    @Then("user verifies that when the Starting Point or End Point are not selected, and the {string} is clicked, then {string} warning should be visible.")
    public void userVerifiesThatWhenTheStartingPointOrEndPointAreNotSelectedAndTheIsClickedThenWarningShouldBeVisible(String ilerleButton, String warning) {
        page2.ilerleButton.click();
        String baslangicNoktasi = page2.page2_BaslangicNoktasiInput.getText();
        Assert.assertEquals("Select...", baslangicNoktasi);
        Assert.assertTrue(warning, page2.page2_warningText.isDisplayed());
        System.out.println(warning);
    }

    @Then("user verifies that when the Starting Point or End Point are selected then the {string} should be clickable")
    public void userVerifiesThatWhenTheStartingPointOrEndPointAreSelectedThenTheShouldBeClickable(String arg0) {
        Assert.assertTrue(page2.ilerleButton.isEnabled());
        Assert.assertFalse(page2.ilerleButton.getAttribute("style").contains("cursor: pointer;"));
        page2.step2_selectText1Input.sendKeys("Sevilla, İspanya");
        page2.step2_selectText2Input.sendKeys("Berlin, Almanya");
        Assert.assertTrue(page2.ilerleButton.isEnabled());
        page2.ilerleButton.click();
    }
}
