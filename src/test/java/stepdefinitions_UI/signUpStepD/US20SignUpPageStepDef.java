package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.SignUpPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US20SignUpPageStepDef {

    SignUpPage page = new SignUpPage();

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String url_ui) {
        BrowserUtils.waitFor(3);
        Driver.get().get(url_ui);

    }

    String username;
    String password = "1234";
    String email;
    @When("user creates a random credentials and signup")
    public void signUpWithRandomCredentials() {
        username = BrowserUtils.getRandomString(4);
        email = BrowserUtils.getRandomString(4)+"@nonmail.com";

        page.inputUsername.sendKeys(username);
        page.signupEmailBox.sendKeys(email);
        page.signupPasswordBox.sendKeys(password);
        page.reInputPassword.sendKeys(password);
        page.privacyPolicyCheckBox.click();
        page.signUpButton.click();
        BrowserUtils.waitForPageToLoad(5);
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertTrue(signInButtonElement.isDisplayed());
        page.girisYapButtonOnSignInPage.click();
    }

    @And("user tries to use the same {string} for signup again")
    public void userTriesToUseTheSameForSignupAgain(String arg0) {
        switch (arg0){
            case "email": // email didn't change
                username = BrowserUtils.getRandomString(4);
                break;
            case "username": // password didn't change
                email = BrowserUtils.getRandomString(5)+"@nonmail.com";
                break;
        }
        page.inputUsername.sendKeys(username);
        page.signupEmailBox.sendKeys(email);
        page.signupPasswordBox.sendKeys(password);
        page.reInputPassword.sendKeys(password);
        page.privacyPolicyCheckBox.click();
        page.signUpButton.click();
    }

    @Then("user verifies {string} and can't signup on signup page")
    public void userVerifiesAndCanTSignupOnSignupPage(String arg0) {
        // Sign In page mustn't be display
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, signInButtonElement::isDisplayed);
        // Error message will display
        WebElement textElement = Driver.get().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]"));
        Assert.assertTrue(textElement.isDisplayed());

    }
}