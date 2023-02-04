package stepdefinitions_UI.birlikteSeyahat;

import com.kese.pages.UI.BirlikteSeyahatPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US126_BirlikteSeyahatStepD {

    BirlikteSeyahatPage birlikteSeyahatPage = new BirlikteSeyahatPage();

    @When("The user can click the proceed button without making any selections")
    public void the_user_can_click_the_proceed_button_without_making_any_selections() {

        birlikteSeyahatPage.page1IlerleButon.click();

    }

    @Then("The user {string} on the step")
    public void theUserOnTheStep(String expectedPage) {

        System.out.println(birlikteSeyahatPage.theNumberOfPage.getText());

        Assert.assertEquals(expectedPage, birlikteSeyahatPage.theNumberOfPage.getText());

    }

    @Then("Verifies that {string} appears if the user clicks the Proceed button without making any selections")
    public void verifies_that_appears_if_the_user_clicks_the_Proceed_button_without_making_any_selections(String expectedtext) {

        Assert.assertEquals(expectedtext, birlikteSeyahatPage.LutfenAracTipiniGirinizYazisi.getText());
    }

    @Given("User verifies that the Ilerle button appears")
    public void user_verifies_that_the_ilerle_button_appears() {
        Assert.assertTrue(birlikteSeyahatPage.ilerleButton.isDisplayed());

    }

    @Then("User verifies that the next button has a value of {string} as transparency")
    public void user_verifies_that_the_next_button_has_a_value_of_as_transparency(String expectedtransparency) {
        System.out.println(birlikteSeyahatPage.ilerleButonuSaydamlik.getAttribute("style"));

        String actualtransparency = birlikteSeyahatPage.ilerleButonuSaydamlik.getAttribute("style");

        Assert.assertTrue(expectedtransparency.contains(actualtransparency));

    }

    @When("User selects any vehicle type")
    public void user_selects_any_vehicle_type() {

        birlikteSeyahatPage.page1Kamyonet.click();
    }

    @When("User clicks on the Ilerle button")
    public void user_clicks_on_the_ilerle_proceed_button() {

        birlikteSeyahatPage.ilerleButton.click();
    }

    @Then("proceeds to the {string} step")
    public void proceedsToTheStep(String expectedpage) {

        Assert.assertTrue(birlikteSeyahatPage.theNumberOfPage.getText().contains(expectedpage));

    }


}


