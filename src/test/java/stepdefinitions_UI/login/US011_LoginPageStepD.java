package stepdefinitions_UI.login;

import com.kese.pages.UI.LoginPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US011_LoginPageStepD {

    LoginPage loginPage = new LoginPage();

    @Then("the user verifies that the {string} Button is active on login page")
    public void theUserVerifiesThatTheButtonIsActiveOnLoginPage(String buttonType) {

//        BrowserUtils.waitFor(2);
        if (buttonType.equals("Giriş Yap")) {

            Assert.assertTrue(loginPage.loginPageBelowGirisYapButton.isDisplayed());
            Assert.assertTrue(loginPage.loginPageBelowGirisYapButton.isEnabled());
        } else if (buttonType.equals("Kayıt Oluştur")) {

            Assert.assertTrue(loginPage.loginPageKayitOlButton.isDisplayed());
            Assert.assertTrue(loginPage.loginPageKayitOlButton.isEnabled());

        }

    }

    @When("user clicks {string} button on login page")
    public void user_clicks_button_on_login_page(String string) {

        BrowserUtils.waitFor(2);
        loginPage.loginPageKayitOlButton.click();

    }


}
