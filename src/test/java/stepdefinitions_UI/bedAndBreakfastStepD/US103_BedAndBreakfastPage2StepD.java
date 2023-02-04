package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Map;

public class US103_BedAndBreakfastPage2StepD {

    BedAndBreakfastPage babPage = new BedAndBreakfastPage();

    @Then("user enters {string} to address input on step two on bab page")
    public void user_enters_to_address_input_on_step_two_on_bab_page(String location) {

        babPage.page2AddressInputBox.sendKeys(location + Keys.ENTER);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();

    }
    @Then("sectiginiz adres {string} should be displayed on step two on bab page")
    public void sectiginiz_adres_should_be_displayed_on_step_two_on_bab_page(String homeLocation) {

        Assert.assertTrue(babPage.page2SectinizAdresText.isDisplayed());
        Assert.assertEquals(homeLocation, babPage.page2SectinizAdresTextValue.getAttribute("outerText"));

    }
    @Then("user clicks sahsi arac ulasim checkbox on step two on bab page")
    public void user_clicks_sahsi_arac_ulasim_checkbox_on_step_two_on_bab_page() {

        babPage.page2SahsiAracCheckBox.click();
    }

    @Then("user enters ulasim olanaklari from home on step two on bab page")
    public void user_enters_ulasim_olanaklari_from_home_on_step_two_on_bab_page(Map<String, String> transportationOpportunities) {

        babPage.setPage2TransportationDistances(transportationOpportunities);

    }
    @Then("ilerle button should be visible on bab page")
    public void ilerle_button_should_be_visible_on_bab_page() {

        Assert.assertTrue(babPage.ilerleButton.isDisplayed());

    }

    @Then("ilerle button should not be clickable on bab page")
    public void ilerle_button_should_not_be_clickable_on_bab_page() {

        Assert.assertEquals(babPage.ilerleButton.getAttribute("style"),"cursor: not-allowed; opacity: 0.65;");

    }

    @Then("ilerle button should be clickable on bab page")
    public void ilerle_button_should_be_clickable_on_bab_page() {

        Assert.assertEquals(babPage.ilerleButton.getAttribute("style"),"cursor: pointer;");

    }

    @Then("warning message {string} should be displayed on step {string} on bab page")
    public void warning_message_should_be_displayed_on_step_on_bab_page(String warningText, String stepNumber) {

        Assert.assertEquals(warningText, babPage.missingInfoWarningText.getAttribute("innerText"));
        Assert.assertEquals(stepNumber, babPage.theNumberOfPage.getAttribute("textContent"));

    }


}
