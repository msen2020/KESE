package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import org.junit.Assert;


public class US101_BedAndBreakfastPage1StepD extends BedAndBreakfastPage {


    @Then("user verifies opacity value")
    public void userVerifiesOpacityValue() {

        System.out.println("ilerleButton.getAttribute(\"opacity\") = " + ilerleButton.getCssValue("opacity"));
        Assert.assertEquals("0.65", ilerleButton.getCssValue("opacity"));


    }
}
