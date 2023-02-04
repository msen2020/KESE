package stepdefinitions_UI.cargo;
//selen
import com.kese.pages.UI.KargoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US142_KargoPage4StepD {
    KargoPage kargoPage = new KargoPage();

    @Then("ilerle button should be visible on kargo page")
    public void ilerle_button_should_be_visible_on_kargo_page() {
        Assert.assertTrue(kargoPage.ilerleButton.isDisplayed());
    }

    @Then("ilerle button should not be clickable on kargo page")
    public void ilerle_button_should_not_be_clickable_on_kargo_page() {
        Assert.assertTrue(kargoPage.ilerleButton.getAttribute("style").contains("cursor: not-allowed;"));
    }

    @When("ilerle button opacity should be {double} on kargo page")
    public void ilerle_button_opacity_should_be_on_kargo_page(Double opacity) {
        Assert.assertTrue(kargoPage.ilerleButton.getAttribute("style").contains("opacity: 0.65"));
    }

    @Then("ilerle button should be clickable on kargo page")
    public void ilerle_button_should_be_clickable_on_kargo_page() {
        Assert.assertEquals(kargoPage.ilerleButton.getAttribute("style"),"cursor: pointer;");
    }

    @When("user clicks to the ilerle button on kargo page")
    public void user_clicks_to_the_ilerle_button_on_kargo_page() {
        kargoPage.ilerleButton.click();
    }

    @Then("warning message {string} should be displayed on kargo page")
    public void warning_message_should_be_displayed_on_kargo_page(String warningText) {
        Assert.assertEquals(warningText, kargoPage.missingInfoWarningText.getAttribute("innerText"));
    }

    @When("user enters {string} to aciklamalar on kargo page")
    public void user_enters_to_aciklamalar_on_kargo_page(String description) {

        kargoPage.step3_kargoBilgileriTextBox.clear();
        kargoPage.step3_kargoBilgileriTextBox.sendKeys(description);

    }

}
