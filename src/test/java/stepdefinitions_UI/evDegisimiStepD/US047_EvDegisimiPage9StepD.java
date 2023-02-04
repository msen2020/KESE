package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US047_EvDegisimiPage9StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @When("{string} input should be clickable")
    public void inputShouldBeClickable(String arg0) {
        Assert.assertTrue(evDegisimiPage.page9InputCalenderBox.isEnabled());
    }

    @And("if user clicks {string} input, the date selection window should open")
    public void ifUserClicksInputTheDateSelectionWindowShouldOpen(String arg0) {
        evDegisimiPage.page9InputCalenderBox.click();
        Assert.assertTrue(evDegisimiPage.page9CalendarPageSu.isDisplayed());
    }


    @And("verify if the description {string} is visible")
    public void verifyIfTheDescriptionIsVisible(String description) {
        String descriptionLocatorText = "//*[contains(text(),'"+description+"')]";
        WebElement descriptionLocator = Driver.get().findElement(By.xpath(descriptionLocatorText));
        Assert.assertTrue(descriptionLocator.isDisplayed());

    }

    @And("verify if the number of page {string} is visible")
    public void verifyIfTheNumberOfPageIsVisible(String numberOfPge) {
        String text = evDegisimiPage.theNumberOfPage.getText();
        System.out.println(text);
        Assert.assertEquals(numberOfPge, text);
//        Assert.assertTrue(evDegisimiPage.theNumberOfPage.isDisplayed());
    }

    @Then("verify if the header {string} is visible")
    public void verifyIfTheHeaderIsVisible(String header) {
        String headerLocatorText = "//*[contains(text(),'"+header+"')]";
        WebElement headerLocator = Driver.get().findElement(By.xpath(headerLocatorText));
        Assert.assertTrue(headerLocator.isDisplayed());
    }

}
