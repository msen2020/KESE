package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US054_HomeExchangePage10StepD {
    EvDegisimiPage page = new EvDegisimiPage();

    @And("user clicks Tüm Resimleri Kaldır button on the home change page")
    public void removeAllImages() {
        page.page10RemoveAllPicturesButton.click();
    }

    @Then("user asserts that all pictures are removed")
    public void userAssertsThatAllPicturesAreRemoved() {
        Assert.assertEquals(0, page.step10_loadedImages.size());
    }

    @Then("user asserts that first add picture frame is enabled and others are disabled")
    public void userAssertsThatFirstAddPictureFrameIsEnabledAndOthersAreDisabled() {
        int count = 0;
        for(WebElement frameElement:page.step10_imageFrames){
            if(!frameElement.getAttribute("class").contains("text-muted")){
                count++;
            }
        }
        Assert.assertEquals(1,count);
    }
}
