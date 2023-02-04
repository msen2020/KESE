package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

public class US116_BedAndBreakfastStepD {

    BedAndBreakfastPage bab = new BedAndBreakfastPage();

    @Then("user verifies the text {string} is visible")
    public void verifiestheTextIsVisible(String text) {

        String locatorText = "//*[contains(text(),'" + text + "')]";
        WebElement locatedElement = Driver.get().findElement(By.xpath(locatorText));
        Assert.assertTrue(locatedElement.isDisplayed());
        //System.out.println(text);
    }

    @When("user clicks {string} input")
    public void userClicksInput(String arg0) {

        LocalDate currentDate = LocalDate.now();
        bab.page9InputCalenderBox.click();
        Assert.assertTrue(bab.page9currentMonthText.isDisplayed());
//      System.out.println(currentDate.getMonth());
//      System.out.println(bab.page9currentMonthText.getText());
        String nowMonth = String.valueOf(currentDate.getMonth());
        Assert.assertTrue(bab.page9currentMonthText.getText().

                toUpperCase().

                contains(nowMonth)); //();

    }

    @Then("user verifies that the date selection window is visible")
    public void userVerifiesThatTheDateSelectionWindowIsVisible() {
        bab.page9DatePickerIsVisible.isDisplayed();
        Assert.assertTrue(bab.page9DatePickerIsVisible.isDisplayed());
    }

    @Then("user verifies text {string} the is visible")
    public void userVerifiesTextTheIsVisible(String pageNum) {
        String text = bab.theNumberOfPage.getText();
        //System.out.println(text);
        Assert.assertEquals(pageNum, text);

    }

}



