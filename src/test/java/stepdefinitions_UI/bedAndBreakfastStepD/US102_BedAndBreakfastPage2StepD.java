package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;

import java.util.List;

public class US102_BedAndBreakfastPage2StepD {

    BedAndBreakfastPage babPage = new BedAndBreakfastPage();

    @Then("user clicks {string} option on on step one on bab page")
    public void user_clicks_option_on_on_step_one_on_bab_page(String homeType) {
        babPage.clickPage1RoomType(homeType);
    }

    @When("user clicks to the ilerle button on bab page")
    public void user_clicks_to_the_ilerle_button_on_bab_page() {
        babPage.ilerleButton.click();
    }

    @Then("page title text {string} should be displayed on step two on bab page")
    public void page_title_text_should_be_displayed_on_step_two_on_bab_page(String titleText) {
        Assert.assertEquals(babPage.pageTitleText.getText(), titleText);
        Assert.assertTrue(babPage.pageTitleText.isDisplayed());
    }

    @Then("page info text {string} should be displayed on step two on bab page")
    public void page_info_text_should_be_displayed_on_step_two_on_bab_page(String infoText) {
        Assert.assertEquals(babPage.pageInfoText.getText(), infoText);
        Assert.assertTrue(babPage.pageInfoText.isDisplayed());
    }

    @Then("below input boxes should be enabled")
    public void below_input_boxes_should_be_enabled(List<String> transportationList) {
        for (String optionBox : transportationList) {
            Assert.assertTrue(babPage.isPage2TransportationOptionEnabled(optionBox));
        }
    }

    @Then("sahsi arac ulasim box should be clickable on step two on bab page")
    public void sahsi_arac_ulasim_box_should_be_clickable_on_step_two_on_bab_page() {
        Assert.assertTrue(babPage.page2SahsiAracCheckBox.isEnabled());
    }

    @Then("step number {string} should be displayed on bab page")
    public void step_number_should_be_displayed_on_bab_page(String stepNumber) {
        Assert.assertEquals(babPage.theNumberOfPage.getText(), stepNumber);
        Assert.assertTrue(babPage.theNumberOfPage.isDisplayed());
    }
}
