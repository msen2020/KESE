package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.SignUpPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US28SignUpStepD {
    SignUpPage signUpPage = new SignUpPage();



    @Given("Click usage")
    public void click_usage() {

        signUpPage.usage.click();

    }


    @And("Click privacy")
    public void clickPrivacy() {
        signUpPage.privacy.click();
    }


    @Then("{string} should be visible")
    public void shouldBeVisible(String tab) {
        switch (tab){

            case "/usage":
                BrowserUtils.verifyElementDisplayed(signUpPage.usage);
                break;
            case "/privacy":
                BrowserUtils.verifyElementDisplayed(signUpPage.privacy);
                break;
            default:
                Assert.assertTrue(false);

        }

    }
}
