package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US079_OdailanVerPage10StepD  {

    OdaKiralaPage page = new OdaKiralaPage();
    EvDegisimiPage page1 = new EvDegisimiPage();

    @Given("user should be able to click on {string} button after adding the images.")
    public void userShouldBeAbleToClickOnButtonAfterAddingTheImages(String textRemove) {
        validateUserAddedTheImageOnInsertionInputAfterTheOtherOneMustBeAbleToInsertion();
        Assert.assertTrue(page.isDisplayedButton(textRemove));
        Assert.assertTrue(page.isEnabledButton(textRemove));

    }

    @Then("validate to remove all added images.")
    public void validateToRemoveAllAddedImages() {
        page.page10RemoveAllPicturesButton.click();
        for (int i = 1; i <= 4; i++) {
        Assert.assertFalse((Driver.get().findElement(By.id("file-upload" + i)).isDisplayed()));
       }

   }

    @Given("user should be able to clicks on insertion input and  the others must be disabled.")
    public void userShouldBeAbleToClicksOnInsertionInputAndTheOthersMustBeDisabled() {
        WebElement pictureLocator;
        for (int i = 1; i <=4; i++) {
            BrowserUtils.waitFor(1);
            pictureLocator = Driver.get().findElement(By.id("file-upload" + i));
            if(i==1) {
                Assert.assertFalse(pictureLocator.isDisplayed());
                Assert.assertTrue(pictureLocator.isEnabled());
            }else{
                Assert.assertFalse(pictureLocator.isDisplayed());
                Assert.assertFalse(pictureLocator.isEnabled());
            }
        }
    }


    @And("validate user added the image on insertion input after the other one must be able to insertion.")
    public void validateUserAddedTheImageOnInsertionInputAfterTheOtherOneMustBeAbleToInsertion() {
        WebElement pictureLocator;
        for (int i = 1; i <=9; i++) {
            BrowserUtils.waitFor(1);
            pictureLocator = Driver.get().findElement(By.id("file-upload" + i));
            pictureLocator.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_" + (i % 5 + 1) + ".jpg");
            Assert.assertFalse((Driver.get().findElement(By.id("file-upload" + (i+1))).isDisplayed()));
            Assert.assertTrue((Driver.get().findElement(By.id("file-upload" + (i+1))).isEnabled()));

        }

    }



}

