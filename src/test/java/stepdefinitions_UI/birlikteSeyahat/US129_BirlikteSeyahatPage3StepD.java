package stepdefinitions_UI.birlikteSeyahat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UI.BirlikteSeyahatPage;

public class US129_BirlikteSeyahatPage3StepD {

    BirlikteSeyahatPage page3 = new BirlikteSeyahatPage();


    @Then("user verifty that there is a {string} Page Step Number visible on the Birlikte Seyahat three page")
    public void userVeriftyThatThereIsAPageStepNumberVisibleOnTheBirlikteSeyahatTenPage(String expectedText) {
       // String actualPageNum =page3.page3title .getText();
       // assertEquals(expectedText,actualPageNum);
    }

    @Then("user verifty that there is a {string} Page  visible on the Birlikte Seyahat three page")
    public void userVeriftyThatThereIsAPageVisibleOnTheBirlikteSeyahatTenPage(String arg0) {
    }

    @Then("user verifty that there is a {string} Page title visible on the Birlikte Seyahat three page")
    public void userVeriftyThatThereIsAPageTitleVisibleOnTheBirlikteSeyahatTenPag(String arg0) {

    }

    @When("user enters {string} to the {string} inputBox on the {int}th BirlikteSeyahat Page")
    public void userEntersToTheInputBoxOnTheThBirlikteSeyahatPage(String arg0, String arg1, int arg2) {


    }

    @Then("verify system displayed {string} in {string} on the {int}th BirlikteSeyahat Page")
    public void verifySystemDisplayedInOnTheThBirlikteSeyahatPage(String arg0, String arg1, int arg2) {
    }

    @And("user clicks on {string}  on the Birlikte Seyahat ten page")
    public void userClicksOnOnTheBirlikteSeyahatTenPage(String arg0) {


    }

    @Then("assert that other gender options are not selected")
    public void assertThatOtherGenderOptionsAreNotSelected() {
    }
}
