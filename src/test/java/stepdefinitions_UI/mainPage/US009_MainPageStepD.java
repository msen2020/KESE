package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US009_MainPageStepD {

    MainPage mainPage = new MainPage();

    @Then("the user verifies that the Giris Yap Button is visible and clickable on home page")
    public void the_user_uerifies_that_the_Giris_Yap_Button_should_be_visible_and_clickable_on_home_page() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(mainPage.girisYapButtonRightTop.isDisplayed());
        Assert.assertTrue(mainPage.girisYapButtonRightTop.isEnabled());
    }

    @When("the user clicks Giris Yap button on home page")
    public void the_user_clicks_Giris_Yap_button_on_home_page() {
        BrowserUtils.waitFor(1);
        mainPage.girisYapButtonRightTop.click();
    }

    @Then("the user should be redirected to {string} page")
    public void theUserShouldBeRedirectedToPage(String expectedUrl) {
        System.out.println("You are at the " + expectedUrl + " Page");
        Assert.assertTrue((Driver.get().getCurrentUrl().contains(expectedUrl)));

    }
}
