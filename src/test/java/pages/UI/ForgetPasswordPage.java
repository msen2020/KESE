package pages.UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

public class ForgetPasswordPage extends CommonPage {


    @FindBy(xpath = "//input[@class='form-control ']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@placeholder='E-mail adresinizi giriniz']")
    public WebElement emailButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sifremiDegistirButton;

    @FindBy(xpath = "//*[contains(text(),'Şifremi Değiştir')]")
    public WebElement sifremiDegistirText;

    @FindBy(linkText = "//*[contains(text(),'Giriş Sayfasına Git')]")
    public WebElement girisSayfasinaGitLink;

    @FindBy(xpath = "//*[contains(text(),'Girmiş olduğunuz email')]")
    public WebElement sifreSifirlamaLinkiGonderildiText;

    @FindBy(xpath = "//*[contains(text(),'Şifremi Unuttum')]")
    public WebElement sifremiUnuttumButton;

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement girisyapButtonu;

    @FindBy(xpath = "//h4[@class='text-center card-title mb-4']")
    public WebElement titleSifreYenileme;

    @FindBy(xpath = "//a[@href='/forgot_password']")
    public WebElement sifremiUnuttumLinkk;

    public static final By sifremiUnuttumLink = By.xpath("//a[contains(text(),'Şifremi Unuttum')]");

    public static String getMyText() {

        return Driver.get().findElement(sifremiUnuttumLink).getText();

    }

    public static boolean linkIsEnabled(String link) {
        By linkText = By.linkText(link);
        return BrowserUtils.isEnabled(linkText);

    }
}