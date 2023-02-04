package stepdefinitions_UI.evDegisimiStepD;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UI.EvDegisimiPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class US032_EvDegisimiPage1StepD {

    EvDegisimiPage page = new EvDegisimiPage();

    WebElement mustakilEv = Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[1]"));
    WebElement apartman = Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[2]"));
    WebElement studyo = Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[3]"));

    WebElement ilerleB = Driver.get().findElement(By.id("next"));


    @And("ilerle button must be visible")
    public void ilerleButtonMustBeVisible() {

        Assert.assertTrue(ilerleB.isDisplayed());
    }

    @Given("ilerle button must be clickable when the user clicks {string}")
    public void ilerleButtonMustBeClickableWhenTheUserClicks(String EvTipi) {
        if (EvTipi.equals("Mustakil Ev") && mustakilEv.isEnabled()) {
            Assert.assertTrue(page.ilerleButton.isEnabled());
        } else if (EvTipi.equals("Apartaman Dairesi") && apartman.isEnabled()) {
            Assert.assertTrue(page.ilerleButton.isEnabled());
        } else if (EvTipi.equals("Studyo Daire") && studyo.isEnabled()) {
            Assert.assertTrue(page.ilerleButton.isEnabled());
        }
    }

    @Given("user sees {string} warnings when he  clicks ilerle button")
    public void userSeesWarningsWhenHeClicksIlerleButton(String warningHouse) {
        BrowserUtils.waitForClickability(ilerleB,5).click();
        WebElement warning = Driver.get().findElement(By.xpath("//*[text()='*Lütfen ev tipini seçiniz.']"));
        // if(ilerleB.isEnabled()){

        String actual= warning.getText();
        System.out.println(actual);
//
//
        Assert.assertEquals(warningHouse,actual);
//         // BrowserUtils.waitForVisibility(warning,5).isDisplayed();
    }

    @And("user can click ilerle button")
    public void userCanClickIlerleButton() {
        BrowserUtils.waitForClickability(Driver.get().findElement(By.xpath("//button[@class='btn btn-light py-1  bg-light']")),5).click();
    }
}
