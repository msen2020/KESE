package pages.UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class BedAndBreakfastPage extends CommonPage {

    //Common Locators

    @FindBy(xpath = "//*[contains(text(),'İlerle')]")
    public WebElement ilerleButton;

    @FindBy(xpath = "//button[@id='next']")
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
    //Page 1 by Aziz

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement bedAndBreakfastp1Mustakil;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[2]")
    public WebElement bedAndBreakfastp1Apartman;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[3]")
    public WebElement bedAndBreakfastp1Studyo;

    @FindBy(xpath = "//*[text()='Odanız hangi ev türünde yer alıyor , belirtiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeQuestion;

    @FindBy(xpath = "//*[text()='*Lütfen ev tipini seçiniz.']")
    public WebElement bedAndBreakfastp1HouseTypeWarning;


    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    //Page 2 by Nursel

    @FindBy(xpath = "//div[@class='py-3']//b")
    public WebElement page2SectinizAdresTextValue;

    @FindBy(css = ".fas.fa-check.text-success")
    public WebElement page2SectinizAdresText;

    @FindBy(id = "react-select-2-input")
    public WebElement page2AddressInputBox;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement page2EvOtobusInputBox;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement page2EvTrenInputBox;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement page2EvTramvayInputBox;

    @FindBy(id = "flexRadioDefault2")
    public WebElement page2SahsiAracCheckBox;

    public void clickPage1RoomType(String roomType) {
        String roomTypeLocator = "//label[.='" + roomType + "']/preceding-sibling::input[@type='checkbox']";
        Driver.get().findElement(By.xpath(roomTypeLocator)).click();
    }


    public boolean isPage2TransportationOptionEnabled(String transportationOption) {
        String transportationLocator = "//div[@class='col-7 px-0' and text()='" + transportationOption + " ']/following-sibling::div//input";
        return Driver.get().findElement(By.xpath(transportationLocator)).isEnabled();
    }

    public void setPage2TransportationDistances(Map<String, String> transportationOpportunities) {
        for (Map.Entry<String, String> transportation : transportationOpportunities.entrySet()) {
            String transportationLocator = "//div[@class='col-7 px-0' and text()='" + transportation.getKey() + " ']/following-sibling::div//input";
            Driver.get().findElement(By.xpath(transportationLocator)).clear();
            Driver.get().findElement(By.xpath(transportationLocator)).sendKeys(transportation.getValue());
        }
    }

    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    //Page 3 by Berrin

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage3;

    @FindBy(xpath = "//div/h2[contains(text(), 'Kullanım Alanı')]")
    public WebElement page3KullanimAlaniYazisi;

    @FindBy(xpath = "//input[@type = 'number']")
    public WebElement page3KullanimAlaniInput;

    @FindBy(xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3yatakodasieksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3banyoeksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3tuvaleteksibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 mr-3']")
    public WebElement page3oturmaodasieksibutonu;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3yatakodasiartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3banyoartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3tuvaletartibutonu;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement page3oturmaodasiartibutonu;

    @FindBy(xpath = "//div[@class='form-group row align-items-center ']/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3yatakodasisayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][1]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3banyosayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][2]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3tuvaletsayisi;

    @FindBy(xpath = "//div[@class='form-group row  align-items-center pt-2'][3]/div[@class='input-number-container col-5']/div[@class='w-100   d-flex justify-content-center align-items-center']/span[@class='input-number-value']")
    public WebElement page3oturmaodasisayisi;

    // Page 3: by MSEN
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfThePage3;

    @FindBy(xpath = "//div/h2[contains(text(), 'Kullanım Alanı')]")
    public WebElement page3KullanimAlani;

    @FindBy(xpath = "//div/p[contains(text(), 'Odanızın kullanım alanını')]")
    public WebElement page3KullanimAlaniAciklamasi;

    @FindBy(xpath = "//input[@type = 'number']")
    public WebElement page3KullanimAlani_Input;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page3MisafirOrtakKullanimAlaniBelirtinizText;

    @FindBy(xpath = "//span[contains(text(), 'Yatak')]")
    public WebElement page3YatakOdasi;

    @FindBy(xpath = "//span[contains(text(), 'Banyo')]")
    public WebElement page3Banyo;

    @FindBy(xpath = "//span[contains(text(), 'Tuvalet')]")
    public WebElement page3Tuvalet;

    @FindBy(xpath = "//span[contains(text(), 'Oturma')]")
    public WebElement page3OturmaOdasi;

    @FindBy(xpath = "(//button[text() = '+'])[1]")
    public List<WebElement> step3_incrementButton1;

    @FindBy(xpath = "(//button[text() = '+'])[2]")
    public List<WebElement> step3_incrementButton2;

    @FindBy(xpath = "(//button[text() = '+'])[3]")
    public List<WebElement> step3_incrementButton3;

    @FindBy(xpath = "(//button[text() = '+'])[4]")
    public List<WebElement> step3_incrementButton4;

    @FindBy(xpath = "(//button[text() = '−'])[1]")
    public List<WebElement> step3_decrementButton1;

    @FindBy(xpath = "(//button[text() = '−'])[2]")
    public List<WebElement> step3_decrementButton2;

    @FindBy(xpath = "(//button[text() = '−'])[3]")
    public List<WebElement> step3_decrementButton3;

    @FindBy(xpath = "(//button[text() = '−'])[4]")
    public List<WebElement> step3_decrementButton4;

    @FindBy(xpath = "//button[contains(text(), 'İlerle')]")
    public WebElement page3IlerleButton;

    @FindBy(xpath = "//button[contains(text(), 'Geri')]")
    public WebElement page3GeriButton;


// @FindBy(className = "input-number-value")
// public List<WebElement> step3_AllNumbers;


    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
    public WebElement adresbutonusayfa2;

    @FindBy(id = "flexRadioDefault2")
    public WebElement clickbutonusayfa2;

    @FindBy(xpath = "//div[@class='ms-2']/*[@id='next']")
    public WebElement page3ilerlebutonu;

    @FindBy(xpath = "//small[contains(text(),'kullanım alanlarını giriniz.')]")
    public WebElement page3lutfenkullnimalanigirinyazisi;

    @FindBy(xpath = "//small[contains(text(),' yüzey alanını giriniz.')]")
    public WebElement page3lutfenyuzeyalanigirinizyazisi;

    @FindBy(xpath = "//p[contains(text(), 'Odanızın')]")
    public WebElement page3OdanizinKullanimAlaniniBelirtinizYazisi;

    public void incrementFifteenTimes() {
        for (int i = 1; i <= 15; i++) {
            page3yatakodasiartibutonu.click();
            page3banyoartibutonu.click();
            page3tuvaletartibutonu.click();
            page3oturmaodasiartibutonu.click();
        }
    }

    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    //Page 4 (first 3 is min requirement) by Sevda

    @FindBy(xpath = "(//span[text()='Farketmez'])[1]")
    public WebElement page4AgeFarketmez;

    @FindBy(xpath = "(//span[text()='Farketmez'])[2]")
    public WebElement page4GenderFarketmez;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement page4KisiSayisiIncrement;

    @FindBy(xpath = "//span[text()='10-15']")
    public WebElement page4Age1;

    @FindBy(xpath = "//span[text()='16-20']")
    public WebElement page4Age2;

    @FindBy(xpath = "//span[text()='21-25']")
    public WebElement page4Age3;

    @FindBy(xpath = "//span[text()='26-35']")
    public WebElement page4Age4;

    @FindBy(xpath = "//span[text()='36-45']")
    public WebElement page4Age5;

    @FindBy(xpath = "//span[text()='46-65']")
    public WebElement page4Age6;

    @FindBy(xpath = "//span[text()='65+']")
    public WebElement page4Age7;

    @FindBy(xpath = "//span[text()='Kadin']")
    public WebElement page4GenderKadin;

    @FindBy(xpath = "//span[text()='Erkek']")
    public WebElement page4GenderErkek;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement page4KisiSayisiDecrement;

    @FindBy(xpath = "(//*[text() = 'Evet'])[1]")
    public WebElement page4OzelOdaImkaniEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[1]")
    public WebElement page4OzelOdaImkaniHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[2]")
    public WebElement page4KahvaltiEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[2]")
    public WebElement page4KahvaltiHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[3]")
    public WebElement page4BolCesit4EVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[3]")
    public WebElement page4BolCesitHAYIR;

    @FindBy(xpath = "//*[text()='*Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz.']")
    public WebElement page4Uyari;

    @FindBy(xpath = "//button[text()='+']")
    public WebElement page4plusbutton;

    //@FindBy(css = ".navbar-nav.me-auto.fs-3")
    @FindBy(xpath = "//div[text()='5']")
    public WebElement page4to5thPageVerification;

    @FindBy(xpath = "//a[@class='btn py-1 bg-light']")
    public WebElement page4_ileriButton;

    public void clickPage4Ageoptions(String ageText) {
        String ageLocator = "//*[text()='" + ageText + "']";
        Driver.get().findElement(By.xpath(ageLocator)).click();
    }

    public void clickPage4Gender(String gender) {
        String genderLocator = "//span[text()='" + gender + "']";
        Driver.get().findElement(By.xpath(genderLocator)).click();
    }

  /*  public void clickPage4AgeOptions(List<String> ageList) {
        for (String ageText : ageList) {
            String ageLocator = "//span[.='" + ageText + "']";
            Driver.get().findElement(By.xpath(ageLocator)).click();
        }
    }
*/

    //* --------------------------------------------------------------------------------------------------------------

    //Page 6 by nur

    @FindBy(xpath = "//h2")
    public WebElement page6header;

    @FindBy(xpath = "//p[@class='pt-3']")
    public List<WebElement> page6inputBoxHeaders;

    @FindBy(xpath = "//textarea[@id='room']")
    public WebElement page6inputBoxRoom;

    @FindBy(xpath = "//textarea[@id='home']")
    public WebElement page6inputBoxHome;

    @FindBy(xpath = "//textarea[@id='breakfast']")
    public WebElement page6inputBoxBreakf;


    //* --------------------------------------------------------------------------------------------------------------

    // Page 7 by AykutC

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage7;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement page7aktivitelerText;

    @FindBy(xpath = "//div[@class='px-3 py-2']/p")
    public WebElement page7InfoText;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-roller-coaster']")
    public WebElement page7LunaPark;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-vacations']")
    public WebElement page7Plaj;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-bike-1']")
    public WebElement page7BisikletYolu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-museum']")
    public WebElement page7Muze;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-fishing']")
    public WebElement page7BalikTutma;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-ski']")
    public WebElement page7KayakYapma;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-dumbbell']")
    public WebElement page7SporSalonu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-hiking']")
    public WebElement page7DogaYuruyusu;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-times-square']")
    public WebElement page7UnluMeydan;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-slider']")
    public WebElement page7CocukParki;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-halal']")
    public WebElement page7HelalRestorant;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-mall']")
    public WebElement page7Avm;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-cinema']")
    public WebElement page7Sinema;

    @FindBy(xpath = "//i[@class='fas fa-2x flaticon-mosque']")
    public WebElement page7CamiiDernek;

    @FindBy(xpath = "//div[@id='root']//small[@class='ps-2']")
    public WebElement page7ActiviteWarningMessage;


    // --------------------------------------------------------------------------------------------------------------
    //Page 8 by RejepA

    @FindBy(xpath = "(//div[@class='col-7'])[1]")
    public WebElement page8Cocuklarinizgetirebilirsiniz;

    @FindBy(xpath = "(//div[@class='col-7'])[2]")
    public WebElement page8Evcilhayvanlarigetirebilirsiniz;

    @FindBy(xpath = "(//div[@class='col-7'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilir;

    @FindBy(xpath = "(//div[@class='col-7'])[4]")
    public WebElement page8ArabaDegisimiOlabilir;

    @FindBy(xpath = "(//div[@class='col-7'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvan;

    @FindBy(xpath = "(//div[@class='col-7'])[6]")
    public WebElement page8BakilmasiGerekenBitki;

    @FindBy(xpath = "(//*[text() = 'Evet'])[1]")
    public WebElement page8CocuklarinizgetirebilirsinizEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[1]")
    public WebElement page8CocuklarinizgetirebilirsinizHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[2]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[2]")
    public WebElement page8EvcilhayvanlarigetirebilirsinizHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[3]")
    public WebElement page8EvdeSigaraIcmeyeIzinVerilirHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[4]")
    public WebElement page8ArabaDegisimiOlabilirEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[4]")
    public WebElement page8ArabaDegisimiOlabilirHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvanEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[5]")
    public WebElement page8BakilmasiGerekEvcilHayvanHAYIR;

    @FindBy(xpath = "(//*[text() = 'Evet'])[5]")
    public WebElement page8BakilmasiGerekenBitkiEVET;

    @FindBy(xpath = "(//*[text() = 'Hayır'])[6]")
    public WebElement page8BakilmasiGerekenBitkiHAYIR;


    // --------------------------------------------------------------------------------------------------------------
    // Page 9 by Selen

    @FindBy(xpath = "//input[@placeholder='Tarih seçmek için tıklayınız']")
    public WebElement page9InputCalenderBox;

    @FindBy(xpath = "//div[@class='react-datepicker__day-name' and text()='Su']")
    public WebElement page9CalendarPageSu;

    //    Seçtiğiniz Tarihler
    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, March 16th, 2022\"]")
    public WebElement march16th;

    @FindBy(xpath = "//div[@aria-label=\"Choose Saturday, March 26th, 2022\"]")
    public WebElement march26th;

    @FindBy(xpath = "//input[@value=\"03/16/2022 - 03/26/2022\"]")
    public WebElement page9pickedDates;

    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[2]")
    public WebElement page9SectiginizTarihlerText;

    @FindBy(xpath = "//div[@class='col-12 px-0']")
    public WebElement page9BookedDateSummary;

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page9CancelButton;

    @FindBy(xpath = "//div[@class='react-datepicker__current-month']")
    public WebElement page9currentMonthText;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']")
    public WebElement page9DatePickerIsVisible;


    // --------------------------------------------------------------------------------------------------------------
    //Page 10 by MSen

    public static final By stepNumberPage = By.xpath("//div[@class='navbar-nav me-auto fs-3']");

    public static final By page10Resim_ve_Fotograflar = By.xpath("//h2[contains(text(),'Resim ve Fotoğraflar')]");

    public static final By page10aciklama = By.xpath("//p[contains(text(),'Ortak kullanım alanlarının, odanızın ve')]");

    public static final By page10ResimleriSecin = By.linkText(" Resimleri Seçin");

    public static final By page10tumResimleriKaldir = By.linkText(" Tüm Resimleri Kaldır");

    public static final By page10enAzBesEnFazlaOnResim = By.linkText("En az 5 en fazla 10 resim yükleyebilirsiniz.");

    public static final By page10FirstResimEkle = By.xpath("//div[@class='d-flex flex-column align-items-center']");

    public static final By page10SecondResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][2]");

    public static final By page10ThirdResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][3]");

    public static final By page10FourthResimEkle = By.xpath("//div[@class='col-6 col-sm-4 col-md-4 col-lg-3  h-100'][4]");

    public static final By resimleriKaydtButton = By.linkText("Resimleri Kaydet");



    // --------------------------------------------------------------------------------------------------------------
    //Page 10 by Nuray

    @FindBy(xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement page10ResimleriKaydetButton;

    @FindBy(xpath = "//*[contains(text(), 'İlanı Yayınla')]")
    public WebElement page10publishAdButton; // ilani yayinla butonu

    @FindBy(xpath = "//button[contains(text(),'Tüm Resimleri Kaldır')]")
    public WebElement page10RemoveAllPicturesButton;

    @FindBy(xpath = "//h2[contains(text(),'Resim ve Fotoğraflar')]")
    public WebElement page10TitleName;

    @FindBy(xpath = "//p[contains(text(),'En fazla 10 adet fotoğraf ekleyebilirsiniz')]")
    public WebElement page10ExplainTextBox;

    @FindBy(xpath = "//button[contains(text(),'Resimleri Seçin')]")
    public WebElement page10ResimleriSecinButton;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
//div[@class='navbar-nav me-auto fs-3' and contains(text(),'2')]
    public WebElement page10StepTextBox;

    public void pageRateText(int numberOfPage) {
        String pageRateLocator = "//div[@class='navbar-nav me-auto fs-3' and contains(text(),'" + numberOfPage + "')]";
        WebElement pageStepRateText = Driver.get().findElement(By.xpath(pageRateLocator));
    }

    public void pictureLoaded(int pictureNum) {
        String pictureLoadedLocator = "(//div[@class = 'rounded '])[" + pictureNum + "]";
        WebElement page10PictureLocator = Driver.get().findElement(By.xpath(pictureLoadedLocator));
    }

    public void pictureFrame(int frameNum) {
        String pictureFrameLocator = "//label[@for='file-upload" + frameNum + "']";
        WebElement page10PictureFrameLocator = Driver.get().findElement(By.id(pictureFrameLocator));
    }


    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    //Page 10 by Muhsin

    // resim eklemeye yarayançerçevelerde ki Resim Ekle
    @FindBy(xpath = "//*[contains(text(), 'Resim Ekle')]")
    public WebElement step10_addImageText;

    //all locators min request by Muhsin
    // 1st page
    @FindBy(xpath = "//*[contains(text(),'Müstakil Ev')]")
    public WebElement step1_houseButton;  //  Müstakil Ev
    // 2nd page
    @FindBy(xpath = "//*[contains(text(),'Select...')]")
    public WebElement step2_selectText;
    // 2nd page
    @FindBy(id = "react-select-2-input")
    public WebElement step2_selectTextButton;
    // 2nd page
    @FindBy(className = "form-check-input")
    public WebElement step2_checkBox;
    // 3rd page
    @FindBy(id = "size")
    public WebElement step3_sizeOfAreaUp;
    // 4th page
    @FindBy(xpath = "//*[contains(text(),'10-15')]")
    public WebElement step4_10_15AgeOption;
    // 4th page
    @FindBy(xpath = "//*[contains(text(),'Erkek')]")
    public WebElement step4_ErkekOption;
    // 4th page
    @FindBy(className = "ml-3")
    public WebElement step4_plus; //Kişi sayısı
    // 5th page
    @FindBy(xpath = "//*[contains(text(),'TV')]")
    public WebElement step5_tvText;
    // 6th page
    @FindBy(id = "room")
    public WebElement step6_roomExplanation;
    // 6th page
    @FindBy(id = "home")
    public WebElement step6_homeExplanation;
    // 6th page
    @FindBy(id = "breakfast")
    public WebElement step6_breakfastExplanation;
    // 7th page
    @FindBy(xpath = "//*[contains(text(),'Müze')]")
    public WebElement step7_museumText;
    // 8th page
    @FindBy(xpath = "//*[contains(text(),'Evet')]")
    public List<WebElement> step8_yesTexts;
    // 9th page
    @FindBy(className = "react-datepicker__input-container")
    public WebElement step9_selectDate;
    // 9th page
    @FindBy(xpath = "//*[@tabindex=0]")
    public WebElement step9_todaysLocator;


    /**
     * --------------------------------------------------------------------------------------------------------------
     */
    // Page 5 by Adem

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='TV']")
    public WebElement page5TV;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Mini Buzdolabı']")
    public WebElement page5MiniBuzdolabi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Wi-Fi']")
    public WebElement page5WIFI;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Kurutma Makinesi']")
    public WebElement page5KurutmaMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Çay Makinesi']")
    public WebElement page5CayMakinasi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Kahve Makinesi']")
    public WebElement page5KahveMakinasi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Microdalga Fırın']")
    public WebElement page5Mikrodalga;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Asansör']")
    public WebElement page5Asansor;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bebek arabası']")
    public WebElement page5BebekArabasi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bilgisayar']")
    public WebElement page5Bilgisayar;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bahçe']")
    public WebElement page5Bahce;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Ücretsiz Park Alanı']")
    public WebElement page5UcretsizPark;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Ücretli Park Alanı']")
    public WebElement page5UcretliPark;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bisiklet']")
    public WebElement page5Bisiklet;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Çocuk Bisikleti']")
    public WebElement page5CocukBisikleti;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Oyun konsolu']")
    public WebElement page5OyunKonsolu;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Balkon']")
    public WebElement page5Balkon;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Teras']")
    public WebElement page5Teras;

    @FindBy(xpath = "//*[text()='Ev İmkanları']")
    public WebElement page5EvImkanlari;

    @FindBy(xpath = "//*[text()='Odanızda ne tür imkanlar sunacağınızı belirtiniz.']")
    public WebElement page5OdanizdaNeTurImkan;

    @FindBy(xpath = "//*[text()='*Lütfen ev olanaklarını seçiniz.']")
    public WebElement page5Uyari;

    @FindBy(xpath = "//*[@class='btn btn-light py-1']")
    public WebElement page5Geri;

    @FindBy(xpath = "//*[@class='btn btn-light py-1  bg-light']")
    public WebElement page5Ileri;

    @FindBy(xpath = "//*[@class='navbar-nav me-auto fs-3']")
    public WebElement page5BesOn;

    // US124 icin cogu locatorlar kullanilamadigi icin gerekli locaterlar yeniden olusturuldu

    @FindBy(xpath = "//span[@class='input-number-value']")
    public WebElement maximumKisiSayisi;

    @FindBy(xpath = "//*[text() = 'Müstakil Ev']/../../div")
    public WebElement step1_MustakilEvOption;

    @FindBy(xpath = "//*[text() = 'Apartman Dairesi']/../../div")
    public WebElement step1_ApartmanDairesiOption;

    @FindBy(xpath = "//*[text() = 'Stüdyo Daire']/../../div")
    public WebElement step1_StudyoDaireOption;

//    @FindBy (xpath = "//*[@id='next' and contains(text(), 'İlerle')]")
//    public WebElement ilerleButton;
//
//    @FindBy(xpath = "//button[text() = 'Geri']")
//    public WebElement geriButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement step2_EvOtobusInput;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement step2_EvTrenInput;

    @FindBy(xpath = "(//input[@type='number'])[3]")
    public WebElement step2_EvTramwayInput;

    @FindBy(id = "size")
    public WebElement step3_UsageAreaInput;

    @FindBy(className = "input-number-value")
    public List<WebElement> step3_AllNumbers;

    @FindBy(xpath = "//button[text() = '+']")
    public WebElement step4_incrementButtonOfTekKisilikYatak;

    @FindBy(xpath = "//button[text() = '+']")
    public List<WebElement> step4_incrementButtons;

    @FindBy(className = "input-number-value")
    public List<WebElement> step4_AllNumbers;

    @FindBy(xpath = "//*[text() = 'TV']")
    public WebElement step5_TvOption;

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step5_AllOptions;

    @FindBy(id = "home")
    public WebElement step6_DescInput;

    @FindBy(xpath = "//*[text() = 'Lunapark']")
    public WebElement step7_LuneparkOption;

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step7_AllOptions;

    @FindBy(xpath = "//*[text() = 'Hayır']")
    public List<WebElement> step8_HayirOptions;

    @FindBy(xpath = "//*[text() = 'Evet']")
    public List<WebElement> step8_EvetOptions;

    @FindBy(xpath = "//input[@placeholder = 'Tarih seçmek için tıklayınız'][1]")
    public WebElement step9_FirstDatePickerInput;

    @FindBy(css = " [class~=react-datepicker__day--today]")
    public WebElement step9_TodayOption;

    @FindBy(id = "file-upload1")
    public WebElement step10_FileUpload1;

    @FindBy(id = "file-upload2")
    public WebElement step10_FileUpload2;

    @FindBy(id = "file-upload3")
    public WebElement step10_FileUpload3;

    @FindBy(id = "file-upload4")
    public WebElement step10_FileUpload4;

    @FindBy(id = "file-upload5")
    public WebElement step10_FileUpload5;

    @FindBy(id = "file-upload6")
    public WebElement step10_FileUpload6;

    @FindBy(id = "file-upload7")
    public WebElement step10_FileUpload7;

    @FindBy(id = "file-upload8")
    public WebElement step10_FileUpload8;

    @FindBy(id = "file-upload9")
    public WebElement step10_FileUpload9;

    @FindBy(id = "file-upload10")
    public WebElement step10_FileUpload10;

    @FindBy(xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement step10_ResimleriKaydetButton;

    public WebElement getStep5Option(String text) {
        for (WebElement e : step5_AllOptions) {
            if (e.getText().equalsIgnoreCase(text)) {
                return e;
            }
        }

        return null;
    }

    public WebElement getStep7Option(String text) {
        for (WebElement e : step7_AllOptions) {
            if (e.getText().equalsIgnoreCase(text)) {
                return e;
            }
        }

        return null;
    }

    @FindBy(xpath = "//*[contains(text(), '*Lütfen özel şart seçiniz.')]")
    public WebElement LutfenOzelSartlarSecinizUyarisi;

    @FindBy(xpath = "//div/div[contains(text(),'16')]")
    public WebElement pickAnyDate;

    @FindBy(tagName = "li")
    public WebElement page9SelectedDate;

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page9XButton;

    @FindBy(xpath = "//input[@placeholder='Tarih seçmek için tıklayınız']")
    public WebElement page9clickOnDate;

    @FindBy(xpath = "//p[@class='pt-3 false']")
    public WebElement page9SectiginizTarihler;

    @FindBy(xpath = "//*[@tabindex=0]")
    public WebElement page9todaysLocator;


    //US123
    public boolean isDisplayedButton(String buttonText) {
        String buttonLocatorText = "//*[contains(text(),'" + buttonText + "')]";
        WebElement buttonTextLocator = Driver.get().findElement(By.xpath(buttonLocatorText));
        return buttonTextLocator.isDisplayed();

    }

    public boolean isEnabledButton(String buttonText) {
        String buttonLocatorText = "//*[contains(text(),'" + buttonText + "')]";
        WebElement buttonTextLocator = Driver.get().findElement(By.xpath(buttonLocatorText));
        return buttonTextLocator.isEnabled();

    }


}

