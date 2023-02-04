package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US29SignUpPageStepDef {
    SignUpPage page = new SignUpPage();
    @And("user asserts {string} is visible and enabled")
    public void userAssertsIsVisibleAndEnabled(String elementDescription) {
        WebElement element = null;
        switch (elementDescription){ // I can add new cases in next part of project
            case "check box on signup page":
                element = page.privacyPolicyCheckBox;
                break;
            default:
                Assert.fail(elementDescription + " not implemented.");
        }
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.isEnabled());
    }

    @Then("user asserts {string} is {string}")
    public void userAssertsIsNotSelected(String elementDescription, String selectType) {
        WebElement element = null;
        switch (elementDescription){ // I can add new cases in next part of project
            case "check box on signup page":
                element = page.privacyPolicyCheckBox;
                break;
            default:
                Assert.fail(elementDescription + " not implemented.");
        }
        Boolean bool = null;
        switch (selectType){            
            case "selected":
                bool = element.isSelected();                
                break;
            case "not selected":
                bool = !element.isSelected();
                break;
            default:
                Assert.fail(elementDescription + " not implemented.");
        }
        Assert.assertTrue(bool);
    }
}
