package stepdefinitions_UI.roomExchangeStepD;

import com.kese.pages.UI.CommonPage;
import com.kese.pages.UI.LoginPage;
import com.kese.pages.UI.MainPage;
import com.kese.pages.UI.OdaKiralaPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class US080_OdaKiralaPageStepD extends CommonPage {

    MainPage page = new MainPage();
    LoginPage loginPage = new LoginPage();
    OdaKiralaPage odaKiralaPage = new OdaKiralaPage();

    @Given("user clicks ilan ver menu on signed in home page")
    public void userClicksMenuOnSignedInHomePage() {

        BrowserUtils.waitFor(1 / 2);
        page.ilanVerDropdownMenu.click();

    }

    @When("user clicks {string} in ilan ver menu")
    public void userClicksInIlanVerMenu(String ilanVerItem) {

        BrowserUtils.waitFor(1);
        loginPage.clickItemIlanVerDropdownMenu(ilanVerItem);
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String currentUrl) {
        Assert.assertEquals(Driver.get().getTitle(), currentUrl);
    }

    @When("user clicks to the ilerle button on oda kirala page")
    public void user_clicks_to_the_ilerle_button_on_oda_kirala_page() {

        odaKiralaPage.ilerleButton.click();

    }

    @Then("the geri button should be enabled")
    public void the_geri_button_should_be_enabled() {

        Assert.assertTrue(odaKiralaPage.geriButton.isEnabled());

    }

    @Then("step {int} should be displayed on oda kirala page")
    public void step_should_be_displayed_on_oda_kirala_page(Integer stepNo) {

        String actualStep = stepNo.toString() + " / 10";
        Assert.assertEquals(odaKiralaPage.theNumberOfPage.getText(), actualStep);

    }

    @When("user clicks to the geri button on oda kirala page")
    public void user_clicks_to_the_geri_button_on_oda_kirala_page() {

        BrowserUtils.waitFor(1);
        Assert.assertTrue(odaKiralaPage.geriButton.isEnabled());
        odaKiralaPage.geriButton.click();
        BrowserUtils.waitFor(1);

    }

    @Then("user clicks {string} option on on step one on oda kirala page")
    public void user_clicks_option_on_on_step_one_on_oda_kirala_page(String homeType) {

        odaKiralaPage.selectPage1HomeType(homeType);
    }

    @Then("{string} option should be selected on step one on oda kirala page")
    public void option_should_be_selected_on_step_one_on_oda_kirala_page(String homeType) {

        //Assert.assertEquals(homeType,odaKiralaPage.page1RoomMustakilEv.getAttribute("class")).contains("border-warning"));
        Assert.assertEquals(homeType, odaKiralaPage.getPage1SelectedHomeType());
    }

    @Given("user clicks {string} checkbox on step one on oda kirala page")
    public void user_clicks_checkbox_on_step_one_on_oda_kirala_page(String checkboxString) {

        odaKiralaPage.clickRoomTypePage1(checkboxString);

    }

    @Then("{string} checkbox should be clicked on step one on oda kirala page")
    public void checkbox_should_be_clicked_on_step_one_oda_kirala_page(String selectedRentOption) {

        Assert.assertTrue(odaKiralaPage.isPage1SelectedRoomType(selectedRentOption));

    }

    @Then("user enters {string} to address input on step two on oda kirala page")
    public void user_enters_to_address_input_on_step_two_on_oda_kirala_page(String address) {

        odaKiralaPage.page2SelectAdressInbox.sendKeys(address + Keys.ENTER);
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();

    }

    @Then("user enters ulasim olanaklari from home on step two on oda kirala page")
    public void user_enters_ulasim_olanaklari_from_home_on_step_two_on_oda_kirala_page(Map<String, String> transportationOpportunities) {

        odaKiralaPage.setPage2TransportationDistances(transportationOpportunities);

    }

    @Then("below ulasim olanaklari should be displayed on step two on oda kirala page")
    public void below_ulasim_olanaklari_should_be_displayed_on_step_two_on_oda_kirala_page(Map<String, String> transportationOpportunities) {

        for (Map.Entry<String, String> opportunity : transportationOpportunities.entrySet()) {
            Assert.assertEquals(opportunity.getValue(), odaKiralaPage.getpage2TransportationOpportunity(opportunity.getKey()));
        }

    }

    @Then("user enters {double} km to {string} input on step two in oda kirala page")
    public void user_enters_km_to_input_on_step_two_in_oda_kirala_page(Double distance, String location) {

        odaKiralaPage.setPage2DistanceFromHome(distance, location);

    }

    @Then("user clicks sahsi arac ulasim box on oda kirala page")
    public void user_clicks_sahsi_arac_ulasim_box_on_oda_kirala_page() {

        odaKiralaPage.page2SahsiAracCheckbox.click();

    }

    @Then("{double} should be displayed in to {string} input in oda kirala page")
    public void should_be_displayed_in_to_input_in_oda_kirala_page(Double distance, String location) {

        Assert.assertEquals(distance, odaKiralaPage.getPage2DistanceFromHome(location));

    }

    @Then("sahsi arac ulasim box should be clicked on step two on oda kirala page")
    public void sahsi_arac_ulasim_box_should_be_clickedon_step_two_on_oda_kirala_page() {

        Assert.assertTrue(odaKiralaPage.page2SahsiAracCheckbox.isSelected());

    }

    @Then("{string} should be displayed as sectiginiz adres on step two on oda kirala page")
    public void should_be_displayed_as_sectiginiz_adres_on_step_two_on_oda_kirala_page(String homeLocation) {

        Assert.assertEquals(homeLocation, odaKiralaPage.page2SectinizAdresTextValue.getAttribute("outerText"));

    }

    @Then("user enters {string} to ev kullanim alani on oda kirala page")
    public void user_enters_to_ev_kullanim_alani_on_oda_kirala_page(String roominess) {

        BrowserUtils.waitFor(1);
        odaKiralaPage.page3KullanimAlaniInput.clear();
        odaKiralaPage.page3KullanimAlaniInput.sendKeys(roominess);

    }

    @Then("user defines below ortak kullanim alanlari on step three on oda kirala page")
    public void user_defines_below_ortak_kullanim_alanlari_on_step_three_on_oda_kirala_page(Map<String, String> commonAreas) {

        odaKiralaPage.setPage3CommonAreas(commonAreas);

    }

    @Then("below ortak kullanim alanlari should be displayed on step three on oda kirala page")
    public void below_ortak_kullanim_alanlari_should_be_displayed_on_step_three_on_oda_kirala_page(Map<String, String> commonAreas) {
        for (Map.Entry<String, String> condition : commonAreas.entrySet()) {
            Assert.assertEquals(condition.getValue(), odaKiralaPage.getPage3CommonArea(condition.getKey()));
        }
    }

    @Then("{string} should be displayed on ev kullanim alani step three on oda kirala page")
    public void should_be_displayed_on_ev_kullanim_alani_step_three_on_oda_kirala_page(String roominess) {

        Assert.assertEquals(roominess, odaKiralaPage.page3KullanimAlaniInput.getAttribute("value"));

    }

    @Then("user clicks below yas araligi options on step four on oda kirala page")
    public void user_clicks_below_yas_araligi_options_on_step_four_on_oda_kirala_page(List<String> ageOptions) {

        odaKiralaPage.clickPage4AgeOptions(ageOptions);

    }

    @Then("user clicks cinsiyet {string} option on step four on oda kirala page")
    public void user_clicks_cinsiyet_option_on_step_four_on_oda_kirala_page(String gender) {

        odaKiralaPage.clickPage4GenderOptions(gender);

    }

    @Then("user increments max kisi sayisi to {int} on step four on oda kirala page")
    public void user_increments_max_kisi_sayisi_to_on_step_four_on_oda_kirala_page(Integer maxPerson) {

        odaKiralaPage.setPage4MaxPerson(maxPerson);

    }

    @Then("below yas araligi options should be selected on step four on oda kirala page")
    public void below_yas_araligi_options_should_be_selected_on_step_four_on_oda_kirala_page(List<String> ageOptions) {

        for (String ageInterval : ageOptions) {
            Assert.assertEquals(ageInterval, odaKiralaPage.getPage4SelectedAge(ageInterval));
        }
    }

    @Then("cinsiyet {string} should be selected on step four on oda kirala page")
    public void cinsiyet_should_be_selected_on_step_four_on_oda_kirala_page(String gender) {

        Assert.assertEquals(gender, odaKiralaPage.getPage4SelectedGender(gender));

    }

    @Then("max kisi sayisi should be {int} on step four on oda kirala page")
    public void max_kisi_sayisi_should_be_on_step_four_on_oda_kirala_page(Integer maxPerson) {

        Assert.assertEquals(maxPerson.toString(), odaKiralaPage.page4MaxPersonInput.getText());

    }

    @Then("user selects below ev imkanlari options on step five on oda kirala page")
    public void user_selects_below_ev_imkanlari_options_on_step_five_on_oda_kirala_page(List<String> homeOpportunities) {

        odaKiralaPage.setPage5HomeOpportunities(homeOpportunities);

    }

    @Then("below ev imkanlari options should be selected on step five on oda kirala page")
    public void fbelow_ev_imkanlari_options_should_be_selected_on_step_five_on_oda_kirala_page(List<String> homeOpportunities) {
        for (String homeOpportunity : homeOpportunities) {
            Assert.assertEquals(homeOpportunity, odaKiralaPage.getPage5HomeOpportunity(homeOpportunity));
        }
    }

    @Then("user enters {string} to aciklamalar on step six on oda kirala page")
    public void user_enters_to_aciklamalar_on_step_six_on_oda_kirala_page(String description) {

        odaKiralaPage.page6AciklamaTextarea.clear();
        odaKiralaPage.page6AciklamaTextarea.sendKeys(description);

    }

    @Then("{string} message should be displayed on step six on oda kirala page")
    public void message_should_be_displayed_on_step_six_on_oda_kirala_page(String description) {

        Assert.assertEquals(description, odaKiralaPage.page6AciklamaTextarea.getText());

    }

    @Then("user selects below aktiviteler on step seven on oda kirala page")
    public void user_selects_below_aktiviteler_on_step_seven_on_oda_kirala_page(List<String> activities) {

        odaKiralaPage.setPage7Activities(activities);

    }

    @Then("below aktiviteler should be selected on step seven on oda kirala page")
    public void fbelow_aktiviteler_should_be_selected_on_step_seven_on_oda_kirala_page(List<String> activities) {

        for (String selectedActivity : activities) {
            Assert.assertEquals(selectedActivity, odaKiralaPage.getPage7Activity(selectedActivity));
        }
    }

    @When("user selects below ozel sartlar on step eight on oda kirala page")
    public void user_selects_below_ozel_sartlar_on_step_eight_on_oda_kirala_page(Map<String, String> specialConditions) {

        odaKiralaPage.setPage8SpecialConditions(specialConditions);

    }

    @Then("below ozel sartlar should be selected on step eight on oda kirala page")
    public void below_ozel_sartlar_should_be_selected_on_step_eight_on_oda_kirala_page(Map<String, String> selectedConditions) {
        // if returns true, it means it is selected
        for (Map.Entry<String, String> condition : selectedConditions.entrySet()) {
            Assert.assertTrue(odaKiralaPage.getPage8SpecialCondition(condition.getKey(), condition.getValue()));
        }
    }

    @Then("user enters degisim tarihleri on step nine on oda kirala page")
    public void user_enters_degisim_tarihleri_on_step_nine_on_oda_kirala_page() {

        BrowserUtils.waitFor(1);
        odaKiralaPage.setPage9RentingDates();

    }

    @Then("selected date should be displayed below sectiginiz tarihler on step nine on oda kirala page")
    public void selected_date_should_be_displayed_below_sectiginiz_tarihler_on_step_nine_on_oda_kirala_page() {

        BrowserUtils.waitFor(1);
        Assert.assertTrue(odaKiralaPage.page9BookedDate.isDisplayed());
        Assert.assertEquals(odaKiralaPage.page9BookedDateSummary.getText(), odaKiralaPage.getPage9BookedDate());

    }

    @Then("user uploads {int} pictures on step ten on oda kirala page")
    public void user_uploads_pictures_on_step_ten_on_oda_kirala_page(int pictureNumber) {
        if (pictureNumber < 5)
            Assert.assertTrue("Number of pictures are smaller than 5", false);
        else
            odaKiralaPage.uploadPage10Images(pictureNumber);

    }


    @Then("user clicks resimleri kaydet button on step ten on oda kirala page")
    public void user_clicks_resimleri_kaydet_button_on_step_ten_on_oda_kirala_page() {

        odaKiralaPage.page10SavePicturesButton.click();

    }

    @Then("{int} pictures should be uploaded on step ten on oda kirala page")
    public void pictures_should_be_uploaded_on_step_ten_on_oda_kirala_page(int totalNumberOfPictures) {

        Assert.assertEquals(totalNumberOfPictures, odaKiralaPage.page10UploadedImagesList.size());

    }

}
