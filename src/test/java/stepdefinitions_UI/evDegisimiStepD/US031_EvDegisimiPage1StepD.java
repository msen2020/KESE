package stepdefinitions_UI.evDegisimiStepD;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.UI.EvDegisimiPage;
import utilities.Driver;

public class US031_EvDegisimiPage1StepD {

    EvDegisimiPage page = new EvDegisimiPage();


    @Given("user should see the Ev Tipi")
    public void userShouldSeeTheEvTipi() {
        page.page1EvTipiTitle.isDisplayed();
    }


    @Given("user asserts {string} is visible and clicable")
    public void userAssertsIsVisibleAndClicable(String evturu) {

        WebElement mustakilEv=  Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[1]"));
        WebElement apartman=  Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[2]"));
        WebElement studyo=  Driver.get().findElement(By.xpath("(//div[@class='border py-3 rounded false'])[3]"));

        if(evturu.equals("Mustakil Ev")){
            Assert.assertTrue(mustakilEv.isDisplayed());
            Assert.assertTrue(mustakilEv.isEnabled());
        } else if(evturu.equals("Apartaman Dairesi")){
            Assert.assertTrue(apartman.isDisplayed());
            Assert.assertTrue(apartman.isEnabled());
        }else{
            Assert.assertTrue(studyo.isDisplayed());
            Assert.assertTrue(studyo.isEnabled());
        }
    }

    @Given("user asserts {string} is visiblev")
    public void userAssertsIsVisiblev(String pagenumber) {
        boolean  pagenumber1=page.page1oneSlashTenWriting.isDisplayed();
        Assert.assertTrue(pagenumber1);
    }

    @Given("the user should see {string}")
    public void theUserShouldSee(String message) {
        String actual = page.page1HomeDegisimEvTuruWriting.getText();
        Assert.assertEquals(message, actual);
    }
}
