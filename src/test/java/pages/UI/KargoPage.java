package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KargoPage extends CommonPage {

    @FindBy(xpath = "//*[contains(text(),'İlerle')]")
    public WebElement ilerleButton;

    // 1st page
    @FindBy(xpath = "//*[contains(text(),'Zarf')]")
    public WebElement step1_Zarf;

    // 2nd page
    @FindBy(xpath = "(//*[contains(text(),'Select...')])[1]")
    public WebElement page2_BaslangicNoktasiInput;

    @FindBy(id = "react-select-2-input")
    public WebElement step2_selectText1Input;//

    @FindBy(xpath = "(//*[contains(text(),'Select...')])[1]")
    public WebElement page2_BitisNoktasiInput;

    @FindBy(id = "react-select-3-input")
    public WebElement step2_selectText2Input;

    @FindBy(xpath = "(//*[contains(text(),'Select...')])[3]")
    public WebElement page2_GecisNoktalariInput;

    @FindBy(id = "react-select-4-input")
    public WebElement step2_selectText3Input;

    @FindBy(xpath = "//*[contains(text(),'Lütfen başlangıç ve')]")
    public WebElement page2_warningText;


    // 3rd page
    @FindBy(id = "car")
    public WebElement step3_kargoBilgileriTextBox;

    @FindBy(xpath = "//small[@class='ps-2']")
    public WebElement missingInfoWarningText;

    //   msen step 4/4
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page4NumberOfTheStep;

    @FindBy(xpath = "//*[contains(text(),'Kargo Tarihi ve Zamanı')]")
    public WebElement page4Title_KargoTarihiVeZamani;

    @FindBy(xpath = "//*[contains(text(),'Kargoyu taşıyabileceğiniz tarihi')]")
    public WebElement page4_KargoTarihiVeZamaniAciklamasi;

    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[1]")
    public WebElement page4TarihSec1;

    @FindBy(css = "[class~=react-datepicker__day--today]")
    public WebElement page4_todayDateButton;

    @FindBy(css = " [class~=react-datepicker__day--003]")
    public WebElement page4_Day3Button;

    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[3]/input")
    public WebElement page4_SeyehatBaslangicSaatineTikla;

    @FindBy(xpath = "//*[contains(text(),'12:00 PM')]")
    public WebElement page4_SeyehatBaslangicSaati;

    @FindBy(xpath = "//*[contains(text(),'Bilgileri Kaydet')]")
    public WebElement page4_BilgileriKaydetButton;


}
