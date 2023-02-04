package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.LoginPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static java.awt.event.KeyEvent.VK_ENTER;

public class US076OdaKiralaPageStepD extends LoginPage {

    EvDegisimiPage homePage = new EvDegisimiPage();
    OdaKiralaPage roomPage = new OdaKiralaPage();

    @And("user navigates to page {int} in Room Exchange Page")
    public void userNavigatesToPageInRoomExchangePage(int sayfa) throws AWTException {
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                throw new IllegalArgumentException("Not valid page number :" + sayfa);
            }
            // Here you are in Main page
            homePage.dropdownMenuButton.click();
            roomPage.dropDownOda.click();
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitFor(1);
            roomPage.page1RoomMustakilEv.click();
            roomPage.page1RoomKiraBox.click();
            homePage.ilerleButton.click();
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            homePage.selectText.click();
            homePage.selectTextButton.sendKeys("Sevilla, İspanya");
            BrowserUtils.waitFor(1);
            Robot robot = new Robot();
            robot.keyPress(VK_ENTER);
            BrowserUtils.waitFor(1);
            roomPage.step2_CheckBox.click();
            BrowserUtils.waitFor(2);
            homePage.nextButton.click();
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            roomPage.page3KullanimAlaniInput.sendKeys("90");
            for (WebElement e : roomPage.step3_incrementButtons){
                e.click();
            }
            homePage.nextButton.click();
            if (sayfa == 4)
                break;
            // Here you are in 4th page
            BrowserUtils.waitFor(1);
            roomPage.page4AgeFarketmez.click();
            roomPage.page4GenderFarketmez.click();
            roomPage.page4KisiSayisiPlus.click();
            homePage.ilerleButton.click();
            if (sayfa == 5)
                break;
            // Here you are in 5th page
            BrowserUtils.waitFor(1);
            homePage.tvText.click();
            roomPage.page5TV.click();
            roomPage.page5WIFI.click();
            roomPage.page5BulasikMakinesi.click();
            roomPage.page5Klima.click();
            roomPage.page5Mikrodalga.click();
            homePage.ilerleButton.click();
            if (sayfa == 6)
                break;
            // Here you are in 6th page
            BrowserUtils.waitFor(1);
            roomPage.page6roomExplanation.sendKeys("The room is fully furnished and has a Cable TV");
            homePage.nextButton.click();
            if (sayfa == 7)
                break;
            // Here you are in 7th page
            BrowserUtils.waitFor(1);
            roomPage.page7Plaj.click();
            roomPage.page7CamiiDernek.click();
            roomPage.page7HelalRestorant.click();
            homePage.museumText.click();
            homePage.nextButton.click();
            if (sayfa == 8)
                break;
            // Here you are in 8th page
            for (WebElement element : homePage.yesTexts) {
                element.click();
                BrowserUtils.waitFor(1 / 2);
            }
            homePage.nextButton.click();
            if (sayfa == 9)
                break;
            // Here you are in 9th page
            BrowserUtils.waitFor(1);
            roomPage.page9InputCalenderBox.click();
            homePage.todaysDateLocator.click();
            BrowserUtils.waitFor(1 / 2);
            homePage.todaysDateLocator.click();
            homePage.nextButton.click();
            break;
            // Here you are in 10th page
        }

    }

    @Then("user verifies that there is a {string} Page Step Number visible on the new room_step ten page")
    public void userVerifiesThatThereIsAPageStepNumberVisibleOnTheNewRoom_stepTenPage(String pageStepNumber) {

        Assert.assertTrue(roomPage.page10locationStepTextBox.isDisplayed());
        System.out.println(roomPage.page10locationStepTextBox);
    }

    @Then("user verifies that the title {string} is visible on the new_room step ten page")
    public void userVerifiesThatTheTitleShouldBeVisibleOnTheNew_roomStepTenPage(String title) {
        Assert.assertTrue(roomPage.page10TitleName.isDisplayed());
        //System.out.println(roomPage.page10TitleName);

    }

    @Then("user verifies that {string} is visible on the new room_step ten page")
    public void userVerifiesThatShouldBeVisibleOnTheNewRoom_stepTenPage(String description) {

        Assert.assertTrue(roomPage.page10Resim_ve_FotograflarAciklama.isDisplayed());
        //System.out.println(roomPage.page10Resim_ve_FotograflarAciklama.getText());
    }

    @Then("user verifies that Resimleri Secin button is active and functional on the new room_step ten page")
    public void userVerifiesThatResimleriSecinButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(roomPage.page10ResimleriSecinButton.isDisplayed());
        Assert.assertTrue(roomPage.page10ResimleriSecinButton.isEnabled());
    }

    @Then("user verifies that Tum Resimleri Kaldir button is active and functional on the new room_step ten page")
    public void userVerifiesThatTumResimleriKaldirButtonIsActiveAndFunctionalOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(roomPage.page10RemoveAllPicturesButton.isDisplayed());
        Assert.assertTrue(roomPage.page10RemoveAllPicturesButton.isEnabled());

    }

    @Then("user verifies that the description of the maximum loading pictures are visible on the new room_step ten page")
    public void userVerifiesThatTheDescriptionOfTheMaximumLoadingPicturesShouldBeVisibleOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(OdaKiralaPage.page10enAzBesEnFazlaOnResimAciklamasi());

    }


}
