package pages.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EvDegisimiPage extends CommonPage {

   /* ARKADASLAR LUTFEN KENDI KODLARINIZI YAZMADAN ONCE MASTER BRANCHE DEN FETCHE YAPTIGINIZDAN VE
    KENDI BRANCHE INIZIN UPDATE OLDUGUNDAN EMIN OLALIM

        * KENDI CALISTIGIMIZ DOSYALAR HARICINDE BASKA DOSYALAR UZERINDE KI BASKALARININ YAZDIGI KODLAR
        UZERINDE DEGISIKLIK YAPMAYALIM.

        *   - FEATURE FILE ISIMLENDIRMEMIZIN --> US51KeseSignUpPage.feature
            - STEP DEFINITION CLASS IMIZINDA --> US51KeseSignUpPageStepD seklinde oldugundan emin olalim.

        * TESTLERIMIZI RUNNER CLASS TA CALISTIRMAK VE RAPOR ALMAK ISTIYORSAK KENDI RUNNER CLASSIMIZI
        OZEL OLUSTURARAK CALISTIRIP RAPORLARIMIZI GORDUKTEN SONRA HEM KENDI RUNNER CLASSIMIZI HEM DE
        OLUSAN RAPORLARI SILDIKTEN SONRA PUSH YAPALIM

        * GITHUB DONGUMUZDE KODLAMAYA BASLAMADAN ONCE REMOTE MASTER BRANCHE DAN LOCAL MASTER BRANCHEMIZE FETCH YAPARAK
        ONCE LOCAL MASTER IMIZI GUNCELLEMELI, DAHA SONRA KENDI LOCAL BRANCHE IMIZE GECEREK LOCAL BRANCHE IMIZI DE
        UPDATE ETMELI VE YENI KODLARIMIZI YAZMAYA BASLAMALI BITIRDIKTEN SONRA REMOTE BRANCHE PUSH YAPMALI VE BU DONGUYU
        PROJE BOYUNCA DEVAM ETTIRMELIYIZ.

    * */


    //Page 1:
    @FindBy(xpath ="//span[@class='tabtext font-weight-semi-bold']")
    public WebElement evDegisimiSection;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[2]//img")
    public WebElement evDegisimiFirstPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[3]//img")
    public WebElement evDegisimiSecondPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[4]//img")
    public WebElement evDegisimiThirdPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[5]//img")
    public WebElement evDegisimiForthPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[6]//img")
    public WebElement evDegisimiFifthPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[7]//img")
    public WebElement evDegisimiSixthPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[8]//img")
    public WebElement evDegisimiSeventhPic;

    @FindBy (xpath="//div[@class='tab-content']/div/div/div[9]//img")
    public WebElement evDegisimiEighthPic;

    @FindBy (xpath="//img[@src='/dosyalar/resimler/1640991633814-6137264d4b593561085ff1af-0.jpg']")
    public WebElement odaKiralamaFirstPic;

    @FindBy (xpath="//img[@src='/dosyalar/resimler/1640897718752-6137264d4b593561085ff1af-0.jpg']")
    public WebElement odaKiralamaSecondPic;

    @FindBy (xpath="//img[@src='/dosyalar/resimler/1640516731796-613685f3a7eef55f0dca4f2e-0.jpg']")
    public WebElement odaKiralamaThirdPic;

    @FindBy (xpath="//img[@src='/dosyalar/resimler/1641047280998-6137264d4b593561085ff1af-0.jpg']")
    public WebElement bedAndBreakfastFirstPic;

    @FindBy (xpath="//img[@src='/dosyalar/resimler/1640516797246-613685f3a7eef55f0dca4f2e-0.jpg']")
    public WebElement bedAndBreakfastSecondPic;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[1]")
    public WebElement evDegisimiFirstHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[2]")
    public WebElement evDegisimiSecondHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[3]")
    public WebElement evDegisimiThirdHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[4]")
    public WebElement evDegisimiForthHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[5]")
    public WebElement evDegisimiFifthHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[6]")
    public WebElement evDegisimiSixthHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[7]")
    public WebElement evDegisimiSeventhHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[8]")
    public WebElement evDegisimiEightHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[9]")
    public WebElement odaKiralamaFirstHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[10]")
    public WebElement odaKiralamaSecondHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[11]")
    public WebElement odaKiralamaThirdHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[12]")
    public WebElement bedAndBreakfastFirstHouseType;

    @FindBy (xpath="(//div[@class='ml-1 text-gray-1'])[13]")
    public WebElement bedAndBreakfastSecondHouseType;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[1]")
    public WebElement evDegisimiFirstOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[2]")
    public WebElement evDegisimiSecondOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[3]")
    public WebElement evDegisimiThirdOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[4]")
    public WebElement evDegisimiForthOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[5]")
    public WebElement evDegisimiFifthOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[6]")
    public WebElement evDegisimiSixthOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[7]")
    public WebElement evDegisimiSeventhOwnerName;

    @FindBy (xpath="(//div[@style='overflow: hidden; white-space: nowrap;'])[8]")
    public WebElement evDegisimiEighthOwnerName;

    @FindBy(xpath = "(//div[@style='overflow: hidden; white-space: nowrap;'])[9]")
    public WebElement odaKiralamaFirstOwnerName;

    @FindBy(xpath = "(//div[@style='overflow: hidden; white-space: nowrap;'])[10]")
    public WebElement odaKiralamaSecondOwnerName;

    @FindBy(xpath = "(//div[@style='overflow: hidden; white-space: nowrap;'])[11]")
    public WebElement odaKiralamaThirdOwnerName;

    @FindBy(xpath = "(//div[@style='overflow: hidden; white-space: nowrap;'])[12]")
    public WebElement bedAndBrekfastFirstOwnerName;

    @FindBy(xpath = "(//div[@style='overflow: hidden; white-space: nowrap;'])[13]")
    public WebElement bedAndBrekfastSecondOwnerName;


    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[1]")
    public WebElement evDegisimiFirstPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[2]")
    public WebElement evDegisimiSecondPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[3]")
    public WebElement evDegisimiThirdPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[4]")
    public WebElement evDegisimiForthPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[5]")
    public WebElement evDegisimiFifthPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[6]")
    public WebElement evDegisimiSixthPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[7]")
    public WebElement evDegisimiSeventhPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[8]")
    public WebElement evDegisimiEighthPicTitle;

    @FindBy(xpath = "((//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[2]")
    public WebElement odaKiralamaFirstPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[12]")
    public WebElement odaKiralamaSecondPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[13]")
    public WebElement odaKiralamaThirdPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[14]")
    public WebElement bedAndBreakfastFirstPicTitle;

    @FindBy(xpath = "(//a[@class='card-title font-size-17 font-weight-bold mb-0 text-dark'])[15]")
    public WebElement bedAndBreakfastSecondPicTitle;


    @FindBy(xpath = "(//span[@class='tabtext font-weight-semi-bold'])[1]")
    public WebElement evDegisimiButton;

    @FindBy(xpath = "(//span[@class='tabtext font-weight-semi-bold'])[2]")
    public WebElement odaKiralaButton;

    @FindBy(xpath = "(//span[@class='tabtext font-weight-semi-bold'])[3]")
    public WebElement bedAndBreakfastButton;


    @FindBy(xpath = "//img[@src='/assets/img/logo/keselogo_kisa.png']") //COMMON
    public WebElement page1KeseAmblem;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")   // COMMON
    public WebElement page1oneSlashTenWriting;

    @FindBy(xpath = "//*[text()='Ev Tipi']")      //COMMON
    public WebElement page1EvTipiTitle;

    @FindBy(xpath = "//*[text()='Değişim yapmak istediğiniz evinizin türünü belirtiniz']")
    public WebElement page1HomeDegisimEvTuruWriting;

    @FindBy(xpath = "//div[@class='border py-3 rounded border-warning text-warning ']")
    public WebElement page1HomeMustakilEv;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[1]")
    public WebElement page1HomeApartman;

    @FindBy(xpath = "(//div[@class='border py-3 rounded false'])[2]")
    public WebElement page1HomeStudyo;

    @FindBy(xpath = "//img[@src='ilanver/home.png']")
    public WebElement page1HomeImage;


    // Page 2:*********************************************
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage2;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page2EvinizinKonumunuBelirtinizYzisi;

    @FindBy(id = "react-select-2-input")
    public WebElement page2AddressInput;

    @FindBy(xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy(id = "flexRadioDefault2")
    public WebElement step2_CheckBox;

    @FindBy(xpath = "//h6[contains(text(), 'Eviniz')]")
    public WebElement page2EvinizIleToplutasimaYzisi;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile otobüs durağı arası : ']")
    public WebElement page2EvIleOtobus;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile tren istasyonu arası : ']")
    public WebElement page2EvIleTren;

    @FindBy(xpath = "//div[@class='col-7 px-0' and text()='Ev ile tramway durağı arası : ']")
    public WebElement page2EvIleTramway;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement step2_EvOtobusInput;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement step2_EvTrenInput;

    @FindBy(xpath = "(//input[@type='number'])[3]")
    public WebElement step2_EvTramwayInput;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;

    // Page 3:*************************************
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage3;

    @FindBy(xpath = "//div/h2[contains(text(), 'Kullanım Alanı')]")
    public WebElement page3KullanimAlaniYazisi;

    @FindBy(xpath = "//input[@type = 'number']")
    public WebElement page3KullanimAlaniInput;

    @FindBy(xpath = "//p[contains(text(), 'Evinizin')]")
    public WebElement page3EvinizinKullanimAlaniBelirtinizYazisi;

    @FindBy(xpath = "//p[contains(text(), 'Evinizde')]")
    public WebElement page3EvinizdeKullaniabileceginizAlanlarYazisi;

    @FindBy(xpath = "//span[contains(text(), 'Yatak')]")
    public WebElement page3YatakOdasi;

    @FindBy(xpath = "//span[contains(text(), 'Banyo')]")
    public WebElement page3Banyo;

    @FindBy(xpath = "//span[contains(text(), 'Tuvalet')]")
    public WebElement page3Tuvalet;

    @FindBy(xpath = "//span[contains(text(), 'Oturma')]")
    public WebElement page3OturmaOdasi;

    @FindBy(xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy(xpath = "//button[text() = '−']")
    public List<WebElement> step3_decrementButtons;
    //  (//button[text() = '−'])[2]  => Tek tek bu sekilde bulunabilinir

    @FindBy(xpath = "//a[@id='next']")
    public WebElement page3IlerleButton;


    @FindBy(xpath = "//button[@id='next']")
    public WebElement page3GeriButton;


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


    // @FindBy(className = "input-number-value")
    // public List<WebElement> step3_AllNumbers;


    @FindBy(xpath = "//div[@class=' css-1hwfws3']")
    public WebElement adresbutonusayfa2;


    @FindBy(id = "flexRadioDefault2")
    public WebElement clickbutonusayfa2;

    @FindBy(xpath = "//div[@class='ms-2']/*[@id='next']")
    public WebElement page3ilerlebutonu;


    @FindBy(xpath = "//small[contains(text(),'kullanım alanlarını giriniz.')]")
    public WebElement page3LutfenKullanimAlanlariniGirinizText;

    @FindBy(xpath = "//small[contains(text(),' yüzey alanını giriniz.')]")
    public WebElement page3lutfenyuzeyalanigirinizText;


    @FindBy(xpath = "//p[contains(text(), 'Odanizin')]")
    public WebElement page3OdanizinKullanimAlaniniBelirtinizYazisi;

    public void incrementFifteenTimes() {
        for (int i = 1; i <= 15; i++) {
            page3yatakodasiartibutonu.click();
            page3banyoartibutonu.click();
            page3tuvaletartibutonu.click();
            page3oturmaodasiartibutonu.click();
        }

    }

    // Page 4 Titles----------------------------------------------------------------------

    @FindBy(xpath = "//h2[contains(text(),'Yatak Sayısı')]")
    public WebElement page4YatakSayisiTitle;

    @FindBy(xpath = "//p[contains(text(),'Evinizdeki kullanılabilir yatak sayısını belirtiniz.')]")
    public WebElement page4Text;

    @FindBy(xpath = "//span[contains(text(),'Tek Kişilik')]")
    public WebElement page4TekKisilikTitle;

    @FindBy(xpath = "//span[contains(text(),'İki Kişilik')]")
    public WebElement page4ikiKisilikTitle;

    @FindBy(xpath = "//span[contains(text(),'Çocuk Yatağı')]")
    public WebElement page4CocukYatagiTitle;

    @FindBy(xpath = "//span[contains(text(),'Bebek Yatağı')]")
    public WebElement page4BebekYatagiTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (Tekli)')]")
    public WebElement page4YerYatagiTekliTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (İkili)')]")
    public WebElement page4YerYatagiIkiliTitle;

    @FindBy(xpath = "//span[contains(text(),'Yer Yatağı (Çocuk)')]")
    public WebElement page4YerYatagiCocukTitle;

    @FindBy(xpath = "//span[contains(text(),'Beşik')]")
    public WebElement page4BesikTitle;


    //page 4 Decrease

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[1]")
    public WebElement page4TekKisilikDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[2]")
    public WebElement page4IkiKisilikDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[3]")
    public WebElement page4CocukYatagiDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[4]")
    public WebElement page4BebekYatagiDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[5]")
    public WebElement page4YerTekliYatagiDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[6]")
    public WebElement page4YerYatagiIkiliDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[7]")
    public WebElement page4YerYatagiCocukDecrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 mr-3'])[8]")
    public WebElement page4BesikDecrease;


    //4page increase

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[1]")
    public WebElement page4TekKisilikIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[2]")
    public WebElement page4IkiKisilikIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[3]")
    public WebElement page4CocukYatagiIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[4]")
    public WebElement page4BebekYatagiIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[5]")
    public WebElement page4YerYatagiTekliIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[6]")
    public WebElement page4YerYatagiIkiliIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[7]")
    public WebElement page4YerYatagiCocukIncrease;

    @FindBy(xpath = "(//button[@class='btn btn-light border py-1 px-2 ml-3'])[8]")
    public WebElement page4BesikIncrease;

    //page4 Yatak Sayısı

    @FindBy(xpath = "(//span[@class='input-number-value'])[1]")
    public WebElement page4TekKisilikYatakSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[2]")
    public WebElement page4IkiKisilikYatakSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[3]")
    public WebElement page4CocukYatagiSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[4]")
    public WebElement page4BebekYatagiSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[5]")
    public WebElement page4TerYatagiTekliSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[6]")
    public WebElement page4YerYatagiIkiliSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[7]")
    public WebElement page4YerYatagiCocukSayisi;

    @FindBy(xpath = "(//span[@class='input-number-value'])[8]")
    public WebElement page4BesikSayisi;

    //ileri tuşu
    @FindBy(xpath = "//a[@class='btn py-1 bg-light']")
    public WebElement page4IleriTusu;

    //geri Tuşu
    @FindBy(xpath = "//button[@class='btn btn-light py-1']")
    public WebElement page4GeriTusu;

    // 4/10 yazısı
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page4SayfaNumber;

    //__________________________________________________________

    // Page 5:
    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='TV']")
    public WebElement page5TV;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Eve ait özel garaj']")
    public WebElement page5EveAitOzelGaraj;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Wi-Fi']")
    public WebElement page5WIFI;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Bulaşık Makinesi']")
    public WebElement page5BulasikMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Kurutma Makinesi']")
    public WebElement page5KurutmaMakinesi;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Çamaşır Makinesi']")
    public WebElement page5CamasirMakinesi;

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

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Mangal/Barbekü']")
    public WebElement page5Mangal;

    @FindBy(xpath = "//small[@class='pt-1 px-0' and text()='Klima']")
    public WebElement page5Klima;

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

    // Page 6:
    @FindBy(xpath = "//a[@href='/']")
    public WebElement page6KeseLogo;

    @FindBy(xpath = "//h2")
    public WebElement page6AciklamaHeader;

    @FindBy(xpath = "//p")
    public WebElement page6Parag;

    @FindBy(css = "#home")
    public WebElement page6textArea;

    @FindBy(xpath = "//a[text()='İlanlarım']")
    public WebElement page6IlanLink;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page6PageNum;

    // Page 7:
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


    public boolean clickable(String selection) {
        Boolean flag = false;

        switch (selection) {

            case "Lunapark":
                flag = page7LunaPark.isEnabled();
                break;
            case "Plaj":
                flag = page7Plaj.isEnabled();
                break;
            case "Bisiklet Yolu":
                flag = page7BisikletYolu.isEnabled();
                break;
            case "Müze":
                flag = page7Muze.isEnabled();
                break;
            case "Balık Tutma":
                flag = page7BalikTutma.isEnabled();
                break;
            case "Kayak Yapma":
                flag = page7KayakYapma.isEnabled();
                break;
            case "Spor Salonu":
                flag = page7SporSalonu.isEnabled();
                break;
            case "Doğa Yürüyüşü":
                flag = page7DogaYuruyusu.isEnabled();
                break;
            case "Ünlü Meydan":
                flag = page7UnluMeydan.isEnabled();
                break;
            case "Çocuk Parkı":
                flag = page7CocukParki.isEnabled();
                break;
            case "Helal Restorant":
                flag = page7HelalRestorant.isEnabled();
                break;
            case "AVM":
                flag = page7Avm.isEnabled();
                break;
            case "Sinema":
                flag = page7Sinema.isEnabled();
                break;
            case "Camii & Dernek":
                flag = page7CamiiDernek.isEnabled();
                break;
        }

        return flag;
    }

    public void clickAnySelection(String selection) {


        switch (selection) {

            case "Lunapark":
                page7LunaPark.click();
                break;
            case "Plaj":
                page7Plaj.click();
                break;
            case "Bisiklet Yolu":
                page7BisikletYolu.click();
                break;
            case "Müze":
                page7Muze.click();
                break;
            case "Balık Tutma":
                page7BalikTutma.click();
                break;
            case "Kayak Yapma":
                page7KayakYapma.click();
                break;
            case "Spor Salonu":
                page7SporSalonu.click();
                break;
            case "Doğa Yürüyüşü":
                page7DogaYuruyusu.click();
                break;
            case "Ünlü Meydan":
                page7UnluMeydan.click();
                break;
            case "Çocuk Parkı":
                page7CocukParki.click();
                break;
            case "Helal Restorant":
                page7HelalRestorant.click();
                break;
            case "AVM":
                page7Avm.click();
                break;
            case "Sinema":
                page7Sinema.click();
                break;
            case "Camii & Dernek":
                page7CamiiDernek.click();
                break;
        }

    }

    //Page 8--------------------------------------------------------
    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page8navigationBar;

    @FindBy(xpath = "//div/h2[contains(text(), 'Özel Şartlar')]")
    public WebElement page8OzelSartlrYazisi;

    @FindBy(xpath = "//*[contains(text(),'Odanıza ait')]")
    public WebElement page8OdanizaAitOzelSartalrYazisi;

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

// Page 9-------------------------------------------------

    @FindBy(xpath = "//*[contains(text(),'İlerle')]")
    public WebElement ilerleButton ;

    @FindBy(xpath = "//button[@id='next']")
    public WebElement geriButton ;

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement theNumberOfPage;

    @FindBy(xpath = "//div[@class='px-3 py-2']/h2")
    public WebElement pageTitleText;

    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[1]")
    public WebElement pageInfoText;

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement page9InputCalenderBox;

    @FindBy(xpath = "//div[@class='react-datepicker__day-name' and text()='Su']")
    public WebElement page9CalendarPageSu;

    //    Seçtiğiniz Tarihler
    @FindBy(xpath = "(//div[@class='px-3 py-2']/p)[2]")
    public WebElement page9BookedDate;

    @FindBy(xpath = "//div[@class='col-12 px-0']")
    public WebElement page9BookedDateSummary;

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page9CancelButton;

    @FindBy(xpath = "//*[@tabindex=0]")
    public WebElement todaysDateLocator;

    // Page 10:

    @FindBy(xpath = "//div[@class='navbar-nav me-auto fs-3']")
    public WebElement page10locationStepTextBox;

    @FindBy(xpath = "//h2[contains(text(),'Resim ve Fotoğraflar')]")
    public WebElement page10TitleName;

    @FindBy(xpath = "//p[contains(text(),'Evinizde müsait olan odaların ve/veya kullandırmak')]")
    public WebElement page10ExplainTextBox;

    @FindBy(xpath = "//button[normalize-space()='Resimleri Seçin']")
    public WebElement page10SelectedPictureButton;

    @FindBy(xpath = "//button[contains(text(),'Tüm Resimleri Kaldır')]")
    public WebElement page10RemoveAllPicturesButton;

    @FindBy(xpath = "//small[normalize-space()='En az 5 en fazla 10 resim yükleyebilirsiniz.']")
    public WebElement page10UploadMinimumAndMaximumImages;

    @FindBy(xpath = "//div[@class='d-flex flex-column align-items-center']//i[@class='far fa-3x fa-image']")
    public WebElement page10UploadingFirstImage;

    @FindBy(xpath = "//label[contains(@for,'file-upload2')]//i[contains(@class,'far fa-3x fa-image')]")
    public WebElement getPage10UploadingSecondImage;

    @FindBy(xpath = "//*[contains(text(), 'İlanı Yayınla')]")
    public WebElement step10_publishAdButton; // ilani yayinla butonu

    @FindBy(xpath = "//*[contains(text(), 'Resim Ekle')]")
    public WebElement step10_addImageText; // resim ekle yazisinin ortak locatoru.

    @FindBy(css = ".border div.rounded")

    public List<WebElement> step10_loadedImages;   // Tum yuklenmis resimlerin listesi

    @FindBy(css = "div.col-6 div")
    public List<WebElement> step10_imageFrames;    // Resim ekleme cerceveleri


    // 10. Sayfaya kadar Minimum Gereksinimlerle ulasan kodlar icin gerekli locatorlar
    //------------------------------------------------------------------------------------
    // Main Page
    @FindBy(id = "dropdownMenuButton")
    public WebElement dropdownMenuButton;   // Ilan Ver butonu
    // Main Page
    @FindBy(xpath = "//*[contains(text(),' Ev Değişimi')]")
    public WebElement homeExchangeOption; // Ilan ver butonunda  -> Ev degisimi secenegi
    // common for all pages
    @FindBy(xpath = "//*[contains(text(),'İlerle')]")
    public WebElement nextButton;   // ilerle butonu
    // 1st page
    @FindBy(xpath = "//*[contains(text(),'Müstakil Ev')]")
    public WebElement houseButton;  // Ev Tipi sayfasinda(sayfa1) -> Müstakil Ev
    // 2nd page
    @FindBy(xpath = "//*[contains(text(),'Select...')]")
    public WebElement selectText;
    // 2nd page
    @FindBy(id = "react-select-2-input")
    public WebElement selectTextButton;
    // 2nd page
    @FindBy(className = "form-check-input")
    public WebElement checkBox;
    // 3rd page
    @FindBy(id = "size")
    public WebElement sizeOfAreaUp;
    // 4th page
    @FindBy(className = "ml-3")
    public WebElement plus;
    // 5th page
    @FindBy(xpath = "//*[contains(text(),'TV')]")
    public WebElement tvText;
    // 6th page
    @FindBy(id = "home")
    public WebElement homeExplanation;
    // 7th page
    @FindBy(xpath = "//*[contains(text(),'Müze')]")
    public WebElement museumText;

    // 8th page-------------------------------------------------------------------
    @FindBy(xpath = "//*[contains(text(),'Evet')]")
    public List<WebElement> yesTexts;

    @FindBy(xpath = "//*[contains(text(),'Hayır')]")
    public List<WebElement> noTexts;

    // 9th page--------------------------------------------------------------------
    @FindBy(xpath = "(//div[@class='react-datepicker__input-container'])[1]")
    public WebElement selectTheDates;

    @FindBy(xpath = "//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--previous']")
    public WebElement selectPreviousMonthNavigationIcon;

    @FindBy(xpath = "//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']")
    public WebElement selectNextMonthNavigationIcon;


    // US55 icin cogu locatorlar kullanilamadigi icin gerekli locaterlar yeniden olusturuldu

    @FindBy(xpath = "//*[text() = 'Müstakil Ev']/../../div")
    public WebElement step1_MustakilEvOption;

    @FindBy(xpath = "//*[text() = 'Apartman Dairesi']/../../div")
    public WebElement step1_ApartmanDairesiOption;

    @FindBy(xpath = "//*[text() = 'Stüdyo Daire']/../../div")
    public WebElement step1_StudyoDaireOption;

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

    @FindBy(xpath = "//*[@tabindex='0']")
    public WebElement step9_TodaysDateOption;

    @FindBy(xpath = "//button[@aria-label='Next Month']")
    public WebElement clickNextMonthArrow;

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

    @FindBy(xpath = "//*[contains(text(), 'Fotoğrafları Kaydet')]")
    public WebElement step10_FotograflariKaydetButton;

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

    @FindBy(xpath = "//div[@class='col-12 px-0']")
    public WebElement page9SelectedDateSummary;

    @FindBy(xpath = "//button[@class='btn btn-danger rounded px-2 py-1 ']")
    public WebElement page9XButton; //Cancel the picked date Button

    @FindBy(xpath = "//input[@placeholder='Tarih seçmek için tıklayınız']")
    public WebElement page9clickOnDate;

    @FindBy(xpath = "//p[@class='pt-3 false']")
    public WebElement page9SectiginizTarihler;


}
