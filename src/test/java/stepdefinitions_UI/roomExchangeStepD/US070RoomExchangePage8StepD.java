package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class US070RoomExchangePage8StepD {

    OdaKiralaPage page1 = new OdaKiralaPage();
    EvDegisimiPage page = new EvDegisimiPage();

    @And("user should click to Ilan Ver go to page {int} in OdaDegisimi")
    public void userShouldClickToIlanVerGoToPageInOdaDegisimi(int sayfa) throws AWTException{
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                throw new IllegalArgumentException("Not valid page number :" + sayfa);
            }
            // Here you are in Main page
            page1.dropdownIlanVerButton.click();
            page1.dropDownOda.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page1.page1RoomMustakilEv.click();
            page1.page1RoomKiraBox.click();
            page.ilerleButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.selectText.click();
            page.selectTextButton.sendKeys("London, Birleşik Krallık");
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_ENTER);
            page.step2_CheckBox.click();
            page.nextButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page1.page3KullanimAlaniInput.sendKeys("50");
            for (WebElement e : page1.step3_incrementButtons) {
                e.click();
            }
            page.ilerleButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            page1.page4AgeFarketmez.click();
            page1.page4GenderFarketmez.click();
            page1.page4KisiSayisiPlus.click();
            page.ilerleButton.click();
            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            page1.page5WIFI.click();
            page.ilerleButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            page1.page6roomExplanation.sendKeys("Home home sweet home");
            page.ilerleButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            page1.page7Plaj.click();
            page.ilerleButton.click();
            if (sayfa == 8)
                break;
            // Here you are in 8th page
            for (WebElement element : page.yesTexts) {
                element.click();
                BrowserUtils.waitFor(1 / 2);
            }
            page.nextButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            page1.page9InputCalenderBox.click();
            page.todaysDateLocator.click();
            BrowserUtils.waitFor(1 / 2);
            page.todaysDateLocator.click();
            page.ilerleButton.click();
            break;
            // Here you are in 10th page
        }
    }

    @Then("user see all option titles are visible in page eight")
    public void userSeeAllOptionTitlesAreVisibleInPageEight() {
        Assert.assertTrue(page.page8Cocuklarinizgetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8Evcilhayvanlarigetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilir.isDisplayed());

    }

    @Then("user see all choises are visible and clickable in page eight")
    public void userSeeAllChoisesAreVisibleAndClickableInPageEight() {
        // #1
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizEVET.isDisplayed());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizEVET.isEnabled());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizHAYIR.isDisplayed());
        Assert.assertTrue(page.page8CocuklarinizgetirebilirsinizHAYIR.isEnabled());
        //#2
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizEVET.isDisplayed());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizEVET.isEnabled());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizHAYIR.isDisplayed());
        Assert.assertTrue(page.page8EvcilhayvanlarigetirebilirsinizHAYIR.isEnabled());
        //#3
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirEVET.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirEVET.isEnabled());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirHAYIR.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilirHAYIR.isEnabled());
    }
}
