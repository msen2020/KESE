package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US041_HomeExchangePage6StepD {

    WebDriver driver= Driver.get();
    EvDegisimiPage homeExchange = new EvDegisimiPage();

    @Given("user is on page {string}")
    public void user_is_on_page(String url) {
        driver.get(url);
    }

    @Then("user should see the {string} header on the 6th Page")
    public void user_should_see_the_header_on_the_6th_Page(String header) {

        if(homeExchange.page6AciklamaHeader.getText().equals(header)){
            Assert.assertTrue(homeExchange.page6AciklamaHeader.isDisplayed());
        }else {
            Assert.assertTrue(false);
        }
    }


    @Then("verify {string} text is displayed on the page")
    public void verify_text_is_displayed_on_the_page(String expectedText) {
        String actualText = homeExchange.page6Parag.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @When("user enters {string} explanation to the inputbox on the 6th page")
    public void user_enters_explanation_to_the_inputbox_on_the_6th_page(String text) {
        homeExchange.page6textArea.sendKeys(text);
    }



    @Then("verify input box accept {string} explanation correctly on the 6th page")
    public void verify_input_box_accept_explanation_correctly_on_the_6th_page(String text) {
       Assert.assertEquals(text,homeExchange.page6textArea.getText());
    }

    @Then("verify user is on the {string} page")
    public void verify_user_is_on_the_page(String expectedPageNum) {
        String actualPageNum6= homeExchange.page6PageNum.getText();
        String actualPageNum7= homeExchange.theNumberOfPage7.getText();

        if(expectedPageNum.equals(actualPageNum6)) {
            Assert.assertTrue(true);
        }else if(expectedPageNum.equals(actualPageNum7)){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }



























}
