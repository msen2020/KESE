package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.SignUpPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class US019SignUpPageStepD {
    SignUpPage page = new SignUpPage();
    Date date = new Date();

    @Given("user is on signup page {string}")
    public void userIsOnSignupPage(String SignUpPageUrl) {
        Driver.get().get(SignUpPageUrl);
    }

    @And("user types {string} to the username input on the signup page")
    public void userTypesToTheUsernameInputOnTheSignupPage(String username) {
        page.SignupUserInput.sendKeys(username+date.getTime());

    }

    @And("user types {string} to the email input on the signup page")
    public void userTypesToTheEmailInputOnTheSignupPage(String email) {
        page.signupEmailBox.sendKeys(date.getTime()+email);
    }

    @And("user types {string} to the password input on the signup page")
    public void userTypesToThePasswordInputOnTheSignupPage(String password) {
        page.signupPasswordBox.clear();
        page.signupPasswordBox.sendKeys(password);
    }

    @And("user types {string} to the repassword input on the signup page")
    public void userTypesToTheRepasswordInputOnTheSignupPage(String password) {
        page.reInputPassword.clear();
        page.reInputPassword.sendKeys(password);
    }

    @And("user clicks to the checkbox on signup page")
    public void userClicksToTheCheckboxOnSignupPage() {
        page.CheckBox.click();
    }

    @And("user clicks to the kayit ol button on the signup page")
    public void userClicksToTheKayitOlButtonOnTheSignupPage() {
        page.kayitOlusturButton.click();
    }

    @And("user verifies {string} is visible")
    public void userVerifiesIsVisible(String text) {
       // BrowserUtils.waitFor(2);
        WebElement yazi = Driver.get().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        System.out.println(text);
        Assert.assertTrue(yazi.isDisplayed());
    }
}
