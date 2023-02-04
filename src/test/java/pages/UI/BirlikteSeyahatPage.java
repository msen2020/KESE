package pages.UI;

import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class BirlikteSeyahatPage extends CommonPage{

    //Common Locators

    @FindBy(xpath = "//button[text()='İlerle']")
    public WebElement ilerleButton;

    @FindBy(xpath = "//button[text()='Geri']")
    public WebElement geriButton;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement pageTitleText;

    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[1]")
    public WebElement pageInfoText;

    @FindBy(xpath = "//small[@class='ps-2']")
    public WebElement missingInfoWarningText;

    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    // Nursel - Mandatory locators for skip method to go step by step
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement page2TripStartPointMenu;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement page2TripEndPointMenu;

    @FindBy(xpath = "//textarea")
    public WebElement page3CarInfoTextarea;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4MaxKisiPlusButton;

    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[1]")
    public WebElement page5TripDateInput;

    @FindBy(xpath = "//p[@class='pt-3']//following::div[@class='react-datepicker__input-container']//input[@type='text']")
    public WebElement page5TripHourMenu;

    @FindBy(xpath = "(//li[@class='react-datepicker__time-list-item '])[5]")
    public WebElement page5TripHour1AMOption;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__portal')]//span[contains(@class,'next')]")
    public WebElement page5TripNextMonthIcon;

    @FindBy(css = ".react-datepicker__day.react-datepicker__day--001")
    public WebElement page5TripNextMonthDay1Icon;

    @FindBy(css = ".react-datepicker__day.react-datepicker__day--007")
    public WebElement page5TripNextMonthDay7Icon;

    public void setPage1CarType(String carType) {
        Driver.get().findElement(By.xpath("//small[text()='" + carType + "']")).click();
    }

    public void setPage2TripStartPoint(String address) {
        page2TripStartPointMenu.sendKeys(address + Keys.ENTER);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
    }

    public void setPage2TripEndPoint(String address) {
        page2TripEndPointMenu.sendKeys(address + Keys.ENTER);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("[id$='-option-0']")).click();
    }

    public void setPage3CarSeatOption(String carOption) {
        String carLocator = "//span[.='" + carOption + "']";
        Driver.get().findElement(By.xpath(carLocator)).click();
    }

    public void setPage4MaxPerson(Integer maxPerson) {
        for (int i = 0; i < maxPerson; i++)
            page4MaxKisiPlusButton.click();
    }

    public void setPage4AgeOptions(String age) {
        if(!age.isEmpty()) {
            String ageLocator = "//span[.='" + age + "']";
            Driver.get().findElement(By.xpath(ageLocator)).click();
        }
    }

    public void setPage4GenderOption(String gender) {
        if(!gender.isEmpty()) {
            String genderLocator = "//span[text()='" + gender + "']";
            Driver.get().findElement(By.xpath(genderLocator)).click();
        }
    }

    public void setPage5TripDates() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();

        page5TripDateInput.click();
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthIcon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthDay1Icon);
        BrowserUtils.waitFor(1);
        executor.executeScript("arguments[0].click();", page5TripNextMonthDay7Icon);
    }

    public void setPage5TripHour() {
        BrowserUtils.waitFor(1);
        page5TripHourMenu.click();
        BrowserUtils.waitFor(1);
        page5TripHour1AMOption.click();
        BrowserUtils.waitFor(1);
    }

    public void navigateToPageInBirlikteSeyahat(int sayfa) {
        while (true) {
            if (sayfa < 1 || sayfa > 10) {
                Assert.fail("Not valid page number :" + sayfa);
            }
            if (sayfa == 1)
                break;

            // 1. PAGE
            BrowserUtils.waitFor(1);
            setPage1CarType("Taksi");
            BrowserUtils.waitFor(1/2);
            ilerleButton.click();
            if (sayfa == 2)
                break;

            // 2. PAGE
            setPage2TripStartPoint("Litvanya");
            setPage2TripEndPoint("Amsterdam, Hollanda");
            BrowserUtils.waitFor(1);
            ilerleButton.click();
            if (sayfa == 3)
                break;

            // 3. PAGE
            BrowserUtils.waitFor(1);
            setPage3CarSeatOption("Ön Koltuk");
            page3CarInfoTextarea.sendKeys("Sigara İçilmemiş");
            ilerleButton.click();
            if (sayfa == 4)
                break;

            // 4. PAGE
            BrowserUtils.waitFor(1);
            setPage4AgeOptions("Farketmez");
            setPage4GenderOption("Kadin");
            setPage4MaxPerson(3);
            BrowserUtils.waitFor(1/2);
            ilerleButton.click();
            if (sayfa == 5)
                break;

            // 5. PAGE
            BrowserUtils.waitFor(1);
            setPage5TripDates();
            setPage5TripHour();
            ilerleButton.click();
            if (sayfa == 6)
                break;

        }
    }
    /****************************************************************************************************************/
    // Page1 by AdemClk:

    @FindBy(xpath = "//*[@class='navbar-brand']")
    public WebElement page1Kese;

    @FindBy(xpath = "//*[@class='navbar-nav me-auto fs-3']")
    public WebElement page1BirAlti;

    @FindBy(xpath = "//*[text()='İlanlarım']")
    public WebElement page1Ilanlarim;

    @FindBy(xpath = "//*[text()='Araç Türü']")
    public WebElement page1AracTuru;

    @FindBy(xpath = "//*[text()='Birlikte seyahat etmek için kullancağınız / kullanmak istediğiniz aracın türünü belirtiniz.']")
    public WebElement page1Bilgi;

    @FindBy(xpath = "(//*[@class='pt-1 px-0' and text()='Taksi'])")
    public WebElement page1Taksi;

    @FindBy(xpath = "(//*[@class='pt-1 px-0' and text()='Kamyonet'])")
    public WebElement page1Kamyonet;

    @FindBy(xpath = "(//*[@class='pt-1 px-0' and text()='Minibüs'])")
    public WebElement page1Minibus;

    @FindBy(xpath = "(//*[@id='next' and text()='İlerle'])")
    public WebElement page1IlerleButon;

    @FindBy(xpath="//button[@style='cursor: not-allowed; opacity: 0.65;']")
    public WebElement ilerleButonuSaydamlik;

    @FindBy(xpath="//*[contains(text(),'*Lütfen araç tipini seçiniz.')]")
    public WebElement LutfenAracTipiniGirinizYazisi;

    /****************************************************************************************************************/
    // Page2 by Bilal

    @FindBy (xpath = "//h2[contains(text(),'Yolculuk Rotas')]")
    public WebElement topText;

    @FindBy (xpath = "//p[contains(text(),'Yapac')]")
    public WebElement secondText;

    @FindBy(id = "react-select-2-input")
    public WebElement firstTextBox;

    @FindBy(css ="[id$='-option-0']")
    public WebElement chooseOption;

    @FindBy(xpath = "//div[contains(text(),'Ba')]")
    public WebElement firstTextBoxValidation;

    @FindBy(id = "react-select-3-input")
    public WebElement secondTextBox;

    @FindBy(xpath = "//div[contains(text(),'Biti')]")
    public WebElement secondTextValidation;

    @FindBy(id = "react-select-4-input")
    public WebElement thirdTextBox;

    @FindBy(id = "react-select-5-input")
    public WebElement fifthTextBox;

    @FindBy(id = "react-select-6-input")
    public WebElement sixthTextBox;

    @FindBy(id = "react-select-7-input")
    public WebElement seventhTextBox;


    @FindBy(xpath = "//p[contains(text(),'Noktalar')]")
    public WebElement thirdTextBoxValidation;


    @FindBys( {
            @FindBy(xpath = "//div[@class='col-11']")

    } )
    public List<WebElement> addPassListelements;


    @FindBys({
            @FindBy (xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    })
    public List<WebElement> deleteElements;


    /****************************************************************************************************************/
    //Page3 by MehmetAslan and MehmetSen

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfThePage3;

    @FindBy(xpath = "//h2[normalize-space()='Araç/Seyehat Bilgileri']")
    public WebElement page3AracInfo;

    @FindBy(xpath = "//p[contains(text(),'Seyehattaki koltuk tecihinizi veya müsait olan kol')]")
    public WebElement page3SeatInfo;

    @FindBy(xpath = "//span[normalize-space()='Ön Koltuk']")
    public WebElement page3OnKoltuk;

    @FindBy(xpath = "//span[normalize-space()='Arka Koltuk']")
    public WebElement page3ArkaKoltuk;

    @FindBy(xpath = "//span[normalize-space()='Farketmez']")
    public WebElement page3Farketmez;

    @FindBy(xpath = "//p[contains(text(),'Aracınızla ilgili özellikleri, ayrıcalıkları , ava')]")
    public WebElement page3AracQuality;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement page3textArea;

    @FindBy(xpath = "//div/small[contains(text(), 'Lütfen zorunlu bilgileri giriniz.')]")
    public WebElement page3ZorunluBilgilerWarning;


    /****************************************************************************************************************/
    //Page 4 Nuray

    public boolean isDisplayedText(String text) {
        String buttonLocatorText = "//*[contains(text(),'" + text + "')]";
        WebElement textLocator = Driver.get().findElement(By.xpath(buttonLocatorText));
        return textLocator.isDisplayed();

    }
    public void clickPage4AgeRange(int ageRange) {
        String ageLocator = "(//div[@class='pt-1 d-flex flex-wrap'][1]//div[@class='pr-2 pb-2'])["+ageRange+"]";
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath(ageLocator)).click();
    }
    public boolean isDisplayedPage4AgeRange(int ageRange) {
        String ageLocator = "(//div[@class='pt-1 d-flex flex-wrap'][1]//div[@class='pr-2 pb-2'])["+ageRange+"]";
        BrowserUtils.waitFor(1);
        WebElement ageRangeLocator= Driver.get().findElement(By.xpath(ageLocator));
        return ageRangeLocator.isDisplayed();
    }

    public boolean greenPage4AgeRangeDisplayed(int ageRange) {
        String ageLocator = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success'])["+ageRange+"]";
        WebElement greenAgeRange= Driver.get().findElement(By.xpath(ageLocator));
        return greenAgeRange.isDisplayed();
    }

    public void clickPage4Gender(String text,String num) {
        String genderLocator = "(//span[text()='"+text+"'])["+num+"]";
        Driver.get().findElement(By.xpath(genderLocator)).click();
    }
    public boolean enablePage4Gender(String text,String num) {
        String genderLocator = "(//span[text()='"+text+"'])["+num+"]";
        WebElement enableGender= Driver.get().findElement(By.xpath(genderLocator));
        return enableGender.isEnabled();
    }

    public boolean displayedGreenPage4Gender(String text,String num) {
        String genderLocator = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success' and text()='"+text+"'])["+num+"]";
        WebElement displayedGreeenGender=Driver.get().findElement(By.xpath(genderLocator));
        return displayedGreeenGender.isDisplayed();
    }



    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//span[@class='p-2 px-3 badge rounded-pill text-light bg-success'])[1]")
    public WebElement greenpage4GenderFarketmez;

    @FindBy(xpath = "//button[text()='+']")
    public WebElement page4KisiSayisiIncrement;

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiDecrement;

    @FindBy(xpath = "//span[@class='input-number-value']")
    public WebElement page4KisiSayisiValue;



    /****************************************************************************************************************/
    //Page5 by Selen

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page5TripCancelButton;


    /*****************************************************************************************************************/
    //Page6 by RejepA

    @FindBy (xpath="//div/h2")
    public WebElement Page6_Title;

    @FindBy (xpath="//button[@class='border btn btn-white py-2']")
    public WebElement Page6_ResimleriSecinButton;

    @FindBy (xpath="//button[@class='border btn btn-white py-2 mt-2 mt-md-0']")
    public WebElement Page6_TumResimleriKaldirButton;

    @FindBy (xpath="//small[contains(text(), 'En az')]")
    public WebElement Page6_EnAtlttakiYazi;

    @FindBy (id = "file-upload1")
    public WebElement Page6_FileUpload1;

    @FindBy (id = "file-upload2")
    public WebElement Page6_FileUpload2;

    @FindBy (id = "file-upload3")
    public WebElement Page6_FileUpload3;

    @FindBy (id = "file-upload4")
    public WebElement Page6_FileUpload4;


    /*************************************************************************************************************/
    //Page2 by MSEN

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page2theNumberOfThePage;

    @FindBy(xpath = "//div/h2[contains(text(), 'Yolculuk Rotası')]")
    public WebElement page2YolculukRotasi;

    @FindBy(xpath = "//div/p[contains(text(), 'Yapacağınız/ Yapmak istediğiniz')]")
    public WebElement page2YolculukRotasiAciklamasi;

    @FindBy(xpath = "//h6[contains(text(), 'Başlangıç Noktası')]")
    public WebElement page2BaslangicNoktasi;

    @FindBy(xpath = "(//div[contains(text(), 'Select...')])[1]")
    public WebElement page2BaslangicNoktasiBox1;

    @FindBy(xpath = "//h6[contains(text(), 'Bitiş Noktası')]")
    public WebElement page2BitisNoktasi;

    @FindBy(xpath = "(//div[contains(text(), 'Select...')])[2]")
    public WebElement page2BitisNoktasiSelectBox2;

    @FindBy(xpath = "//h6[contains(text(), 'Geçiş Noktaları')]")
    public WebElement page2GecisNoktalari;

    @FindBy(xpath = "(//div[contains(text(), 'Select...')])[3]")
    public WebElement page2GecisNoktalariSelectBox3;

    @FindBy(xpath = "//button[contains(text(),'İlerle')]")
    public WebElement page2ilerleButton;


    /****************************************************************************************************************/
    //Page6 addition by nur
    @FindBy (xpath = "//div[@class='rounded ']")
    public List<WebElement> page6AddedPics;

    @FindBy (xpath = "//button[.='Resimleri Kaydet']")
    public WebElement page6ResimleriKaydetBtn;

    @FindBy (xpath = "//button[.='Geri']")
    public WebElement page6GeriBtn;

    @FindBy (xpath = "//button[.='İlanı Yayınla']")
    public WebElement page6IlaniYayinlaBtn;
}

