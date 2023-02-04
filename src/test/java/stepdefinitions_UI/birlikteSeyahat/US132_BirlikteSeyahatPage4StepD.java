package stepdefinitions_UI.birlikteSeyahat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.BirlikteSeyahatPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

// Nursel
public class US132_BirlikteSeyahatPage4StepD {

    BirlikteSeyahatPage bsPage = new BirlikteSeyahatPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {

        Driver.get().get(ConfigurationReader.get("ui_url"));

    }

    @When("user navigates to page {int} in Birlikte Seyahat")
    public void user_navigates_to_page_in_Birlikte_Seyahat(Integer sayfa) {

        BirlikteSeyahatPage bsPage = new BirlikteSeyahatPage();

        bsPage.navigateToPageInBirlikteSeyahat(sayfa);

    }

    @Then("ilerle button should be visible on bs page")
    public void ilerle_button_should_be_visible_on_bs_page() {

        Assert.assertTrue(bsPage.ilerleButton.isDisplayed());
    }

    @Then("ilerle button should not be clickable on bs page")
    public void ilerle_button_should_not_be_clickable_on_bs_page() {
        Assert.assertTrue(bsPage.ilerleButton.getAttribute("style").contains("cursor: not-allowed;"));
    }

    @When("ilerle button opacity should be {double} on bs page")
    public void ilerle_button_opacity_should_be_on_bs_page(Double opacity) {
        Assert.assertTrue(bsPage.ilerleButton.getAttribute("style").contains("opacity: 0.65"));
    }

    @Then("ilerle button should be clickable on bs page")
    public void ilerle_button_should_be_clickable_on_bs_page() {
        Assert.assertEquals(bsPage.ilerleButton.getAttribute("style"),"cursor: pointer;");
    }

    @When("user clicks to the ilerle button on bs page")
    public void user_clicks_to_the_ilerle_button_on_bs_page() {
        bsPage.ilerleButton.click();
    }

    @Then("warning message {string} should be displayed on step {string} on bs page")
    public void warning_message_should_be_displayed_on_step_on_bs_page(String warningText, String stepNumber) {
        Assert.assertEquals(warningText, bsPage.missingInfoWarningText.getAttribute("innerText"));
        Assert.assertEquals(stepNumber, bsPage.theNumberOfPage.getAttribute("textContent"));
    }

    @When("user enters {string} {string} {string} on step four on bs page")
    public void user_enters_on_step_four_on_bs_page(String age, String gender, String maxPerson) {

        BrowserUtils.waitFor(1/2);
        bsPage.setPage4AgeOptions(age);
        bsPage.setPage4GenderOption(gender);
        bsPage.setPage4MaxPerson(Integer.parseInt(maxPerson));
    }

    @Then("step number {string} should be displayed on bs page")
    public void step_number_should_be_displayed_on_bs_page(String stepNumber) {

        Assert.assertEquals(stepNumber, bsPage.theNumberOfPage.getText());
        Assert.assertTrue(bsPage.theNumberOfPage.isDisplayed());
    }
}