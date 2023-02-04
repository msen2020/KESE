package pages.UI;

import org.openqa.selenium.By;
import utilities.BrowserUtils;

public class LogginPage extends CommonPage{


    private static final By emailBox = By.name("email");
    private static final By passwordBox = By.name("sifre");
    private static final By submitButton = By.xpath("//button[contains(text(),'Giriş Yap')]");
    private static final By errorMessage = By.xpath("//div[@class='form-group text-center py-1']/small");

    public static void entersUserName(String userName)  {

        BrowserUtils.mySendKeysMethod(emailBox, userName);

    }
    public static void enterPassword(String password){

        BrowserUtils.mySendKeysMethod(passwordBox, password );

    }

    public static void clickSubmitbutton(){

        BrowserUtils.myClickMethod(submitButton);
    }

    public static String getErrorMessage(){

        return BrowserUtils.getSingleElementText(errorMessage);

    }

    public static final By emailInputBox = By.name("email");
    public static final By passwordInputBox = By.name("sifre");


}
