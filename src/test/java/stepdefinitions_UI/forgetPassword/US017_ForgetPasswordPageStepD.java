package stepdefinitions_UI.forgetPassword;

import com.kese.pages.UI.ForgetPasswordPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US017_ForgetPasswordPageStepD {

    ForgetPasswordPage forgotPasswordPage = new ForgetPasswordPage();

    @Given("the user goes to {string} page")
    public void the_user_goes_to_page(String url_ui) {
        Driver.get().get(ConfigurationReader.get("ui_url"));
    }

    @And("the user clicks on Login button")
    public void user_clicks_on_Login_button() {
        forgotPasswordPage.girisyapButtonu.click();
    }

    @Then("the user verifies that the link Sifremi Unuttum {string} is displayed")
    public void theUserVerifiesThatTheLinkSifremiUnuttumIsDisplayed(String text) {
        String actualLink = ForgetPasswordPage.getMyText();
        Assert.assertEquals(actualLink, text);
        System.out.println(text);
    }

    @Then("the user verifies that the link {string} is enabled")
    public void theUserVerifiesThatTheLinkIsEnabled(String link) {
        Assert.assertTrue(forgotPasswordPage.sifremiUnuttumLinkk.isEnabled());
        boolean isLinkSifremiUnuttumEnabled = forgotPasswordPage.sifremiUnuttumLinkk.isEnabled();
        System.out.println("Is the link Sifremi Unuttum Enabled?  " + isLinkSifremiUnuttumEnabled);
        Assert.assertTrue(isLinkSifremiUnuttumEnabled);

    }

    @Then("the user clicks the {string} link")
    public void the_user_clicks_the_link(String string) {
        forgotPasswordPage.sifremiUnuttumButton.click();

    }

    @Then("the user verifies that the Title {string} is displayed")
    public void theUserVerifiesThatTheTitleIsDisplayed(String title) {
        Assert.assertTrue(forgotPasswordPage.titleSifreYenileme.isDisplayed());
        forgotPasswordPage.titleSifreYenileme.getText();
        System.out.println("The title is= " + title);
        boolean isTextDisplayed = forgotPasswordPage.titleSifreYenileme.isDisplayed();
        System.out.println("Is the title displayed?  " + isTextDisplayed);
        Assert.assertTrue(isTextDisplayed);

    }

    @Then("the user verifies that the text {string} is displayed in the button")
    public void theUserVerifiesThatTheTextIsDisplayedInTheButton(String text) {
        BrowserUtils.waitFor(3);
        //Assert.assertEquals(forgotPasswordPage.sifremiDegistirText.getText(), "Şifremi Değiştir");
        System.out.println("The text is= " + forgotPasswordPage.sifremiDegistirText.getText());
    }

    @And("the user verifies that the {string} button is enabled")
    public void theUserVerifiesThatTheButtonIsDisplayed(String sifremiDegistirButton) {
        Assert.assertTrue(forgotPasswordPage.sifremiDegistirButton.isEnabled());

    }

    @Then("the user enters valid e-mail address")
    public void user_enters_valid_e_mail_address() {
        WebElement emailBox = Driver.get().findElement(By.xpath("//input[@class='form-control ']"));
        emailBox.sendKeys(ConfigurationReader.get("user1_username"));
    }

    @And("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        forgotPasswordPage.sifremiDegistirButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user verifies that the text {string} is displayed on Forgot Password Page")
    public void theUserVerifiesThatTheTextIsDisplayedOnForgotPasswordPage(String arg0) {
        Assert.assertTrue(forgotPasswordPage.sifreSifirlamaLinkiGonderildiText.isDisplayed());
        boolean isTextDisplayed = forgotPasswordPage.sifreSifirlamaLinkiGonderildiText.isDisplayed();
        System.out.println("Is the text displayed?  " + isTextDisplayed);
        System.out.println(forgotPasswordPage.sifreSifirlamaLinkiGonderildiText.getText());
        Assert.assertTrue(isTextDisplayed);

    }
}



