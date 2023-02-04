package pages.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

public class SignUpPage extends CommonPage {


    @FindBy(xpath = "//a[@href='/usage']")
    public WebElement usage;

    @FindBy(xpath = "//a[@href='/privacy']")
    public WebElement privacy;

    @FindBy(id = "inputUsername")
    public WebElement inputUsername;

    @FindBy(id = "staticEmail")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//input[@id='sifre']")
    public WebElement signupPasswordBox;

    @FindBy(id = "sifreTekrar")
    public WebElement reInputPassword;

    @FindBy(id = "flexCheckChecked")
    public WebElement privacyPolicyCheckBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton; //Kayit olustur butonu

    @FindBy(xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButtonOnSignInPage;

    @FindBy(className = "btn-danger")
    public WebElement kayitOl;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement SignupUserInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement kayitOlusturButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement CheckBox;

    @FindBy(xpath = "//*[contains(text(),'Kaydınız oluşturuldu, giriş')]")
    public WebElement kaydinizOlusturulduText;

    @FindBy(xpath = "//div[@class='text-center py-3']")
    public WebElement sifrelerUyusmuyorText;


    private static final By girisYapButton = By.linkText("Giriş Yap");

    public static boolean girisYapButtonIsDisplayed() {
        return BrowserUtils.isDisplayed(girisYapButton);

    }

    public static boolean girisYapButtonIsEnabled() {
        return BrowserUtils.isEnabled(girisYapButton);

    }

    //Right top Giris Yap Button
    public static void clickGirisYapButton() {
        BrowserUtils.myClickMethod(girisYapButton);

    }

    @FindBy(xpath = "//a[@href='/signup']")
    public WebElement kayitOlButton;

    @FindBy(xpath = "//*[@id=\"inputUsername\"]")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//*[@id=\"staticEmail\"]")
    public WebElement emailAdres;

    @FindBy(xpath = "//*[@id='sifre']")
    public WebElement sifreBox;

    @FindBy(xpath = "//*[@id='sifreTekrar']")
    public WebElement sifreTekrariBox;

}
