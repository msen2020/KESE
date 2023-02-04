package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US117_BedAndBreakfastPage9StepD {
    BedAndBreakfastPage bab = new BedAndBreakfastPage();


    @Then("verify if {string} button is visible ,shouldn't be clickable as a default")
    public void verifyIfButtonIsVisibleShouldnTBeClickableAsADefault(String text) {
        WebElement ilerleLocator = Driver.get().findElement(By.xpath("//*[contains(text(), '" + text + "')]"));
        Assert.assertTrue(ilerleLocator.isDisplayed());
        Boolean flag = true;
        if (bab.ilerleButton.getAttribute("style").substring(8, 19).equals("not-allowed")) {
            flag = false;
        }
        Assert.assertFalse(flag);
    }

    @When("user clicks any date and ilerle button on page nine")
    public void userClicksAnyDateAndIlerleButtonOnPageNine() {
        bab.page9clickOnDate.click();
        bab.page9todaysLocator.click();
        BrowserUtils.waitFor(1 / 2);
        bab.page9todaysLocator.click();
        bab.ilerleButton.click();

    }

    @Then("verify if the {string}  is visible")
    public void verifyIfTheIsVisible(String text) {
        WebElement ilerleLocator = Driver.get().findElement(By.xpath("//*[contains(text(), '" + text + "')]"));
        Assert.assertTrue(ilerleLocator.isDisplayed());

    }
}
