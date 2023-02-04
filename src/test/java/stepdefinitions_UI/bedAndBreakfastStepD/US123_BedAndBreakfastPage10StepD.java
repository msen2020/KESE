package stepdefinitions_UI.bedAndBreakfastStepD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UI.BedAndBreakfastPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class US123_BedAndBreakfastPage10StepD {

    BedAndBreakfastPage page = new BedAndBreakfastPage();

    @Given("on BAB user should be able to click on {string} button after adding the images.")
    public void onBABuserShouldBeAbleToClickOnButtonAfterAddingTheImages(String textRemove) {
        onBABvalidateUserAddedTheImageOnInsertionInputAfterTheOtherOneMustBeAbleToInsertion();
        Assert.assertTrue(page.isDisplayedButton(textRemove));
        Assert.assertTrue(page.isEnabledButton(textRemove));
    }

    @Then("on BAB validate to remove all added images.")
    public void onBABvalidateToRemoveAllAddedImages() {
        page.page10RemoveAllPicturesButton.click();
        for (int i = 1; i <= 4; i++) {
            Assert.assertFalse((Driver.get().findElement(By.id("file-upload" + i)).isDisplayed()));
        }
    }

    @Given("on BAB user should be able to clicks on insertion input and  the others must be disabled.")
    public void onBABuserShouldBeAbleToClicksOnInsertionInputAndTheOthersMustBeDisabled() {
        WebElement pictureLocator;
        for (int i = 1; i <= 4; i++) {
            BrowserUtils.waitFor(1);
            pictureLocator = Driver.get().findElement(By.id("file-upload" + i));
            if (i == 1) {
                Assert.assertFalse(pictureLocator.isDisplayed());
                Assert.assertTrue(pictureLocator.isEnabled());
            } else {
                Assert.assertFalse(pictureLocator.isDisplayed());
                Assert.assertFalse(pictureLocator.isEnabled());
            }
        }
    }


    @And("on BAB validate user added the image on insertion input after the other one must be able to insertion.")
    public void onBABvalidateUserAddedTheImageOnInsertionInputAfterTheOtherOneMustBeAbleToInsertion() {
        WebElement pictureLocator;
        for (int i = 1; i <= 9; i++) {
            BrowserUtils.waitFor(1);
            pictureLocator = Driver.get().findElement(By.id("file-upload" + i));
            pictureLocator.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_" + (i % 5 + 1) + ".jpg");
            Assert.assertFalse((Driver.get().findElement(By.id("file-upload" + (i + 1))).isDisplayed()));
            Assert.assertTrue((Driver.get().findElement(By.id("file-upload" + (i + 1))).isEnabled()));
        }
    }
}
