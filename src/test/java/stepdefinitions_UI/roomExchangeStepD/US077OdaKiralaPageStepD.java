package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US077OdaKiralaPageStepD {

    EvDegisimiPage homePage = new EvDegisimiPage();
    OdaKiralaPage roomPage = new OdaKiralaPage();

    @Then("user verifies that the four image add buttons are visible as default on the new room_step ten page")
    public void userVerifiesThatTheFourPictureLoadingButtonsAreVisibleAsDefaultOnTheNewRoom_stepTenPage() {

        Assert.assertTrue(OdaKiralaPage.page10FirstResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsDisplayed());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsDisplayed());
    }

    @Then("user verifies that only the first image add buttons is clickable as default on the new room_step ten page")
    public void userVerifiesThatTheFirstPictureLoadingButtonsIsClickableAsDefaultOnTheNewRoom_stepTenPage() {
        Assert.assertFalse(OdaKiralaPage.page10FirstResimEkleIsEnabled());

    }

    @Then("user verifies that the rest of the image add buttons are disabled on the new room_step ten page")
    public void userVerifiesThatTheRestOfThePictureLoadingButtonsAreDisabledOnTheNewRoom_stepTenPage() {
        Assert.assertTrue(OdaKiralaPage.page10SecondResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10ThirdResimEkleIsEnabled());
        Assert.assertTrue(OdaKiralaPage.page10FourthResimEkleIsEnabled());
    }

    @When("user clicks and adds the first image button")
    public void userAddsTheFirstImage() {
        WebElement choseFile = Driver.get().findElement(By.id("file-upload1"));

        String projectPath = System.getProperty("user.dir");
        //this method will find where your project is located in your computer.

        //then we will add the relative file path which is after project location;
        String filePath = "src/test/resources/pictures/Room 6.jfif";

        //and finally we will concat those two and give as a absolute path to sendKeys method.
        String fullPath = projectPath+"/"+filePath;
        choseFile.sendKeys(fullPath);

    }
    @Then("user verifies that after adding the first image, the second Add image Button has become active and this should continue until the last picture on the new room_step ten page")
    public void userVerifiesThatAfterAddingTheFirstImageTheSecondAddImageButtonShouldBecomeActiveAndThisShouldContinueUntilTheLastPictureOnTheNewRoom_stepTenPage() {


    }


}
