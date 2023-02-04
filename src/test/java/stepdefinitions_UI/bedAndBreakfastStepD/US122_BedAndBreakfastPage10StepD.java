package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US122_BedAndBreakfastPage10StepD {

    BedAndBreakfastPage page = new BedAndBreakfastPage();
    MainPage mainPage = new MainPage();

    @And("user navigates to page {int} in Bed & Breakfast")
    public void navigateToPageInBedBreakfast(int sayfa) {
        while(true){
            if( sayfa < 1 || sayfa > 10 ){
                Assert.fail("Not valid page number :"+sayfa);
            }
            // Here you are in Main page
            mainPage.ilanVerDropdownMenu.click();
            // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
            mainPage.bedAndBreakfastOption.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            page.step1_houseButton.click();
            page.ilerleButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            page.step2_selectText.click();
            page.step2_selectTextButton.sendKeys("Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            page.step2_selectTextButton.sendKeys(Keys.ENTER);
            BrowserUtils.waitFor(1);
            page.step2_checkBox.click();
            BrowserUtils.waitFor(2);
            page.ilerleButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            page.step3_sizeOfAreaUp.sendKeys("50");
            page.ilerleButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            page.page4Age1.click();
            page.page4GenderErkek.click();
            page.step4_plus.click();
            page.ilerleButton.click();
            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            page.step5_tvText.click();
            page.ilerleButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            page.page6inputBoxRoom.sendKeys("Large and spacious");
            page.step6_homeExplanation.sendKeys("My home, sweet home.");
            page.page6inputBoxBreakf.sendKeys("Cheese, bread, tea.");
            page.ilerleButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            page.step7_museumText.click();
            page.ilerleButton.click();
            if (sayfa == 8)
                break;
            // Here you are in 8th page
            for(WebElement element:page.step8_yesTexts){
                element.click();
                BrowserUtils.waitFor(1/2);
            }
            page.ilerleButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            page.step9_selectDate.click();
            page.step9_todaysLocator.click();
            BrowserUtils.waitFor(1/2);
            page.step9_todaysLocator.click();
            page.ilerleButton.click();
            break;
            // Here you are in 10th page
        }
    }
}
