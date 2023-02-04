package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;

public class US107_BadAndBreakfastPage4StepDefs {

    BedAndBreakfastPage page = new BedAndBreakfastPage();


    @Then("{string} button should be displayed")
    public void buttonShouldBeDisplayed(String arg0) {
        Assert.assertTrue(page.ilerleButton.isDisplayed());
    }

    @Then("{string} button should not be clickable")
    public void buttonShouldNotBeClickable(String arg0) {
        Assert.assertFalse(page.ilerleButton.getAttribute("style").contains("cursor: pointer;"));

    }

    @When("click the {string} button")
    public void clickTheButton(String arg0) {
        page.ilerleButton.click();

    }

    @Then("{string} warning should be visible.")
    public void warningShouldBeVisible(String expected) {
        Assert.assertEquals(expected, page.page4Uyari.getText());

    }

    @When("user clicks {string} age")
    public void userClicksAge(String age) {
        page.clickPage4Ageoptions(age);

    }

    @And("user clicks {string} gender")
    public void userClicksGender(String gender) {
        page.clickPage4Gender(gender);

    }

    @And("user clicks + button")
    public void userClicksButton() {
        page.page4plusbutton.click();

    }

    @Then("{string} button should be clickable")
    public void buttonShouldBeClickable(String ilerle) {
        Assert.assertTrue(page.ilerleButton.getAttribute("style").contains("cursor: pointer;"));
        page.ilerleButton.click();

    }

    @Then("Verify {string} page is displayed")
    public void verifyPageIsDisplayed(String pagenumber) {
       // Assert.assertTrue(pagenumber,page.page4to5thPageVerification.getText());
        //page.page4to5thPageVerification.getText()

        System.out.println(page.page4to5thPageVerification.getText());

        Assert.assertEquals(pagenumber,page.page4to5thPageVerification.getText());
      //  Assert.assertTrue(page.page4to5thPageVerification.getAttribute("text").contains("5"));

    }
}