package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US105_BedAndBreakfastStepD {

    BedAndBreakfastPage bedAndBreakfastPage = new BedAndBreakfastPage();

    @Given("until  users fills in the blanks on page {int} {string} button should not be functional")
    public void until_users_fills_in_the_blanks_on_page_button_should_not_be_functional(Integer int1, String string) {

        Assert.assertTrue(bedAndBreakfastPage.page3ilerlebutonu.isEnabled());


    }

    @When("users click {string} button")
    public void users_click_button(String string) {
       bedAndBreakfastPage.page3ilerlebutonu.click();

    }

    @When("users not enters required  information, she sees {string}")
    public void users_not_enters_required_information_she_sees(String string) {

        BrowserUtils.waitFor(2);
        Assert.assertTrue(bedAndBreakfastPage.page3OdanizinKullanimAlaniniBelirtinizYazisi.isDisplayed());

    }

    @Then("After users has entered the required information, the {string} button should be clickable.")
    public void after_users_has_entered_the_required_information_the_button_should_be_clickable(String string) {

        BrowserUtils.waitFor(2);
       bedAndBreakfastPage.page3KullanimAlaniInput.sendKeys("120");

        Assert.assertTrue(bedAndBreakfastPage.page3ilerlebutonu.isEnabled());

    }
    
}


