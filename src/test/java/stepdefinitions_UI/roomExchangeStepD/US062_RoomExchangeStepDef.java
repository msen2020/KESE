package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

import static java.awt.event.KeyEvent.VK_ENTER;

public class US062_RoomExchangeStepDef {

    OdaKiralaPage page = new OdaKiralaPage();
    EvDegisimiPage page2 = new EvDegisimiPage();
    WebDriver driver = Driver.get();


    @And("user chooses options for coming to step four in url")
    public void userChoosesOptionsForComingToStepFourInUrl() throws AWTException {
        page.page1RoomStudyo.click();
        page.page1RoomKiraBox.click();
        page2.nextButton.click();

        page2.selectText.click();
        page2.selectTextButton.sendKeys("Frankfurt, Almanya");
        BrowserUtils.waitFor(1);
        Robot robot = new Robot();
        robot.keyPress(VK_ENTER);
        BrowserUtils.waitFor(1);
        page2.checkBox.click();
        page2.nextButton.click();

        page2.sizeOfAreaUp.sendKeys("50");
        page2.nextButton.click();

    }

    @And("waiting for you")
    public void waitingForYou() {
        BrowserUtils.waitFor(3);
    }

    @Then("user asserts {string} is visible")
    public void userAssertsIsVisible(String option) {
        String path = "//*[text()='" + option + "']";
        driver.findElement(By.xpath(path)).isDisplayed();
    }

    @Then("assert that four slash ten should be visible")
    public void assertThatFourSlashTenShouldBeVisible() {
        String expected = "4 / 10";
        String actual = page2.page1oneSlashTenWriting.getText();
        // System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @And("click on Farketmez in age area")
    public void clickOnFarketmezInAgeArea() {
        page.page4AgeFarketmez.click();
    }

    // @Then("assert that other age gaps are not selected")
    // public void assertThatOtherAgeGapsAreNotSelected() {
    // Assert.assertTrue(!(page.page4Age1 || page.page4Age2 || page.page4Age3 || page.page4Age4
    // ||page.page4Age5 || page.page4Age6 || page.page4Age7).isSelected);}

    @Then("assert that other {string}are not selected")
    public void assertThatOtherAreNotSelected(String age) {
        String path = "//span[text()='" + age + "']";
        driver.findElement(By.xpath(path)).isSelected();

    }

    @And("user clicks on all age gaps")
    public void userClicksOnAllAgeGaps() {
        page.page4Age1.click();
        page.page4Age2.click();
        page.page4Age3.click();
        page.page4Age4.click();
        page.page4Age5.click();
        page.page4Age6.click();
        page.page4Age7.click();

    }

    @Then("user asserts all age gaps are selected")
    public void userAssertsAllAgeGapsAreSelected() {
        String expectedColour = "rgba(248, 249, 250, 1)";
        String actualColour1 = page.page4Age1.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour1);
        String actualColour2 = page.page4Age2.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour2);
        String actualColour3 = page.page4Age3.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour3);
        String actualColour4 = page.page4Age4.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour4);
        String actualColour5 = page.page4Age5.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour5);
        String actualColour6 = page.page4Age6.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour6);
        String actualColour7 = page.page4Age7.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour7);

        //System.out.println(actualColour);

    }

    @Then("assert that all age gaps are not selected")
    public void assertThatAllAgeGapsAreNotSelected() {
        String expectedColour = "rgba(33, 37, 41, 1)";
        String actualColour1 = page.page4Age1.getCssValue("color");
        //System.out.println(actualColour1);
        Assert.assertEquals(expectedColour, actualColour1);
        String actualColour2 = page.page4Age2.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour2);
        String actualColour3 = page.page4Age3.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour3);
        String actualColour4 = page.page4Age4.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour4);
        String actualColour5 = page.page4Age5.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour5);
        String actualColour6 = page.page4Age6.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour6);
        String actualColour7 = page.page4Age7.getCssValue("color");
        Assert.assertEquals(expectedColour, actualColour7);

    }


    @And("user click increment button for {int} times")
    public void userClickIncrementButtonForTimes(int inc) {
        for (int i = 0; i <= inc; i++) {
            page.page4KisiSayisiPlus.click();
        }

    }


    @Then("assert input is {int}")
    public void assertInputIs(int arg0) {
        String input = "" + arg0;
        Assert.assertEquals(input, page.page4kisiSayisi.getText());

    }

    @And("user click decrement button for {int} times")
    public void userClickDecrementButtonForTimes(int dec) {
        for (int i = 0; i <= dec; i++) {
            page.page4KisiSayisiMinus.click();
        }
    }
}


