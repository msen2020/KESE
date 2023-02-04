package stepdefinitions_UI.roomExchangeStepD;


import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US061_OdaDegisimiStepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();


    @Then("the user verifies that the {string} butonu is visible.")
    public void theUserVerifiesThatTheButonuIsVisible(String arg0) {

    }

    @Then("the user verifies that the {string} button is not clickable")
    public void theUserVerifiesThatTheButtonIsNotClickable(String arg0) {

    }

    @Then("the user verifies that the warning text {string} is visible")
    public void theUserVerifiesThatTheWarningTextIsVisible(String arg0) {

    }

    @Given("the user inputs the required information on page {int} of Room Exchange")
    public void theUserInputsTheRequiredInformationOnPageOfRoomExchange(int arg0) {

    }

    @Then("the user verifies that the {string} button is clickable")
    public void theUserVerifiesThatTheButtonIsClickable(String arg0) {

    }

    @Given("until the user fills in the blanks on page {int} {string} button should not be functional")
    public void until_the_user_fills_in_the_blanks_on_page_button_should_not_be_functional(Integer int1, String string) {

        Assert.assertTrue(evDegisimiPage.page3ilerlebutonu.isEnabled());

    }

    @When("the user click {string} button")
    public void the_user_click_button(String string) {
        evDegisimiPage.page3ilerlebutonu.click();

    }

    @When("the user not enters required  information, she sees {string}")
    public void the_user_not_enters_required_information_she_sees(String text) {

        BrowserUtils.waitFor(2);
        Assert.assertTrue(evDegisimiPage.page3LutfenKullanimAlanlariniGirinizText.isDisplayed());

    }

    @Then("After the user has entered the required information, the {string} button should be clickable.")
    public void after_the_user_has_entered_the_required_information_the_button_should_be_clickable(String string) {

        BrowserUtils.waitFor(2);
        evDegisimiPage.page3KullanimAlaniInput.sendKeys("120");

        Assert.assertTrue(evDegisimiPage.page3ilerlebutonu.isEnabled());

    }


}
