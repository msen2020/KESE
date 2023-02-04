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

import java.awt.*;
import java.awt.event.KeyEvent;

public class US078_OdailanVerPage10StepD {
    OdaKiralaPage page1 = new OdaKiralaPage();
    EvDegisimiPage page = new EvDegisimiPage();

    @And("user should click to Ilan Ver go to page {int} in Oda")
    public void userShouldClickToIlanVerGoToPageInOda(int sayfa) throws AWTException {
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
            BrowserUtils.waitFor(2);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            BrowserUtils.waitFor(1);
            page1.step2_CheckBox.click();
            page.ilerleButton.click();
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
    @And("user should be able to attach {int} images with Resim Ekle")
    public void userShouldBeAbleToAttachImagesWithResimEkle(int numOfPicture) {
        WebElement step10_FileUpload;
        for(int i=1;i<=numOfPicture;i++) { // it must be five pictures in pictures folder
            try {
                BrowserUtils.waitFor(1);
                step10_FileUpload = Driver.get().findElement(By.id("file-upload" + i));
                step10_FileUpload.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_" + (i % 5 + 1) + ".jpg");
            }catch(Exception e) {
            }
            }
    }

    @Given("user should be able to attach {int} images with Resimleri Secin button")
    public void userShouldBeAbleToAttachImagesWithResimleriSecinButton(int numOfPicture) {
        WebElement pictureLocator;
        for (int i = 1; i <= numOfPicture; i++) {
            try {
                BrowserUtils.waitFor(1);
                pictureLocator = Driver.get().findElement(By.id("file-upload" + i));
                page1.page10ResimleriSecinButton.click();
                pictureLocator.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_" + (i % 5 + 1) + ".jpg");
            } catch (Exception e) {
                page1.page10RemoveAllPicturesButton.click();
            }
        }
    }

    @Then("verify the {int} added images")
    public void verifyTheAddedImages(int numOfPicture) {
        WebElement addedPictureLocator;

        for (int i = 1; i <= numOfPicture; i++) {
          try {
                addedPictureLocator = Driver.get().findElement(By.xpath("(//div[@class = 'rounded '])[" + i + "]"));
                if (numOfPicture < 11) {
                    Assert.assertTrue(addedPictureLocator.isDisplayed());
                    System.out.println(addedPictureLocator.isEnabled());

                } else {
//                    System.out.println(addedPictureLocator.isEnabled());
//                    System.out.println(addedPictureLocator.isDisplayed());
//                    Assert.assertFalse(addedPictureLocator.isDisplayed());
                    Assert.assertFalse((Driver.get().findElement(By.id("file-upload" + i)).isDisplayed()));

                }
            } catch(Exception e) {
         }
        }
    }
//       Assert.assertTrue(page1.step10_FileUploaded1.isDisplayed());
//        Assert.assertTrue(page1.step10_FileUploaded2.isDisplayed());
//        Assert.assertTrue(page1.step10_FileUploaded3.isDisplayed());
//        Assert.assertTrue(page1.step10_FileUploaded4.isDisplayed());
//        Assert.assertTrue(page1.step10_FileUploaded5.isDisplayed());

    @Then("verify should not be able yo add {int} images")
    public void verifyShouldNotBeAbleYoAddImages(int numOfPicture) {

        verifyTheAddedImages(numOfPicture);
    }



    @Given("After adding {int} or more images, the {string} button should be clickable")
    public void afterAddingOrMoreImagesTheButtonShouldBeClickable(int numOfPicture, String text) {
        userShouldBeAbleToAttachImagesWithResimEkle(numOfPicture);
        verifyTheButton(text);

    }

    @And("user adding {int} images, the {string} button should not be clickable")
    public void userAddingImagesTheButtonShouldNotBeClickable(int numOfPicture, String text) {
        userShouldBeAbleToAttachImagesWithResimEkle(numOfPicture);
       // System.out.println(page1.isDisplayedButton(text));
      //  System.out.println(!page1.isEnabledButton(text));
        Assert.assertTrue(page1.isDisplayedButton(text));
        Assert.assertFalse(!page1.isEnabledButton(text));

    }

    @Then("verify the {string} button")
    public void verifyTheButton(String text) {
      Assert.assertTrue(page1.isDisplayedButton(text));
      Assert.assertTrue(page1.isEnabledButton(text));

    }

    @Given("user should not be able to attach {int} images with Resimleri Secin button")
    public void userShouldNotBeAbleToAttachImagesWithResimleriSecinButton(int numOfPicture) {
        userShouldBeAbleToAttachImagesWithResimleriSecinButton(numOfPicture);
    }

    @And("user should not be able to attach {int} images with Resim Ekle")
    public void userShouldNotBeAbleToAttachImagesWithResimEkle(int numOfPicture) {
        userShouldBeAbleToAttachImagesWithResimEkle(numOfPicture);
    }




//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload1.sendKeys( System.getProperty("user.dir") + "/src/test/resources/pictures/Room_1.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload2.sendKeys( System.getProperty("user.dir") + "/src/test/resources/pictures/Room_2.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload3.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_3.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload4.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_4.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload5.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/Room_5.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload6.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/1.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload7.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/2.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload8.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload9.sendKeys( System.getProperty("user.dir") + "/src/test/resources/pictures/3.jpg");
//        page1.page10ResimleriSecinButton.click();
//        page.step10_FileUpload10.sendKeys(System.getProperty("user.dir") + "/src/test/resources/pictures/5.jpg");




}


