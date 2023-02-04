package stepdefinitions_UI.cargo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.KargoPage;

public class US143_KargoPage4StepD {

    KargoPage page = new KargoPage();

    @Then("user verifies that the number of the page {string} is visible at step four on Kargo Page")
    public void userVerifiesThatTheNumberOfThePageIsVisibleAtStepFourOnKargoPage(String stepNumber) {
        Assert.assertTrue(page.page4NumberOfTheStep.isDisplayed());
    }

    @Then("user verifies that the title {string} is visible at step four on Kargo Page")
    public void userVerifiesThatTheTitleIsVisibleAtStepFourOnKargoPage(String titleOfThePage) {
        Assert.assertTrue(page.page4Title_KargoTarihiVeZamani.isDisplayed());
        System.out.println(titleOfThePage);
    }

    @Then("user verifies that he can see explanation message {string} should be displayed on kargo page")
    public void userVerifiesThatHeCanSeeExplanationMessageShouldBeDisplayedOnKargoPage(String explanationOfTheTitle) {
        Assert.assertTrue(page.page4_KargoTarihiVeZamaniAciklamasi.isDisplayed());
        System.out.println(explanationOfTheTitle);
    }

    @Then("user verifies that {string} input is enabled")
    public void userVerifiesThatInputIsEnabled(String date) {
        Assert.assertTrue(page.page4TarihSec1.isEnabled());
    }

    @When("user clicks date input at step four on kargo page")
    public void userClicksDateInputAtStepFourOnKargoPage() {
        page.page4TarihSec1.click();
    }

    @Then("user verifies that the Time window is opened at step four on kargo page")
    public void userVerifiesThatTheTimeWindowIsOpenedAtStepFourOnKargoPage() {
        Assert.assertTrue(page.page4TarihSec1.isEnabled());
        page.page4_todayDateButton.click();
        page.page4_Day3Button.click();
    }

    @And("user selects Times at step four on kargo page")
    public void userSelectsTimesAtStepFourOnKargoPage() {
       Assert.assertTrue(page.page4_SeyehatBaslangicSaatineTikla.isEnabled());
       page.page4_SeyehatBaslangicSaatineTikla.click();
       page.page4_SeyehatBaslangicSaati.click();
    }

    @And("user clicks Bilgileri Kaydet Button")
    public void userClicksBilgileriKaydetButton() {
        page.page4_BilgileriKaydetButton.click();
    }
}
