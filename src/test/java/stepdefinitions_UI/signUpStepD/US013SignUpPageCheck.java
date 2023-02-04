package stepdefinitions_UI.signUpStepD;

import com.kese.pages.UI.MainPage;
import com.kese.pages.UI.SignUpPage;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US013SignUpPageCheck {
    SignUpPage signUpPage = new SignUpPage();
    MainPage mainPage = new MainPage();

    @Given("Kullanici {string} sayfasina gider")
    public void ukullaniciSayfasinaGider(String loginPageUrl) {

        Driver.get().get(loginPageUrl);
    }

    @When("the user clicks Giris Yap button")
    public void the_user_clicks_Giris_Yap_button() {
        mainPage.girisYapButtonRightTop.click();
    }

    @And("the user clicks Kayit Ol button")
    public void theUserClicksKayitOlButton() {
        signUpPage.kayitOlButton.click();
    }

    @And("the system redirects the user to {string} page")
    public void theSystemRedirectsTheUserToPage(String signupPageUrl) {
        Driver.get().get(signupPageUrl);

    }

    @Given("Kullanici {string} yerine {string} yazar")
    public void kullaniciYerineYazar(String arg0, String arg1) {
        signUpPage.kullaniciAdi.sendKeys(ConfigurationReader.get("kullaniciAdiKayitOlPage"));
        Assert.assertTrue("Kullanıcı Adı", signUpPage.kullaniciAdi.isDisplayed());
    }

    @Given("Kullanici email@gmail.com kismina admin@gmail.com girilir")
    public void kullaniciEmailGmailComKisminaAdminGmailComGirilir() {
        signUpPage.emailAdres.sendKeys(ConfigurationReader.get("emailadresiKayitOlPage"));
        Assert.assertTrue("email@gmail.com", signUpPage.emailAdres.isDisplayed());
    }

    @Given("Kullanici Sifre kismina Admin{int}.girilir")
    public void kullaniciSifreKisminaAdminGirilir(int arg0) {
        signUpPage.sifreBox.sendKeys(ConfigurationReader.get("sifreKayitOlPage"));
        Assert.assertTrue("Şifre", signUpPage.sifreBox.isDisplayed());
    }

    @Given("Kullanici bir onceki adimda girdigimiz sifre Admin{int}.buraya da girilir")
    public void kullaniciBirOncekiAdimdaGirdigimizSifreAdminBurayaDaGirilir(int arg0) {
        signUpPage.sifreTekrariBox.sendKeys(ConfigurationReader.get("sifreTekrarKayitOlPage"));
        Assert.assertTrue("Şifre tekrarı", signUpPage.sifreTekrariBox.isDisplayed());

    }

    @Given("default email adresinde email@gmail.com yazili oldugunu kontrol edilir")
    public void defaultEmailAdresindeEmailGmailComYaziliOldugunuKontrolEdilir() {
        Assert.assertTrue("email@gmail.com", signUpPage.emailAdres.isDisplayed());

    }

}
