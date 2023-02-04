package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US048_EvDegisimiPage9StepD {

    EvDegisimiPage page = new EvDegisimiPage();

    @Then("verify if {string} warning message appears")
    public void verifyIfWarningMessageAppears(String expectedWarningMessage) {
        page.nextButton.click();
        String actualWarningMessageText = "//small[contains(text(), '"+expectedWarningMessage+"')]";
        String actualWarningMessage = Driver.get().findElement(By.xpath(actualWarningMessageText)).getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
    }

    @Then("verify if {string} button is visible")
    public void verifyIfButtonIsVisible(String text) {
        WebElement ilerleLocator = Driver.get().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        Assert.assertTrue(ilerleLocator.isDisplayed());

    }

    @Then("verify if {string} button shouldn't be clickable as a default")
    public void verifyIfButtonShouldnTBeClickableAsADefault(String arg0) {

        Boolean flag = true;
        if(page.ilerleButton.getAttribute("style").substring(8, 19).equals("not-allowed")){
            flag = false;
        }
        Assert.assertFalse(flag);
    }

    @When("user clicks any date on page nine")
    public void userClicksAnyDateOnPageNine() {
        page.selectTheDates.click();
        page.todaysDateLocator.click();
        BrowserUtils.waitFor(1/2);
        page.todaysDateLocator.click();
//        page.nextButton.click();
    }

    @Then("verify if ilerle button is clickable")
    public void verifyIfIlerleButtonShouldBeClickable() {
        Assert.assertTrue(page.ilerleButton.isEnabled());
    }


}
