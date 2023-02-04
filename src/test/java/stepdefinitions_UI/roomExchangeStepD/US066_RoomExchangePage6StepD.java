package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.OdaKiralaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US066_RoomExchangePage6StepD {



    OdaKiralaPage roomExchange = new OdaKiralaPage();


    @Then("user should see the {string} header on the 6th roomExchange Page")
    public void user_should_see_the_header_on_the_6th_roomExchange_Page(String header) {
        System.out.println("roomExchange.page6AciklamaHeader.getText() = " + roomExchange.page6AciklamaHeader.getText());
        System.out.println("roomExchange.page6AciklamaHeader.getText() = " + roomExchange.page6AciklamaHeader.getText());

        if (roomExchange.page6AciklamaHeader.getText().equals(header)) {
            Assert.assertTrue(roomExchange.page6AciklamaHeader.isDisplayed());
        } else {
            Assert.assertTrue(false);
        }

    }


    @Then("verify {string} text is displayed on the 6th roomExchange page")
    public void verify_text_is_displayed_on_the_6th_roomExchange_page(String expectedText) {
        String actualText = roomExchange.page6Parag.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @When("user enters {string} explanation to the inputbox on the 6th roomExchange page")
    public void user_enters_explanation_to_the_inputbox_on_the_6th_roomExchange_page(String text) {
        roomExchange.page6roomExplanation.sendKeys(text);

    }


    @Then("verify input box accept {string} explanation correctly on the 6th roomExchange page")
    public void verify_input_box_accept_explanation_correctly_on_the_6th_roomExchange_page(String text) {
        Assert.assertEquals(text, roomExchange.page6roomExplanation.getText());
    }

    @Then("verify user is on the {string} roomExchange page")
    public void verify_user_is_on_the_roomExchange_page(String expectedPageNum) {
        String actualPageNum6 = roomExchange.page6PageNum.getText();
        String actualPageNum7 = roomExchange.theNumberOfPage7.getText();

        if (expectedPageNum.equals(actualPageNum6)) {
            Assert.assertTrue(true);
        } else if (expectedPageNum.equals(actualPageNum7)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }


    }
}
