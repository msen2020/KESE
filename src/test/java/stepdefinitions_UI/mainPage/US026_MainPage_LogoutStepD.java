package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.LoginPage;
import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US026_MainPage_LogoutStepD {
    LoginPage page = new LoginPage();
    MainPage mainPage = new MainPage();

    @And("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String email, String password) {

        BrowserUtils.waitFor(1);
        new MainPage().girisYapButtonRightTop.click();
        LoginPage.enterUserName(email);
        LoginPage.enterPassword(password);
        LoginPage.clickSubmitbutton();

    }

    @When("user clicks Profilim link on signed in page")
    public void user_clicks_Profilim_link_on_signed_in_page() {

        BrowserUtils.waitFor(1);
        page.ProfilimButton.click();

    }

    @When("user clicks {string} button on Profilim link")
    public void user_clicks_button_on_Profilim_link(String itemName) {

        BrowserUtils.waitFor(3);
        new LoginPage().clickMenuItemProfilimLink(itemName);

    }

    @Then("Giris Yap button should be visible and clickable on home page")
    public void girisYapButtonShouldBeVisibleAndClickableOnHomePage() {

    }
}
