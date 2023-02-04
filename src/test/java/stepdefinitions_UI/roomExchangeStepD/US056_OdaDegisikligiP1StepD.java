package stepdefinitions_UI.roomExchangeStepD;


import com.kese.pages.UI.EvDegisimiPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US056_OdaDegisikligiP1StepD {

    EvDegisimiPage page = new EvDegisimiPage();


    @Then("{string} ve {string} checkboxes should be clickable")
    public void veCheckboxesShouldBeClickable(String kira, String degisim) {
        WebElement kiraBox = Driver.get().findElement(By.xpath("//input[@id='flexRadioDefault1']"));
        WebElement degisimBox = Driver.get().findElement(By.id("flexRadioDefault2"));

        degisimBox.click();
        Assert.assertTrue(degisimBox.isSelected());
        degisimBox.click();
        BrowserUtils.waitForClickability(kiraBox, 3).click();
        Assert.assertTrue(kiraBox.isSelected());

    }

    @Given("the user should see {string} writing")
    public void theUserShouldSeeWriting(String roomOption) {
        WebElement roomOptionWriting = Driver.get().findElement(By.xpath("//*[text()='Odanızla ilgili tercihinizi belirtiniz. Eğer sizin için uygunsa iki seçeneği de işaretleyebilirsiniz.']"));
        BrowserUtils.waitForVisibility(roomOptionWriting, 3).isDisplayed();
        String actual = roomOptionWriting.getText();
        System.out.println(actual);
        Assert.assertEquals(roomOption, actual);
    }

    @Given("user should see the writing {string}")
    public void userShouldSeeTheWriting(String odaTuru) {
        WebElement roomTypeWriting = Driver.get().findElement(By.xpath("//*[text()='Odanız hangi ev türünde yer alıyor, belirtiniz.']"));
        BrowserUtils.waitForVisibility(roomTypeWriting, 3).isDisplayed();
        String actual = roomTypeWriting.getText();
        System.out.println(actual);
        Assert.assertEquals(odaTuru, actual);
    }
}

