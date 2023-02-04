package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US049_EvDegisimi9PageStepD {

    EvDegisimiPage edp = new EvDegisimiPage();


    @Then("user verifies that the text {string} is exist")
    public void userVerifiesThatTheTextExist(String expectedText) {

        String actualText = edp.page9InputCalenderBox.getAttribute("placeholder");
        System.out.println("Actual Text on UI is = " + actualText);
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @When("user picks a date")
    public void userPickADate() {
        edp.page9InputCalenderBox.click();
        edp.pickAnyDate.click();
        edp.pickAnyDate.click();

    }

    @Then("user verifies that the selected dates are exist in the input")
    public void userVerifiesThatTheSelectedDatesAreExistInTheInput() {

        String actualDateText = edp.page9InputCalenderBox.getAttribute("value");
        System.out.println("Actual date is = " + actualDateText);
        Assert.assertTrue(actualDateText.contains("03/16/2022 - 03/16/2022"));
    }

    @Then("user verifies that the selected date input is enabled")
    public void userVerifiesThatTheSelectedDateInputIsEnabled() {

        boolean isCalendarEnabled = edp.page9InputCalenderBox.isEnabled();
        System.out.println("Is the Calendar Enabled?  " + isCalendarEnabled);
        Assert.assertTrue(isCalendarEnabled);

    }


}
