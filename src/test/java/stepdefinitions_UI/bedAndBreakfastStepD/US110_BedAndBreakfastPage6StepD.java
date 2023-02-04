package stepdefinitions_UI.bedAndBreakfastStepD;


import com.kese.pages.UI.BedAndBreakfastPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class US110_BedAndBreakfastPage6StepD {

    BedAndBreakfastPage bedAndBreakfastPage= new BedAndBreakfastPage();


    @Then("verify user sees the {string} header on the 6th BedAndBreakfast Page")
    public void verify_user_sees_the_header_on_the_6th_bed_and_breakfast_page(String expectedText) {
        String actualText = bedAndBreakfastPage.page6header.getText();
        assertEquals(expectedText,actualText);

    }


    @Then("verify {string} text is displayed on the 6th BedAndBreakfast Page")
    public void verify_text_is_displayed_on_the_6th_bed_and_breakfast_page(String expectedParag) {

        String actualParag = bedAndBreakfastPage.pageInfoText.getText();
        assertEquals(expectedParag,actualParag);

    }


    @Then("verify user is on the {string} BedAndBreakfast page")
    public void verify_user_is_on_the_bed_and_breakfast_page(String expectedPageNum) {
        String actualPageNum = bedAndBreakfastPage.theNumberOfPage.getText();
        assertEquals(expectedPageNum,actualPageNum);

    }



    @Then("verify user can see the each header such as")
    public void verify_user_can_see_the_each_header_such_as(List<String> expectedHeaders) {
        List<WebElement> headersElem = bedAndBreakfastPage.page6inputBoxHeaders;
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement header: headersElem){
            actualHeaders.add(header.getText());
        }

        assertEquals(expectedHeaders,actualHeaders);

    }



    @Then("verify {string} is displayed in {string} on the 6th BedAndBreakfast Page")
    public void verify_is_displayed_in_on_the_6th_bed_and_breakfast_page(String expectedSample, String expectedInputBox) {

        String actualSample= null;

        if(expectedInputBox.equals("Room")){
            actualSample = bedAndBreakfastPage.page6inputBoxRoom.getText();
            assertEquals(expectedSample,actualSample);

        }else if(expectedInputBox.equals("Home")){
            actualSample = bedAndBreakfastPage.page6inputBoxHome.getText();
            assertEquals(expectedSample,actualSample);

        }else if(expectedInputBox.equals("Breakfast")){
            actualSample = bedAndBreakfastPage.page6inputBoxBreakf.getText();
            assertEquals(expectedSample,actualSample);
        }



    }



    @When("user enters {string} to the {string} inputBox on the 6th BedAndBreakfast Page")
    public void user_enters_to_the_input_box_on_the_6th_bed_and_breakfast_page(String expectedText, String expectedInput) {


        if(expectedInput.equals("Room")){
            bedAndBreakfastPage.page6inputBoxRoom.sendKeys(expectedText);

        }else if(expectedInput.equals("Home")){
            bedAndBreakfastPage.page6inputBoxHome.sendKeys(expectedText);

        }else if(expectedInput.equals("Breakfast")){
            bedAndBreakfastPage.page6inputBoxBreakf.sendKeys(expectedText);

        }


    }



    @Then("verify system displayed {string} in {string} on the 6th BedAndBreakfast Page")
    public void verify_system_displayed_in_on_the_6th_bed_and_breakfast_page(String expectedText, String expectedInput) {

        String actualText= null;

        if(expectedInput.equals("Room")){
            actualText = bedAndBreakfastPage.page6inputBoxRoom.getText();
            assertEquals(expectedText,actualText);

        }else if(expectedInput.equals("Home")){
            actualText = bedAndBreakfastPage.page6inputBoxHome.getText();
            assertEquals(expectedText, actualText);

        }else if(expectedInput.equals("Breakfast")){
            actualText = bedAndBreakfastPage.page6inputBoxBreakf.getText();
            assertEquals(expectedText, actualText);

        }
    }


    @Then("verify Ilerle button is NOT active on 6th BedAndBreakfast Page")
    public void verify_ilerle_button_is_NOT_active_on_6th_bed_and_breakfast_Page() {
        if(bedAndBreakfastPage.ilerleButton.getAttribute("style").contains("not-allowed")){
        assertTrue(true);
        }else{
            assertTrue(false);
        }

    }



    @Then("verify Ilerle button is active on 6th BedAndBreakfast Page")
    public void verify_ilerle_button_is_active_on_6th_bed_and_breakfast_Page() {
        assertTrue(bedAndBreakfastPage.ilerleButton.isEnabled());
    }



}
