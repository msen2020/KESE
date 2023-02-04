package stepdefinitions_UI.birlikteSeyahat;
//selen

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.UI.BirlikteSeyahatPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class US133_BirlikteSeyahatPage4StepD {
    BirlikteSeyahatPage birlikteSeyahatPage = new BirlikteSeyahatPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.get();


    @When("{string} input should be clickable on BS page")
    public void inputShouldBeClickableOnBSPage(String arg0) {
        Assert.assertTrue(birlikteSeyahatPage.page5TripDateInput.isEnabled());
    }

    @And("if user clicks {string} input, the date selection window should open on BS page")
    public void ifUserClicksInputTheDateSelectionWindowShouldOpenOnBSPage(String arg0) {
        birlikteSeyahatPage.page5TripDateInput.click();
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", birlikteSeyahatPage.page5TripNextMonthIcon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", birlikteSeyahatPage.page5TripNextMonthDay1Icon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", birlikteSeyahatPage.page5TripNextMonthDay7Icon);
//        Assert.assertTrue(birlikteSeyahatPage.page5TripNextMonthDay1Icon.isDisplayed());

    }

    @Then("verify if the header {string} is visible on BS page")
    public void verifyIfTheHeaderIsVisibleOnBSPage(String header) {
        String headerLocatorText = "//*[contains(text(),'"+header+"')]";
        WebElement headerLocator = Driver.get().findElement(By.xpath(headerLocatorText));
        Assert.assertTrue(headerLocator.isDisplayed());
    }

    @And("verify if the description {string} is visible on BS page")
    public void verifyIfTheDescriptionIsVisibleOnBSPage(String description) {
        String descriptionLocatorText = "//*[contains(text(),'"+description+"')]";
        WebElement descriptionLocator = Driver.get().findElement(By.xpath(descriptionLocatorText));
        Assert.assertTrue(descriptionLocator.isDisplayed());
    }

    @And("if user clicks trip hour input, the trip hour selection window should open on BS page")
    public void ifUserClicksTripHourInputTheTripHourSelectionWindowShouldOpenOnBSPage() {
        birlikteSeyahatPage.page5TripHourMenu.click();
        Assert.assertTrue(birlikteSeyahatPage.page5TripHour1AMOption.isEnabled());
        birlikteSeyahatPage.page5TripHour1AMOption.click();
    }
}
