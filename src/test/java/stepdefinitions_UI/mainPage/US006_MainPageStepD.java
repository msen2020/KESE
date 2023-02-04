package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class US006_MainPageStepD {

    MainPage kese = new MainPage();

    @When("go to {string} page")
    public void go_to_page(String string) {

        WebDriver driver = Driver.get();
        driver.get(ConfigurationReader.get("ui_url"));
        driver.manage().window().maximize();

    }

    @Then("Click Cargo button")
    public void click_Cargo_button() {
        BrowserUtils.waitForPageToLoad(3);
        kese.CargoButton.click();
        Assert.assertTrue(kese.CargoButton.isDisplayed());

    }

    @Then("Click Cargo button and cargo is displayed")
    public void click_Cargo_button_and_cargo_is_displayed() {
        BrowserUtils.waitForPageToLoad(3);
        kese.CargoButton.click();
        Assert.assertTrue(kese.CargoButton.isDisplayed());
    }

    @Then("{string} is displayed")
    public void is_displayed(String string) {
        //1.yol  Assert.assertTrue(kese.Cargomessage.isDisplayed());

        //2.YOL
        String expectedResult = "Kargo göndermek istediğiniz noktayı seçiniz";
        String actualResult = kese.Cargomessage.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Then("Cargo button should be clickable and displayed")
    public void cargo_button_should_be_clickable_and_displayed() {
        BrowserUtils.waitForPageToLoad(1);
        kese.CargoButton.click();
        Assert.assertTrue(kese.CargoButton.isDisplayed());

    }

}
