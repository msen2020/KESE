package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US050_EvDegisimiPage9StepD {

    EvDegisimiPage edp = new EvDegisimiPage();

    @When("user picks today's dates")
    public void userPicksTodaySDates() {

        edp.page9InputCalenderBox.click();
        edp.step9_TodayOption.click();
        edp.step9_TodayOption.click();

    }

    //    @Then("user verifies selected dates {string} are added under Seçtiğiniz Tarihler")
//    public void user_verifies_selected_dates_are_added_under_sectiginiz_tarihler(String expectedDate) {
//
//       String actualDate= edp1.page9SelectedDate.getText();
//
//        System.out.println(actualDate);
//
//        Assert.assertEquals(actualDate, expectedDate );

    //    }


    @When("user select a date user should see  X cancel the date button on the right side")
    public void user_select_a_date_user_should_see_x_cancel_the_date_button_on_the_right_side() {

        System.out.println(edp.page9XButton.getText());
        boolean xIsDisplayed = edp.page9XButton.isDisplayed();
        Assert.assertTrue(xIsDisplayed);

    }

    @When("user click on the x button date frame should be clear and {string} should be exist.")
    public void userClickOnTheXButtonDateFrameShouldBeClearAndShouldBeExist(String expectedText) {

        edp.page9XButton.click();
        String actualText = edp.page9clickOnDate.getAttribute("placeholder");
        Assert.assertEquals(actualText, expectedText);

    }

//    @When("user delete date on the frame selected date Seçtiğiniz Tarihler shouldn't be displayed")
//    public void userDeleteDateOnTheFrameSelectedDateSeçtiğinizTarihlerShouldnTBeDisplayed() {
//
//   try{
//       edp1.page9SectiginizTarihler.isDisplayed();
//
//   }catch(RuntimeException exception){
//       System.out.println("Seçtiğiniz Tarihler doesn't exist on the frame");
//        }

//    }


    @Then("user verifies that Today's date are added under Sectiginiz Tarihler Title")
    public void userVerifiesThatTodaySDateAreAddedUnderSectiginizTarihlerTitle() {

        String month = "March 2022";
        String day = "6";
        edp.selectTheDates.click();
        edp.step9_TodayOption.click();
        edp.step9_TodayOption.click();

        String actualDateText = edp.page9InputCalenderBox.getAttribute("value");
        System.out.println("Actual date is = " + actualDateText);
        Assert.assertTrue(actualDateText.contains("03/16/2022 - 03/16/2022"));
    }

    @When("user delete date on the frame selected date Sectiginiz Tarihler shouldn't be displayed")
    public void userDeleteDateOnTheFrameSelectedDateSectiginizTarihlerShouldnTBeDisplayed() {
        try {
            edp.page9SectiginizTarihler.isDisplayed();

        } catch (RuntimeException exception) {
            System.out.println("Seçtiğiniz Tarihler doesn't exist on the frame");
        }


    }


}
