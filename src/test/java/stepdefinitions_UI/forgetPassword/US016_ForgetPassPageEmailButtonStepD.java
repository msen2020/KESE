package stepdefinitions_UI.forgetPassword;

import com.kese.pages.UI.ForgetPasswordPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US016_ForgetPassPageEmailButtonStepD {
    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

    @Given("the user is on forget password page {string}")
    public void theUserIsOnForgetPasswordPage(String ForgetPasswordPageUrl) {
        Driver.get().get(ForgetPasswordPageUrl);
    }


    @Then("the user verifies that the email input box is enabled")
    public void theUserVerifiesThatTheEmailInputBoxIsEnabled() {

        Assert.assertTrue(forgetPasswordPage.emailInputBox.isEnabled());
    }

    @Then("the user verifies that the text {string} is displayed as default in the input box")
    public void theUserVerifiesThatTheTextIsDisplayedAsDefaultInTheInputBox(String text) {

        String attributeText =  forgetPasswordPage.emailInputBox.getAttribute("placeholder");
        Assert.assertEquals(attributeText,text);
        System.out.println(text);
    }




}
