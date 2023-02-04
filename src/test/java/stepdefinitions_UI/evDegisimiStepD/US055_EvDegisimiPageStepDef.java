package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US055_EvDegisimiPageStepDef {

    EvDegisimiPage newHomePage = new EvDegisimiPage();

    @Given("user selects {string} as house type on the new home step one page")
    public void userselectsAsHouseTypeOnTheNewHomeStepOnePage(String tip) {
        if (tip.equalsIgnoreCase("Mustakil Ev")) {
            newHomePage.step1_MustakilEvOption.click();
        } else if (tip.equalsIgnoreCase("Apartman Dairesi")) {
            newHomePage.step1_ApartmanDairesiOption.click();
        } else { //Stüdyo Daire
            newHomePage.step1_StudyoDaireOption.click();
        }
    }

    @Then("user verifies the geri button is enabled")
    public void userVerifiesTheGeriButtonIsEnabled() {
        boolean isEnabled = newHomePage.geriButton.isEnabled();

        Assert.assertTrue(isEnabled);
    }

    @And("user clicks to the geri button")
    public void userClicksToTheGeriButton() {
        newHomePage.geriButton.click();
    }

    @Then("user verifies {string} is selected on the new home step one page")
    public void userVerifiesIsSelectedOnTheNewHomeStepOnePage(String tip) {
        if (tip.equalsIgnoreCase("Mustakil Ev")) {
            String classDegerleri = newHomePage.step1_MustakilEvOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        } else if (tip.equalsIgnoreCase("Apartman Dairesi")) {
            String classDegerleri = newHomePage.step1_ApartmanDairesiOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        } else { //Studyo Daire
            String classDegerleri = newHomePage.step1_StudyoDaireOption.getAttribute("class");
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }
    }

    @And("user types {string} to the ev otobus input on the new home step two page")
    public void userTypesToTheEvOtobusInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvOtobusInput.clear();
        newHomePage.step2_EvOtobusInput.sendKeys(mesafe);
    }

    @And("user types {string} to the ev tren input on the new home step two page")
    public void userTypesToTheEvTrenInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTrenInput.clear();
        newHomePage.step2_EvTrenInput.sendKeys(mesafe);
    }

    @And("user types {string} to the ev tramway input on the new home step two page")
    public void userTypesToTheEvTramwayInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTramwayInput.clear();
        newHomePage.step2_EvTramwayInput.sendKeys(mesafe);
    }

    @Then("user verifies the variable of ev otobus input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvOtobusInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvOtobusInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @Then("user verifies the variable of ev tren input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTrenInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTrenInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @Then("user verifies the variable of ev tramway input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTramwayInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTramwayInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @Then("user verifies the checkbox is checked on the new home step two page")
    public void userVerifiesTheCheckboxIsCheckedOnTheNewHomeStepTwoPage() {
        boolean isChecked = newHomePage.step2_CheckBox.isSelected();
        Assert.assertTrue(isChecked);
    }

    @Then("user verifies that the numbers are {int} {int} {int} {int} on the new home step three page")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepThreePage(int sayi1, int sayi2, int sayi3, int sayi4) {
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(0).getText(), sayi1 + "");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(1).getText(), sayi2 + "");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(2).getText(), sayi3 + "");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(3).getText(), sayi4 + "");
    }

    @Then("user verifies the value of usage area input is {string} on the new home step three page")
    public void userVerifiesTheValueOfUsageAreaInputIsOnTheNewHomeStepThreePage(String deger) {
        String value = newHomePage.step3_UsageAreaInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks on the increment buttons on the new home step four page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepFourPage() {
        for (WebElement e : newHomePage.step4_incrementButtons) {
            e.click();
        }
    }

    @Then("user verifies that the numbers are {int} {int} {int} {int} {int} {int} {int} {int} on the new home step four page")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepFourPage(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5, int sayi6, int sayi7, int sayi8) {
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(0).getText(), sayi1 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(1).getText(), sayi2 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(2).getText(), sayi3 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(3).getText(), sayi4 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(4).getText(), sayi5 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(5).getText(), sayi6 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(6).getText(), sayi7 + "");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(7).getText(), sayi8 + "");
    }

    @And("user clicks to the all options on the new home step five page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepFivePage() {
        for (WebElement e : newHomePage.step5_AllOptions) {
            e.click();
        }
    }

    @Then("user verifies the all options are selected on the new home step five page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepFivePage() {
        for (WebElement e : newHomePage.step5_AllOptions) {
            Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @Then("user verifies the value of description input is same with {string} on the new home step six page")
    public void userVerifiesTheValueOfDescriptionInputIsSameWithOnTheNewHomeStepSixPage(String deger) {
        String value = newHomePage.step6_DescInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks to the all options on the new home step seven page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepSevenPage() {
        for (WebElement e : newHomePage.step7_AllOptions) {
            e.click();
        }
    }

    @Then("user verifies the all options are selected on the new home step seven page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepSevenPage() {
        for (WebElement e : newHomePage.step7_AllOptions) {
            Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @Then("user verifies the all hayir options are selected on the new home step eight page")
    public void userVerifiesTheAllHayirOptionsAreSelectedOnTheNewHomeStepEightPage() {
        for (WebElement e : newHomePage.step8_HayirOptions) {
            Assert.assertTrue(e.getAttribute("class").contains("bg-warning"));
        }
    }

    @And("user clicks to the ilerle button on the new home page")
    public void userClicksToTheIlerleButtonOnTheNewHomePage() {
        newHomePage.ilerleButton.click();
    }

    @And("user selects {string} an address from the list in new home step two page")
    public void userChoosesAnAddressFromTheListInNewHomeStepTwoPage(String adres) {
        newHomePage.step2_AddressInput.sendKeys(adres); // Keys.ENTER

        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();

        // Bir webelementin içeriği, HTML olarak seleniumda nasıl görüntülenebilir ?
        /*String icerik = newHomePage.step2_AddressList.getAttribute("innerHTML");

        System.out.println(icerik);

        <div class=" css-11unzgr">
                <div class=" css-1n7v3ny-option" id="react-select-2-option-0" tabindex="-1">London, Birleşik Krallık</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-1" tabindex="-1">London, Ontario, Kanada</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-2" tabindex="-1">London, Kentucky, Amerika Birleşik Devletleri</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-3" tabindex="-1">London, Ohio, Amerika Birleşik Devletleri</div>
                <div class=" css-yt9ioa-option" id="react-select-2-option-4" tabindex="-1">Londonderry, Birleşik Krallık</div>
        </div>*/
    }

    @And("user clicks to the checkbox on the new home step two page")
    public void userClicksToTheCheckboxOnTheNewHomeStepTwoPage() {
        newHomePage.step2_CheckBox.click();
    }

    @And("user types usage area as {string} to the input on the new home step three page")
    public void userTypesUsageAreaAsToTheInputOnTheNewHomeStepThreePage(String sayi) {
        newHomePage.step3_UsageAreaInput.sendKeys(sayi);
    }

    @And("user clicks on the increment buttons on the new home step three page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepThreePage() {
        for (WebElement e : newHomePage.step3_incrementButtons) {
            e.click();
        }
    }

    @And("user types a description as {string} to the input on the new home step six page")
    public void userTypesADescriptionAsToTheInputOnTheNewHomeStepSixPage(String aciklama) {
        newHomePage.step6_DescInput.sendKeys(aciklama);
    }

    @And("user clicks to the all hayir options on the new home step eight page")
    public void userClicksToTheAllHayirOptionsOnTheNewHomeStepEightPage() {
        for (WebElement e : newHomePage.step8_HayirOptions) {
            e.click();
        }
    }

    @And("user selects the date on the new home step nine page")
    public void userChoosesTheDateOnTheNewHomeStepNinePage() {
        newHomePage.step9_FirstDatePickerInput.click();
        newHomePage.step9_TodayOption.click();
        BrowserUtils.waitFor(1);
        newHomePage.step9_TodayOption.click();
    }

    @Given("user goes to this {string} page")
    public void userGoesToThisPage(String arg0) {
        Driver.get().get(arg0);
    }

}
