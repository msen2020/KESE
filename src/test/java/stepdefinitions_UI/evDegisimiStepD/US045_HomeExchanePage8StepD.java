package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class US045_HomeExchanePage8StepD {

    EvDegisimiPage page = new EvDegisimiPage();

    @And("user navigates to page {int} in HomeExchange")
    public void userNavigatesToPageInHomeExchange(int j) throws AWTException, InterruptedException{

        page.dropdownMenuButton.click();
        page.homeExchangeOption.click();
        do{
            // 1.Sayfa
            page.houseButton.click();
            page.nextButton.click();
            if (j == 2)
                break;
            //2.sayfa
            page.selectText.click();
            page.selectTextButton.sendKeys("London, Birleşik Krallık");
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_ENTER);
            page.step2_CheckBox.click();
            page.nextButton.click();
            if (j == 3)
                break;
            //3. sayfa
            page.sizeOfAreaUp.sendKeys("50");
            page.nextButton.click();
            if (j == 4)
                break;
            // 4.sayfa
            page.plus.click();
            page.nextButton.click();
            if (j == 5)
                break;
            //5. sayfa
            page.tvText.click();
            page.nextButton.click();
            if (j == 6)
                break;
            //6. sayfa
            page.homeExplanation.sendKeys("My home, sweet home.");
            page.nextButton.click();
            if (j == 7)
                break;
            //7.sayfa
            page.museumText.click();
            page.nextButton.click();
            if (j == 8)
                break;
            //8. sayfa
            for (WebElement element : page.yesTexts) {
                element.click();
            }
            page.nextButton.click();
            if (j == 9)
                break;
            //9. sayfa
            page.selectTheDates.click();
            page.todaysDateLocator.click();
            page.todaysDateLocator.click();
            page.nextButton.click();
            if (j == 10)
                break;
        }while(true);
    }


    @Then("user able to see ozel Sartlar title is visible")
    public void user_able_to_see_ozel_Sartlar_title_is_visible() {
        System.out.println(page.page8OzelSartlrYazisi);
        Assert.assertTrue(page.page8OzelSartlrYazisi.isDisplayed());
    }

    @Then("user see Evinize ait ozel sartlari belirtiniz title is visible")
    public void user_see_Evinize_ait_ozel_sartlari_belirtiniz_title_is_visible() {

        System.out.println(page.pageInfoText);
        Assert.assertTrue(page.pageInfoText.isDisplayed());
    }

    @Then("user see all option titles are visible")
    public void user_see_all_option_titles_are_visible() {
        // BrowserUtils.waitFor(2);
        Assert.assertTrue(page.page8Cocuklarinizgetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8Evcilhayvanlarigetirebilirsiniz.isDisplayed());
        Assert.assertTrue(page.page8EvdeSigaraIcmeyeIzinVerilir.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilir.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvan.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitki.isDisplayed());

    }

    @Then("user see all choises are visible and clickable")
    public void user_see_all_choises_are_visible_and_clickable() {
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
        //#4
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirEVET.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirEVET.isEnabled());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirHAYIR.isDisplayed());
        Assert.assertTrue(page.page8ArabaDegisimiOlabilirHAYIR.isEnabled());
        //#5
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanEVET.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanEVET.isEnabled());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanHAYIR.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekEvcilHayvanHAYIR.isEnabled());
        //#6
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiEVET.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiEVET.isEnabled());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiHAYIR.isDisplayed());
        Assert.assertTrue(page.page8BakilmasiGerekenBitkiHAYIR.isEnabled());


    }

    @Then("user see current page eight is visible")
    public void user_see_current_page_eight_is_visible() {
        Assert.assertTrue(page.theNumberOfPage.isDisplayed());
    }


}
