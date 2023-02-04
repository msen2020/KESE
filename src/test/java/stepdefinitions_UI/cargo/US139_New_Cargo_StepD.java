package stepdefinitions_UI.cargo;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.UI.KargoPage;
import pages.UI.MainPage;
import utilities.BrowserUtils;

public class US139_New_Cargo_StepD {
    MainPage mainPage = new MainPage();
    KargoPage page = new KargoPage();

    @When("user navigates to page {int} in Kargo")
    public void navigateToPageInKargo(Integer sayfa) {
        while (true) {
            if (sayfa < 1 || sayfa > 4) {
                Assert.fail("Not valid page number :" + sayfa);
            }
            // Here you are in Main page
            BrowserUtils.waitAndClick(mainPage.ilanVerDropdownMenu);
            // Ana sayfada ki Ilan Ver menusu icinde ki Bed & Breakfast secenegi
            BrowserUtils.waitAndClick(mainPage.kargoOption);
            if (sayfa == 1)
                break;
            // Here you are in 1st page
            BrowserUtils.waitAndClick(page.step1_Zarf);
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 2)
                break;
            // Here you are in 2nd page
            BrowserUtils.waitAndClick(page.page2_BaslangicNoktasiInput);
            BrowserUtils.waitAndSendKeys(page.step2_selectText1Input, "Frankfurt, Almanya");
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.page2_BaslangicNoktasiInput, Keys.ENTER);
            BrowserUtils.waitAndClick(page.page2_BitisNoktasiInput);
            BrowserUtils.waitAndSendKeys(page.page2_BitisNoktasiInput, "Köln, Almanya");
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.page2_BitisNoktasiInput, Keys.ENTER);
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 3)
                break;
            // Here you are in 3rd page
            BrowserUtils.waitFor(1);
            BrowserUtils.waitAndSendKeys(page.step3_kargoBilgileriTextBox, "A simple envelope");
            BrowserUtils.waitAndClick(page.ilerleButton);
            if (sayfa == 4)
                break;
            // Here you are in 4th page
        }
    }

    @And("user verifies the {string} information is selectable.")
    public void userVerifiesTheInformationIsSelectable(String arg0) {
        page.page2_BaslangicNoktasiInput.click();
        page.step2_selectText1Input.sendKeys("Frankfurt, Almanya");
        BrowserUtils.waitFor(1);
        page.step2_selectText1Input.sendKeys(Keys.ENTER);
    }
}
