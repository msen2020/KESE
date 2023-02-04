package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US069_OdaKiralaPage7StepD {

    OdaKiralaPage odaKiralaPage = new OdaKiralaPage();
    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @Then("user verifies that {string} button is visible at Oda Kirala")
    public void user_verifies_that_button_is_visible_at_oda_kirala(String expectedButton) {
        String actualButton = evDegisimiPage.ilerleButton.getText();
        BrowserUtils.verifyElementDisplayed(evDegisimiPage.ilerleButton);
        Assert.assertEquals(expectedButton, actualButton);
    }

    @Then("user verifies that {string} button shouldn't be clickable as a default at Oda Kirala")
    public void user_verifies_that_button_shouldn_t_be_clickable_as_a_default_at_oda_kirala(String link) {
        Boolean flag = true;
        if(evDegisimiPage.ilerleButton.getAttribute("style").substring(8, 19).equals("not-allowed")){
            flag = false;
        }
        Assert.assertFalse(flag);
    }


    @When("user clicks {string} button without any selection at Oda Kirala")
    public void user_clicks_button_without_any_selection_at_oda_kirala(String link) {
        evDegisimiPage.ilerleButton.click();
    }

    @Then("user verifies that {string} warning message appears at Oda Kirala")
    public void user_verifies_that_warning_message_appears_at_oda_kirala(String expectedWarningMessage) {
        String actualWarningMessage = odaKiralaPage.page7ActiviteWarningMessage.getText();
        Assert.assertEquals(expectedWarningMessage, actualWarningMessage);
    }

    @When("user clicks any {string} at Oda Kirala")
    public void user_clicks_any_at_oda_kirala(String selection) {
        evDegisimiPage.clickAnySelection(selection);
    }

    @Then("user verifies that ilerle button should be clickable at Oda Kirala")
    public void user_verifies_that_ilerle_button_should_be_clickable_at_oda_kirala() {
        Assert.assertTrue(evDegisimiPage.ilerleButton.isEnabled());
    }
}
