package stepdefinitions_UI.populerIlanStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US008_PopulerIlanStepD {

EvDegisimiPage page = new EvDegisimiPage();

    @Given("the user navigates to {string} page")
    public void theUserNavigatesToPage(String url) {
        Driver.get().get(url);

    }

    @And("Able to see Ev Degisimi section")
    public void ableToSeeEvDegisimiSection() {
        page.evDegisimiButton.isDisplayed();
    }

    @Then("Check if all the posts pictures are visible under the Ev Degisimi section")
    public void checkIfAllThePostsPicturesAreVisibleUnderTheEvDegisimiSection() {
        Assert.assertTrue(page.evDegisimiFirstPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiSecondPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiThirdPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiThirdPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiForthPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiFifthPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiSixthPic.isDisplayed());
        Assert.assertTrue(page.evDegisimiSeventhPic.isDisplayed());


    }

    @Then("Check if all the house types are visible under the Ev Degisimi section")
    public void checkIfAllTheHouseTypesAreVisibleUnderTheEvDegisimiSection() {
        Assert.assertTrue(page.evDegisimiFirstHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiSecondHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiThirdHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiForthHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiFifthHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiSixthHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiSeventhHouseType.isDisplayed());
        Assert.assertTrue(page.evDegisimiEightHouseType.isDisplayed());

    }

    @Then("Check if all the posts owners' names are visible under the Ev Degisimi section")
    public void checkIfAllThePostsOwnersNamesAreVisibleUnderTheEvDegisimiSection() {
        Assert.assertTrue(page.evDegisimiFirstOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiSecondOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiThirdOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiForthOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiFifthOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiSixthOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiSeventhOwnerName.isDisplayed());
        Assert.assertTrue(page.evDegisimiEighthOwnerName.isDisplayed());

    }

    @Then("Check if all the posts title are visible under the Ev Degisimi section")
    public void checkIfAllThePostsTitleAreVisibleUnderTheEvDegisimiSection() {
        Assert.assertTrue(page.evDegisimiFirstPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiSecondPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiThirdPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiForthPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiFifthPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiSixthPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiSeventhPicTitle.isDisplayed());
        Assert.assertTrue(page.evDegisimiEighthPicTitle.isDisplayed());

    }

    @Given("Able to see Oda Kirala section.")
    public void ableToSeeOdaKiralaSection() {
        Assert.assertTrue(page.odaKiralaButton.isDisplayed());

    }

    @And("Click Oda Kiralama button")
    public void clickOdaKiralamaButton() {
        BrowserUtils.waitForPageToLoad(3);
        page.odaKiralaButton.click();
    }

    @Then("Check if all the posts pictures are visible under the Oda Kiralama section")
    public void checkIfAllThePostsPicturesAreVisibleUnderTheOdaKiralamaSection() {
        Assert.assertTrue(page.odaKiralamaFirstPic.isDisplayed());
        Assert.assertTrue(page.odaKiralamaSecondPic.isDisplayed());
        Assert.assertTrue(page.odaKiralamaThirdPic.isDisplayed());
    }

    @Then("Check if all the posts' house types are visible under the Oda Kiralama section")
    public void checkIfAllThePostsHouseTypesAreVisibleUnderTheOdaKiralamaSection() {
        Assert.assertTrue(page.odaKiralamaFirstHouseType.isDisplayed());
        Assert.assertTrue(page.odaKiralamaSecondHouseType.isDisplayed());
        Assert.assertTrue(page.odaKiralamaThirdHouseType.isDisplayed());

    }

    @Then("Check if all the posts owners names are visible under the Oda Kiralama section")
    public void checkIfAllThePostsOwnersNamesAreVisibleUnderTheOdaKiralamaSection() {
        Assert.assertTrue(page.odaKiralamaFirstOwnerName.isDisplayed());
        Assert.assertTrue(page.odaKiralamaSecondOwnerName.isDisplayed());
        Assert.assertTrue(page.odaKiralamaThirdOwnerName.isDisplayed());

    }

    @Then("Check if all the posts' titles are visible under the Oda Kiralama section")
    public void checkIfAllThePostsTitlesAreVisibleUnderTheOdaKiralamaSection() {
        Assert.assertTrue(page.odaKiralamaFirstPicTitle.isDisplayed());
        Assert.assertTrue(page.odaKiralamaSecondPicTitle.isDisplayed());
        Assert.assertTrue(page.odaKiralamaThirdPicTitle.isDisplayed());

    }

    @Given("Able to see Bed & Breakfast section")
    public void ableToSeeBedBreakfastSection() {
        Assert.assertTrue(page.bedAndBreakfastButton.isDisplayed());

    }

    @And("Click Bed & Breakfast button")
    public void clickBedBreakfastButton() {
        page.bedAndBreakfastButton.click();

    }

    @Then("Check if all the posts' pictures are visible under the Bed & Breakfast section")
    public void checkIfAllThePostsPicturesAreVisibleUnderTheBedBreakfastSection() {
        Assert.assertTrue(page.bedAndBreakfastFirstPic.isDisplayed());
        Assert.assertTrue(page.bedAndBreakfastSecondPic.isDisplayed());
    }

    @Then("Check if all the posts' house types are visible under the Bed & Breakfast section")
    public void checkIfAllThePostsHouseTypesAreVisibleUnderTheBedBreakfastSection() {
        Assert.assertTrue(page.bedAndBreakfastFirstHouseType.isDisplayed());
        Assert.assertTrue(page.bedAndBreakfastSecondHouseType.isDisplayed());

    }

    @Then("Check if all the ads' titles are visible under the Bed & Breakfast section")
    public void checkIfAllTheAdsTitlesAreVisibleUnderTheBedBreakfastSection() {
        Assert.assertTrue(page.bedAndBreakfastFirstPicTitle.isDisplayed());
        Assert.assertTrue(page.bedAndBreakfastSecondPicTitle.isDisplayed());

    }

    @Then("Check if all the posts owners names are visible under the Bed & Breakfast section")
    public void checkIfAllThePostsOwnersNamesAreVisibleUnderTheBedBreakfastSection() {
        Assert.assertTrue(page.bedAndBrekfastFirstOwnerName.isDisplayed());
        Assert.assertTrue(page.bedAndBrekfastSecondOwnerName.isDisplayed());

    }


}

