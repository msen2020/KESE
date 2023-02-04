package stepdefinitions_UI.evDegisimiStepD;

import com.kese.pages.UI.EvDegisimiPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US046_HomeExchangePage8StepD {

    EvDegisimiPage page = new EvDegisimiPage();

    @Then("user asserts ilerle button is visible")
    public void userAssertsIlerleButtonIsVisible() {
        Assert.assertTrue(page.ilerleButton.isDisplayed());
    }

    @Then("user asserts ilerle button should not be clickable as a default")
    public void userAssertsIlerleButtonShouldNotBeClickableAsADefault() {
        page.ilerleButton.click();

        Assert.assertTrue(page.ilerleButton.isEnabled());

    }

    @Then("user asserts ilerle button should not be clickable if required informations are not filled")
    public void userAssertsIlerleButtonShouldNotBeClickableIfRequiredInformationsAreNotFilled() {
        page.ilerleButton.click();

        Assert.assertTrue(page.LutfenOzelSartlarSecinizUyarisi.isDisplayed());

    }

    @Then("user asserts ilerle button should be clickable if required informations are filled")
    public void userAssertsIlerleButtonShouldBeClickableIfRequiredInformationsAreFilled() {
        page.page8CocuklarinizgetirebilirsinizEVET.click();
        page.page8EvcilhayvanlarigetirebilirsinizEVET.click();
        page.page8EvdeSigaraIcmeyeIzinVerilirEVET.click();
        page.page8ArabaDegisimiOlabilirEVET.click();
        page.page8BakilmasiGerekEvcilHayvanEVET.click();
        page.page8BakilmasiGerekenBitkiEVET.click();

        Assert.assertTrue(page.ilerleButton.isEnabled());
    }
}
