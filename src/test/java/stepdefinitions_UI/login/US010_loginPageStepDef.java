package stepdefinitions_UI.login;

import com.kese.pages.UI.LoginPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.kese.pages.UI.LoginPage.emailBox;

public class US010_loginPageStepDef {

    LoginPage page = new LoginPage();

    @Given("user is on {string} login page")
    public void userIsOnLoginPage(String loginPageUrl) {

        Driver.get().get(loginPageUrl);
    }

    @And("User can click to email input")
    public void userCanClickToEmailInput() {

        emailBox.click();
        Assert.assertTrue(emailBox.isEnabled());
    }

    @Then("User can write {string} in the email input")
    public void userCanWriteInTheEmailInput(String email) {
        emailBox.sendKeys(email);
        Assert.assertTrue(emailBox.isDisplayed());
    }

    @And("User can click to sifre input")
    public void userCanClickToSifreInput() {
        page.loginSifre.click();
        Assert.assertTrue(page.loginSifre.isEnabled());
    }

    @Then("User can write {string} in the sifre input")
    public void userCanWriteInTheSifreInput(String sifre) {
        page.loginSifre.sendKeys(sifre);
        Assert.assertTrue(page.loginSifre.isDisplayed());
    }

    @Then("Assure the {string} default email text")
    public void assureTheDefaultEmailText(String emailText) {
        System.out.println(emailBox.getAttribute("placeholder"));//Email giriniz
        BrowserUtils.waitFor(2);
        String attributeText = emailBox.getAttribute("placeholder");
        //Assert.assertEquals(attributeText,emailText);
        Assert.assertTrue(attributeText.contains(emailText));
    }

    @Then("Assure the {string} default sifre text")
    public void assureTheDefaultSifreText(String text) {
        System.out.println(page.loginSifre.getAttribute("placeholder"));//Şifrenizi giriniz
        BrowserUtils.waitFor(2);
        String attributeText = page.loginSifre.getAttribute("placeholder");
        Assert.assertEquals(attributeText, text);
        // Assert.assertTrue(attributeText.contains(text));
    }
















/*
        public void elementIsEnable(String str){
                String path = "//a[@href ='/" +str+ "']";
                Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isEnabled());

        }

        public void elementIsDisplayed(String str){
                String path = "//a[@href ='/" +str+ "']";
                Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isDisplayed());

        }
@FindBy(xpath = "//span[@class='tabtext font-weight-semi-bold'][.='Ev Değişimi']")
    public WebElement homeExchangeButtonUnderPopularPosting;
    @FindBy(xpath = "//span[@class='tabtext font-weight-semi-bold'][.='Oda Kirala']")
    public WebElement roomRentalButtonUnderPopularPosting;
public WebElement choosePosting(String postingModule) {

        return Driver.getDriver().findElement
                (By.xpath("//span[@class='tabtext font-weight-semi-bold'][.='"+postingModule+"']"));

    }


*/


}

