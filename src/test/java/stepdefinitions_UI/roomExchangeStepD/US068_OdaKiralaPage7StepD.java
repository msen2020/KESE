package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class US068_OdaKiralaPage7StepD {

    OdaKiralaPage odaKiralaPage = new OdaKiralaPage();

    @Then("user verifies that {string} is visible at Oda Kirala")
    public void user_verifies_that_is_visible_at_oda_kirala(String expectedTitle) {
        String actualTitle = odaKiralaPage.page7aktivitelerText.getText();
        BrowserUtils.verifyElementDisplayed(odaKiralaPage.page7aktivitelerText);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("user verifies that {string} message is visible at Oda Kirala")
    public void user_verifies_that_message_is_visible_at_oda_kirala(String expectedInfoText) {
        String actualInfoText = odaKiralaPage.page7InfoText.getText();
        BrowserUtils.verifyElementDisplayed(odaKiralaPage.page7InfoText);
        Assert.assertEquals(expectedInfoText,actualInfoText);
    }
    @Then("user verifies that number of the {string} page is visible at Oda Kirala")
    public void user_verifies_that_number_of_the_page_is_visible_at_oda_kirala(String expectedNumberOfPage) {
        String actualNumberOfPage = odaKiralaPage.theNumberOfPage7.getText();
        Assert.assertEquals(expectedNumberOfPage,actualNumberOfPage);
    }


    @Then("user verifies that all selections should be clickable at Oda Kirala")
    public void
    userVerifiesThatAllSelectionsShouldBeClickableAtOdaKirala(List<String> selections) {
        for (String selection : selections) {
            Assert.assertTrue(new EvDegisimiPage().clickable(selection));

        }
    }
}
