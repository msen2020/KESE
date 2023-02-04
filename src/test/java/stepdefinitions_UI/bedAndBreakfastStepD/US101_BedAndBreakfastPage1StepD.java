package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;


public class US101_BedAndBreakfastPage1StepD extends BedAndBreakfastPage {


    @Then("user verifies opacity value")
    public void userVerifiesOpacityValue() {

        System.out.println("ilerleButton.getAttribute(\"opacity\") = " + ilerleButton.getCssValue("opacity"));
        Assert.assertEquals("0.65", ilerleButton.getCssValue("opacity"));


    }
}
