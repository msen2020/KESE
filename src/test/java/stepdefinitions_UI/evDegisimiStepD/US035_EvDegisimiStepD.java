package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class US035_EvDegisimiStepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();




    @Then("The user sees the title {string}")
    public void the_user_sees_the_title(String string) {
        BrowserUtils.waitFor(5);


        Assert.assertTrue(evDegisimiPage.page3KullanimAlaniYazisi.isDisplayed());

    }


    @Then("The user sees description of {string}")
    public void the_user_sees_description_of(String string) {

        Assert.assertTrue(evDegisimiPage.page3EvinizinKullanimAlaniBelirtinizYazisi.isDisplayed());
    }

    @Then("The user clicks {string} button and enters the {string} of the house")
    public void the_user_clicks_button_and_enters_the_of_the_house(String string, String string2) {

        evDegisimiPage.page3KullanimAlaniInput.sendKeys("120");
    }

    @Then("The user can increase or decrease the numbers by clicking the bedroom bathroom toilet living room buttons")
    public void the_user_can_increase_or_decrease_the_numbers_by_clicking_the_bedroom_bathroom_toilet_living_room_buttons() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(evDegisimiPage.page3yatakodasiartibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3banyoartibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3tuvaletartibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3oturmaodasiartibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3yatakodasieksibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3banyoeksibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3tuvaleteksibutonu.isEnabled());
        Assert.assertTrue(evDegisimiPage.page3oturmaodasieksibutonu.isEnabled());


    }

    @And("User should able to click increment button fifteen times for Kullanilabilecek Alanlar")
    public void userShouldAbleToClickIncrementButtonFifteenTimesForKullanilabilecekAlanlar() {
        evDegisimiPage.incrementFifteenTimes();
    }



    @And("user verifies that the numbers are max {int} {int} {int} {int} on the new home page step three")
    public void userVerifiesThatTheNumbersAreMaxOnTheNewHomePageStepThree(int arg1, int arg2, int arg3, int arg4) {
        BrowserUtils.waitFor(5);



        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(0).getText(), arg1 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(1).getText(), arg2 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(2).getText(), arg3 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(3).getText(), arg4 + "");

    }

    /* @And("User Navigates To Page {int} In Home Exchanges")
      public void userNavigatesToPageInHomeExchanges(int arg0) {
       }
*/
    @And("The user can see the text ucboluon on the top of the page")
    public void theUserCanSeeTheTextUcboluonOnTheTopOfThePage () {

        Assert.assertTrue(evDegisimiPage.theNumberOfPage3.isDisplayed());
    }


}
