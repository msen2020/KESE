package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class US34KeseEvDegisimiPage2StepD {

    EvDegisimiPage evDegisimiPage = new EvDegisimiPage();

    @And("user verifies that ilerle button should not be clickable")
    public void userVerifiesThatIlerleButtonShouldNotBeClickable() {

        Assert.assertTrue(evDegisimiPage.ilerleButton.isEnabled());

    }
}
