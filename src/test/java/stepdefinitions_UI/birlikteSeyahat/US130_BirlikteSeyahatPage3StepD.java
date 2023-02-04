package stepdefinitions_UI.birlikteSeyahat;
// QA Engineer msen

import com.kese.pages.UI.BirlikteSeyahatPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US130_BirlikteSeyahatPage3StepD {
    BirlikteSeyahatPage page3 = new BirlikteSeyahatPage();

    @Then("user verifies that {string} button is visible")
    public void userVerifiesThatButtonIsVisible(String ilerleButton) {
        page3.ilerleButton.isDisplayed();
        Assert.assertTrue(page3.ilerleButton.isDisplayed());
        //System.out.println(ilerleButton);

    }

    @Then("verifies that {string} button shouldn't be clickable as a default")
    public void verifiesThatIfButtonShouldnTBeClickableAsADefault(String arg0) {
        Boolean flag = true;
        if (page3.ilerleButton.getAttribute("style").substring(8, 19).equals("not-allowed")) {
            flag = false;
        }
        Assert.assertFalse(flag);
    }

    @Then("user verifies that the opacity value of ilerle button is {double}")
    public void userVerifiesThatTheOpacityValueOfIlerleButtonIs(double opacityValue) {

        System.out.println("ilerleButton.getAttribute(\"opacity\") = " + page3.ilerleButton.getCssValue("opacity"));
        Assert.assertEquals("0.65", page3.ilerleButton.getCssValue("opacity"));

    }

    @Then("user verifies that when the seat information is not selected or the description information is not entered, and the Next button is clicked, {string} warning should be visible.")
    public void userVerifiesThatIfTheSeatInformationIsNotSelectedOrTheDescriptionInformationIsNotEnteredIfTheNextButtonIsClickedWarningShouldBeVisible(String warning) {

        page3.ilerleButton.click();
        Assert.assertTrue(warning, page3.page3ZorunluBilgilerWarning.isDisplayed());
    }


}
