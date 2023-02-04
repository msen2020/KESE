package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;

public class US118_BedAndBreakfastPage9SepD {

    BedAndBreakfastPage page = new BedAndBreakfastPage();

    @Then("user verifies that the text {string} should be exist in the input")
    public void userVerifiesThatTheTextShouldBeExistInTheInput(String text) {
        Assert.assertTrue(page.page9InputCalenderBox.isDisplayed());
        System.out.println(text);
    }

    @When("user picks the dates")
    public void userPicksTheDates() {
        page.page9InputCalenderBox.click();
        page.march16th.click();
        page.march26th.click();
        System.out.println(page.page9pickedDates);
    }

    @Then("user verifies that the selected date range should be included in the input")
    public void userVerifiesThatTheSelectedDateRangeShouldBeIncludedInTheInput() {

        String selectedDates = page.page9pickedDates.getText();
        Assert.assertTrue(page.page9pickedDates.isDisplayed());
        System.out.println(selectedDates);
    }

    @Then("user verifies that the date selection input should be active and enabled")
    public void userVerifiesThatTheDateSelectionInputShouldBeActiveAndEnabled() {
        boolean isCalendarDisable = page.page9InputCalenderBox.isEnabled();
        System.out.println("takvim disbale mi:  " + isCalendarDisable);
        Assert.assertTrue(isCalendarDisable);
        // burayi kontrol et
    }
}
