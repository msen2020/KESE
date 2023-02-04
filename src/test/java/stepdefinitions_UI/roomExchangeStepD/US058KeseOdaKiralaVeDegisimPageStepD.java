package stepdefinitions_UI.roomExchangeStepD;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class US058KeseOdaKiralaVeDegisimPageStepD {

//    @FindBy(xpath = "((//div[@class='form-check mt-3'])")
//    public WebElement odamiKirayaVermekIstiyorumButton;
//
//    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
//    public WebElement odaDegisimiYapmakIstiyorumButton;

    /**
     * yukaridaki locaterlari kullanmaya calisinca nullpointexception hatasi
     * verdi o yuzden asagidaki gibi direk method icinde locate etmek zorunda kaldim
     */


    @And("user clicks {string} button")
    public void userClicksButton(String text) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//*[contains(text(),'"+text+"')]/../input")).click();
//        Driver.get().findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//        Driver.get().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();   bu locatorlarin yerine yukaridakini yazdim. text ile buluyor tek locator.

    }
}
