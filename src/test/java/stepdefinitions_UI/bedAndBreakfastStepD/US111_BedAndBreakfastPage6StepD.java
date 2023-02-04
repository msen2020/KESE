package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.When;
import pages.UI.BedAndBreakfastPage;

public class US111_BedAndBreakfastPage6StepD {
    BedAndBreakfastPage babPage = new BedAndBreakfastPage();
    @When("user enters {string} {string} {string} on step six on bab page")
    public void user_enters_on_step_six_on_bab_page(String roomFeatures, String homeFeatures, String breakfastFeatures) {

        babPage.page6inputBoxRoom.sendKeys(roomFeatures);
        babPage.page6inputBoxHome.sendKeys(homeFeatures);
        babPage.page6inputBoxBreakf.sendKeys(breakfastFeatures);
    }
}
