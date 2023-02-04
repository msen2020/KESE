package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US063_Room4NextButtonStepDef {

    OdaKiralaPage page=new OdaKiralaPage();
    EvDegisimiPage page2=new EvDegisimiPage();
    WebDriver driver= Driver.get();


//    @Then("user asserts İlerle button is visible sevda")
//    public void userAssertsİlerleButtonIsVisibleSevda() {
//        Assert.assertTrue(page2.nextButton.isDisplayed());
//    }


//    @Then("user assert İlerle button is not clickable")
//    public void userAssertİlerleButtonIsNotClickable() {
//        Assert.assertFalse( page2.nextButton.isEnabled());
//    }

    @And("user enter age as Farketmez")
    public void userEnterAgeAsFarketmez() {
        page.page4AgeFarketmez.click();

    }

    @And("user enter gender as Farketmez")
    public void userEnterGenderAsFarketmez() {
        page.page4GenderFarketmez.click();
    }

//    @Then("user assert İlerle button is clickable")
//    public void userAssertİlerleButtonIsClickable() {
//        Assert.assertTrue(page2.nextButton.isEnabled());
//
//    }

//    @And("user clicks on İlerle button")
//    public void userClicksOnİlerleButtonSevda() {
//        page2.nextButton.click();
//    }

    @And("user clicks on {string}")
    public void userClicksOn(String genderSelected) {
        if (genderSelected.equalsIgnoreCase("Kadin")) {
            page.page4GenderFarketmez.click();
            page.page4GenderErkek.click();
            page.page4GenderKadin.click();
        } else if (genderSelected.equalsIgnoreCase("Erkek")) {
            page.page4GenderKadin.click();
            page.page4GenderFarketmez.click();
            page.page4GenderErkek.click();
        } else if (genderSelected.equalsIgnoreCase("Farketmez")) {
            page.page4GenderErkek.click();
            page.page4GenderKadin.click();
            page.page4GenderFarketmez.click();

        }
    }

    @Then("assert thatother gender options are not selected")
    public void assertThatotherGenderOptionsAreNotSelected() {
        String notSelected = "rgba(33, 37, 41, 1)";
        String selectedColour = "rgba(248, 249, 250, 1)";

        if (page.page4GenderKadin.getCssValue("color").equalsIgnoreCase(selectedColour)) {

            Assert.assertEquals(notSelected, page.page4GenderErkek.getCssValue("color"));
            Assert.assertEquals(notSelected, page.page4GenderFarketmez.getCssValue("color"));

        } else if (page.page4GenderErkek.getCssValue("color").equalsIgnoreCase(selectedColour)) {

            Assert.assertEquals(notSelected, page.page4GenderKadin.getCssValue("color"));

            Assert.assertEquals(notSelected, page.page4GenderFarketmez.getCssValue("color"));
        } else if (page.page4GenderFarketmez.getCssValue("color").equalsIgnoreCase(selectedColour)) {

            Assert.assertEquals(notSelected, page.page4GenderKadin.getCssValue("color"));
            Assert.assertEquals(notSelected, page.page4GenderErkek.getCssValue("color"));

        }
    }

    @Then("user asserts ilerle button is visible sevda")
    public void userAssertsIlerleButtonIsVisibleSevda() {
        Assert.assertTrue(page2.nextButton.isDisplayed());
    }

    @Then("user assert ilerle button is not clickable")
    public void userAssertIlerleButtonIsNotClickable() {
        Assert.assertFalse( page2.nextButton.isEnabled());
    }

    @And("user clicks on ilerle button")
    public void userClicksOnIlerleButton() {
        page2.nextButton.click();
    }

    @Then("user assert ilerle button is clickable")
    public void userAssertIlerleButtonIsClickable() {
        Assert.assertTrue(page2.nextButton.isEnabled());
    }

}
