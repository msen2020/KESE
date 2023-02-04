package stepdefinitions_UI.forgetPassword;

import com.kese.pages.UI.ForgetPasswordPage;
import com.kese.utilities.ConfigurationReader;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Given;

public class US022_ForgetPasswordPageStepD {

    ForgetPasswordPage fppage = new ForgetPasswordPage();

    @Given("the user is on the Forget Password Page")
    public void theUserIsOnTheForgetPasswordPage() {
        Driver.get().get(ConfigurationReader.get("forgetPassword_url"));

    }
}
