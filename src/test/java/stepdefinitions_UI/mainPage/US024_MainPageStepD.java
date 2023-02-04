package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US024_MainPageStepD {

    @Then("the user verifies that he can go to the {string} page")
    public void theUserVerifiesThatHeCanGoToThePage(String page) {
        String actualLink = Driver.get().getCurrentUrl().substring(19);
        Assert.assertEquals(page, actualLink);
    }

    @When("the user clicks The {string} link it redirects to page")
    public void theUserClicksTheLinkItRedirectsToPage(String link) {
        MainPage.clickLinktext(link);
    }

    @Then("the user asserts that The {string} link is visible")
    public void theUserAssertsThatTheLinkIsVisible(String link) {

        Assert.assertTrue(MainPage.linkTextIsDisplayed(link));

    }


}
