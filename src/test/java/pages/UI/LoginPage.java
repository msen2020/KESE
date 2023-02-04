package pages.UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

public class LoginPage extends CommonPage {


    @FindBy(css = ".ms-3.btn.py-2.bg-white.border.d-inline")
    public WebElement LogButton;

    @FindBy(xpath = "//input[@placeholder='Email giriniz']")
    public static WebElement emailBox;

    @FindBy(xpath = "//input[@placeholder='Şifrenizi giriniz']")
    public static WebElement passwordBox;

    @FindBy(name = "sifre")
    public WebElement loginSifre;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginButtonBelow;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block w-100 ']")
    public WebElement loginPageBelowGirisYapButton;

    @FindBy(xpath = "//a[@href='/signup']")
    public WebElement loginPageKayitOlButton;

    @FindBy(id = "dropdownMenuButton1")
    public WebElement ProfilimButton;

    @FindBy(css = ".dropdown-menu.show")
    public WebElement Dropdown;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[6]")
    public WebElement message;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[7]")
    public WebElement ads;

    @FindBy(xpath = "(//i[@class='fas fa-caret-right'])[8]")
    public WebElement referance;

    @FindBy (css = "#dropdownMenuButton")
    public WebElement ilanVerDropdownMenu;

    @FindBy(xpath = "//a[@href='/forgot_password']")
    public WebElement sifremiUnuttumButton;

    @FindBy (css = ".text-primary.d-none.d-md-block")
    public WebElement undo;


    private static final By submitButton = By.xpath("//button[contains(text(),'Giriş Yap')]");
    private static final By errorMessage = By.xpath("//div[@class='form-group text-center py-1']/small");

    private static final By sifremiUnuttumText = By.xpath("//a[contains(text(),'Şifremi Unuttum')]");

    public static void enterUserName(String userName)  {

        BrowserUtils.mySendKeysMethod((By) emailBox, userName);

    }

    public static String getMyText(){

        return Driver.get().findElement(sifremiUnuttumText).getText();

    }

    public static boolean isMyElementDisplayed(){

        return Driver.get().findElement(sifremiUnuttumText).isDisplayed();

    }

    public static void enterPassword(String password){

        BrowserUtils.mySendKeysMethod((By) passwordBox, password );

    }

    public static void clickSubmitbutton(){

        BrowserUtils.myClickMethod(submitButton);
    }

    public static String getErrorMessage(){

        return BrowserUtils.getSingleElementText(errorMessage);

    }

    public static String getMyPageUrl(){

        return Driver.get().getCurrentUrl();

    }

    public static String getMyCss() {
        return Driver.get().findElement(sifremiUnuttumText).getCssValue("text-decoration");
    }

    public static final By emailInputBox = By.name("email");
    public static final By passwordInputBox = By.name("sifre");

    public void clickItemIlanVerDropdownMenu(String itemName) {

        String ilanVerItemLocator = "//a[.=' " + itemName + "' and @class='dropdown-item']";
        BrowserUtils.waitForClickability(By.xpath(ilanVerItemLocator), 2);
        Driver.get().findElement(By.xpath(ilanVerItemLocator)).click();

    }

    public void clickMenuItemProfilimLink(String itemName) {

        String profilimItemLocator = "//a[.=' " + itemName + " and @class='dropdown-item1']";

        BrowserUtils.waitForClickability(By.xpath(profilimItemLocator), 2);
        WebElement profilimMenuElement = Driver.get().findElement(By.xpath(profilimItemLocator));

        profilimMenuElement.click();

    }


}
