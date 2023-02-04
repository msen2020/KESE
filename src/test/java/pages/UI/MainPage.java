package pages.UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

public class MainPage extends CommonPage {

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    @FindBy(xpath = "(//span[@class='tabtext ps-1 mt-2 mt-md-0 font-weight-semi-bold'])[3]")
    public WebElement CargoButton;

    @FindBy(xpath = "//span[text()='Kargo göndermek istediğiniz noktayı seçiniz']")
    public WebElement Cargomessage;

    @FindBy(xpath = "//a[contains(text(),'Kese Ne Sunar ?')]")
    public WebElement KeseNeSunarText;


    // @FindBy(css = ".ms-3.btn.py-2.bg-white.border.d-inline")
    // public  WebElement LogButton;


    @FindBy(xpath = "//h2[text()='Popüler İlanlar']")
    public WebElement headerPopIlan;

    @FindBy(xpath = "//div[@class='tab-pane  active show']//a")
    public WebElement activeTab;

    @FindBy(xpath = "//h1[text()='Seyahatin Tadını Çıkartın!']")
    public WebElement slogan;

    @FindBy(xpath = "//a[text()='Giriş Yap']")
    public WebElement girisYapButtonRightTop;//sag ust taraf

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisYapButton;

    //is Displayed method
    public static boolean linkTextIsDisplayed(String link) {
        By linkText = By.linkText(link);
        return BrowserUtils.isDisplayed(linkText);
    }

    //click method
    public static void clickLinktext(String link) {
        By element = By.linkText(link);
        BrowserUtils.myClickMethod(element);
    }

    //US04 e ait locatorlar
    @FindBy(xpath = "(//span[@class='tabtext  ps-1 mt-2 mt-md-0 font-weight-semi-bold'])[1]")
    public WebElement birlikteSeyehatButton;

    @FindBy(xpath = "//span[@class='d-block text-gray-1 font-weight-normal text-left mb-0']")
    public WebElement seyehatEtmekIstediginizYeriSecinizText;

    @FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
    public WebElement selectDropDown;

    @FindBy(xpath = "(//span[@class='tabtext mt-2 mt-md-0 font-weight-semi-bold'])[4]")
    public WebElement bed;

    @FindBy(xpath = "//span[@class='d-block text-gray-1 font-weight-normal text-left mb-0']")
    public WebElement gitmek;

    @FindBy(linkText = "//i[@class='fas fa-home mr-1']")
    public WebElement ilanVer;

    @FindBy(xpath = "//a[@class='border d-flex align-items-center btn btn-white py-2  ']")
    public WebElement profilim;

    @FindBy(xpath = "(//span[text()='Oda Kirala'])[1]")
    public WebElement odaKiralaButton;

    @FindBy(xpath = "//span[text()='Oda değişimi yapmak istediğiniz yer']")
    public WebElement odaDegisimiYapmakIstediginizYerText;

    @FindBy(xpath = "//*[contains(text(),'Gitmek istediğiniz Yer')]")
    public WebElement gitmekIstediginizYerText;

    public void clickPopulerMenu(String menuTitle) {

        String menuTitleLocatorText = "//span[text()='" + menuTitle + "']";

        WebElement menuTitleLocator = Driver.get().findElement(By.xpath(menuTitleLocatorText));

        menuTitleLocator.click();

    }

    //Main page Evdegisimi locators
    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisyapButtonu;

    @FindBy(xpath = "(//span[@class='tabtext ps-1 mt-2 mt-md-0 font-weight-semi-bold'])[1]")
    public WebElement evDegisimiButton; // below the Slogan "Seyahatin Tadını Çıkartın!"

    @FindBy(xpath = "//span[.='Ev değişimi yapmak istediğiniz yer']")
    public WebElement evDegisimiYeriText;

    @FindBy(xpath = "//div[@class='css-1g6gooi']/div/input")
    public WebElement ilanAraInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ilanAraButton;

    @FindBy(xpath = "//h5")
    public WebElement ilanResultText;

    @FindBy(xpath = "//a[@id='dropdownMenuButton']")
    public WebElement ilanVerDropdownMenu;

    @FindBy(xpath = "(//*[contains(text(),' Bed & Breakfast')])[2]")
    public WebElement bedAndBreakfastOption;//DropDown Menu- Ilan Ver

    @FindBy(xpath = "(//*[contains(text(),' Bed & Breakfast')])[2]")
    public WebElement bedAndBreakfastOption2;

    @FindBy(xpath = "(//span[@class='tabtext  ps-1 mt-2 mt-md-0 font-weight-semi-bold'])[2]")
    public WebElement bedAndBreakfastOption3; //Title Main Page

    @FindBy(xpath = "//(//*[contains(text(),'Bed & Breakfast')])[3]")
    public WebElement getBedAndBreakfastOptionPopulerIlanlar;

    @FindBy(xpath = "//a[contains(text(),' Kargo')]")
    public WebElement kargoOption; // Kargo option in "ilan Ver" menu

}



