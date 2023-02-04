package stepdefinitions_UI.mainPage;

import com.kese.pages.UI.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US001_MainPageSloganStepD {


    @Then("the user verifies that the message {string} is visible")
    public void theUserVerifiesThatTheMessageIsVisible(String text) {

        Assert.assertTrue(new MainPage().slogan.isDisplayed());
        System.out.println(text);

    }


}
