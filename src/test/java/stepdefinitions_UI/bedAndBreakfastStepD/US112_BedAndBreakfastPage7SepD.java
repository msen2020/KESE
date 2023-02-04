package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;
import pages.UI.EvDegisimiPage;
import utilities.BrowserUtils;

import java.util.List;

public class US112_BedAndBreakfastPage7SepD {

    BedAndBreakfastPage bedAndBreakfastPage = new BedAndBreakfastPage();

    @Then("user verifies that {string} is visible at Bed & Breakfast")
    public void user_verifies_that_is_visible_at_Bed_Breakfast(String expectedTitle) {
        String actualTitle = bedAndBreakfastPage.page7aktivitelerText.getText();
        BrowserUtils.verifyElementDisplayed(bedAndBreakfastPage.page7aktivitelerText);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("user verifies that {string} message is visible at Bed & Breakfast")
    public void user_verifies_that_message_is_visible_at_Bed_Breakfast(String expectedInfoText) {
        String actualInfoText = bedAndBreakfastPage.page7InfoText.getText();
        BrowserUtils.verifyElementDisplayed(bedAndBreakfastPage.page7InfoText);
        Assert.assertEquals(expectedInfoText,actualInfoText);
    }

    @Then("user verifies that number of the {string} page is visible at Bed & Breakfast")
    public void user_verifies_that_number_of_the_page_is_visible_at_Bed_Breakfast(String expectedNumberOfPage) {
        String actualNumberOfPage = bedAndBreakfastPage.theNumberOfPage7.getText();
        Assert.assertEquals(expectedNumberOfPage,actualNumberOfPage);
    }

    @Then("user verifies that all selections should be clickable at Bed & Breakfast")
    public void user_verifies_that_all_selections_should_be_clickable_at_Bed_Breakfast(List<String> selections) {
        for (String selection : selections) {
            Assert.assertTrue(new EvDegisimiPage().clickable(selection));
        }
    }
}
