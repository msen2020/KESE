package stepdefinitions_UI.bedAndBreakfastStepD;


import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.UI.BedAndBreakfastPage;
import pages.UI.EvDegisimiPage;
import utilities.BrowserUtils;

public class US104_BedAndBreakfastStepD {


   EvDegisimiPage evDegisimiPage=new EvDegisimiPage();
    BedAndBreakfastPage bedAndBreakfastPage = new BedAndBreakfastPage();

    @And("users sees the title {string}")
    public void usersSeesTheTitle(String arg0) {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(bedAndBreakfastPage.page3KullanimAlaniYazisi.isDisplayed());
    }

    @And("users sees description of {string}")
    public void usersSeesDescriptionOf(String arg0) {
        Assert.assertTrue(bedAndBreakfastPage.page3OdanizinKullanimAlaniniBelirtinizYazisi.isDisplayed());
    }


    @And("users clicks {string} button and enters the {string} of the housee")
    public void usersClicksButtonAndEntersTheOfTheHousee(String arg0, String arg1) {
       bedAndBreakfastPage.page3KullanimAlaniInput.sendKeys("120");
    }

    @And("users can increase or decrease the numbers by clicking the bedroom bathroom toilet living room button")
    public void usersCanIncreaseOrDecreaseTheNumbersByClickingTheBedroomBathroomToiletLivingRoomButton() {

        BrowserUtils.waitFor(5);
        Assert.assertTrue( bedAndBreakfastPage.page3yatakodasiartibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3banyoartibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3tuvaletartibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3oturmaodasiartibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3yatakodasieksibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3banyoeksibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3tuvaleteksibutonu.isEnabled());
        Assert.assertTrue(bedAndBreakfastPage.page3oturmaodasieksibutonu.isEnabled());
    }

    @And("users should able to click increment button fifteen times for Kullanilabilecek Alanlara")
    public void usersShouldAbleToClickIncrementButtonFifteenTimesForKullanilabilecekAlanlara() {
       bedAndBreakfastPage.incrementFifteenTimes();
    }

    @And("users verifies that the numbers are max {int} {int} {int} {int} on the new home pages step three")
    public void usersVerifiesThatTheNumbersAreMaxOnTheNewHomePagesStepThree(int arg1, int arg2, int arg3, int arg4) {

        BrowserUtils.waitFor(5);
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(0).getText(), arg1 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(1).getText(), arg2 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(2).getText(), arg3 + "");
        Assert.assertEquals(evDegisimiPage.step3_AllNumbers.get(3).getText(), arg4 + "");
    }
/*
        @And("User Navigates To Page {int} In Home Exchanges")
        public void userNavigatesToPageInHomeExchanges(int arg0) {

        }
*/
    @And("users can see the text ucboluon on the top of the pages")
    public void usersCanSeeTheTextUcboluonOnTheTopOfThePages() {
        Assert.assertTrue(evDegisimiPage.theNumberOfPage3.isDisplayed());
    }
}








