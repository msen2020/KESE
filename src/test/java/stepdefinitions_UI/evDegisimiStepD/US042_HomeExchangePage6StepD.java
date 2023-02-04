package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US042_HomeExchangePage6StepD {

    EvDegisimiPage homeExchange= new EvDegisimiPage();

    @Then("system displays Ilerle button on the 6th page")
    public void system_displays_Ilerle_button_on_the_6th_page() {
        Assert.assertTrue(homeExchange.ilerleButton.isDisplayed());

    }

    @Then("verify Ilerle button is NOT enable on 6th page")
    public void verify_Ilerle_button_is_NOT_enable_on_6th_page() {

        if(homeExchange.ilerleButton.getAttribute("style").contains("not-allowed")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }


    }

    @Then("verify Ilerle button is active on 6th page")
    public void verify_Ilerle_button_is_active_on_6th_page() {

        if(homeExchange.ilerleButton.getAttribute("style").contains("not-allowed")){
            Assert.assertTrue(false);
        }else{
            Assert.assertTrue(true);
        }

    }

    @When("user clicks Ilerle button on the 6th page")
    public void user_clicks_Ilerle_button_on_the_6th_page(){
       homeExchange.ilerleButton.click();
    }

    @Then("verify user sees {string} text near to Ilerle button on the 6th page")
    public void verify_user_sees_text_near_to_Ilerle_button_on_the_6th_page(String expectedErrMsg) {
        WebElement errMsg= Driver.get().findElement(By.cssSelector("small[class='ps-2']"));
        String actualErrMsg= errMsg.getText();

        Assert.assertEquals(expectedErrMsg,actualErrMsg);
    }


}
