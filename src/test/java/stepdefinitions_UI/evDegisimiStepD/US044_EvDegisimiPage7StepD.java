package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US044_EvDegisimiPage7StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @Then("user verifies that {string} button is visible at Ev Degisimi")
    public void user_verifies_that_button_is_visibleAtEvDegisimi(String expectedButton) {
        String actualButton=evDegisimiPage.ilerleButton.getText();
        BrowserUtils.verifyElementDisplayed(evDegisimiPage.ilerleButton);
        Assert.assertEquals(expectedButton,actualButton);

    }



    @Then("user verifies that {string} button shouldn't be clickable as a default at Ev Degisimi")
    public void user_verifies_that_button_shouldn_t_be_clickable_as_a_defaultAtEvDegisimi(String link) {
        Boolean flag = true;
        if(evDegisimiPage.ilerleButton.getAttribute("style").substring(8, 19).equals("not-allowed")){
            flag = false;
        }
        Assert.assertFalse(flag);
    }

    @When("user clicks {string} button without any selection at Ev Degisimi")
    public void user_clicks_button_without_any_selectionAtEvDegisimi(String link) {
        evDegisimiPage.ilerleButton.click();
    }

    @Then("user verifies that {string} warning message appears at Ev Degisimi")
    public void user_verifies_that_warning_message_appearsAtEvDegisimi(String expectedWarningMessage) {
        String actualWarningMessage = evDegisimiPage.page7ActiviteWarningMessage.getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);

    }

    @When("user clicks any {string} at Ev Degisimi")
    public void user_clicks_anyAtEvDegisimi(String selection) {
        evDegisimiPage.clickAnySelection(selection);
    }


    @Then("user verifies that ilerle button should be clickable at Ev Degisimi")
    public void userVerifiesThatIlerleButtonShouldBeClickableAtEvDegisimi() {
        Assert.assertTrue(evDegisimiPage.ilerleButton.isEnabled());
    }
}
