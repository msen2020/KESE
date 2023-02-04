package stepdefinitions_UI.birlikteSeyahat;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.UI.BirlikteSeyahatPage;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class US127_Birlikte_Seyahat_Step2_StepD {

    BirlikteSeyahatPage birlikteSeyahatPage = new BirlikteSeyahatPage();

    @Given("user on the page two {string}")
    public void userOnThePageTwo(String expectedPageNumber) {

        Assert.assertTrue(expectedPageNumber.contains(birlikteSeyahatPage.theNumberOfThePage3.getText()));
    }

    @Then("user confirm that page title text is visible")
    public void userConfirmThatPageTitleTextIsVisible() {
        Assert.assertTrue(birlikteSeyahatPage.topText.isDisplayed());
    }

    @And("user confirm that explain section is visible")
    public void userConfirmThatExplainSectionIsVisible() {
        Assert.assertTrue(birlikteSeyahatPage.secondText.isDisplayed());
    }

    @And("user confirm that starting point is selectable")
    public void userConfirmThatStartingPointIsSelectable() {
        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.firstTextBox, "Ann");
        birlikteSeyahatPage.chooseOption.click();
        Assert.assertTrue(birlikteSeyahatPage.firstTextBoxValidation.getText().contains("Ba"));

    }

    @And("user confirm that ending point is selectable")
    public void userConfirmThatEndingPointIsSelectable() {

        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.secondTextBox, "Fair");
        birlikteSeyahatPage.chooseOption.click();
        Assert.assertTrue(birlikteSeyahatPage.secondTextValidation.getText().contains("Biti"));
    }

    @And("user confirm thar passing point is selectable")
    public void userConfirmTharPassingPointIsSelectable() throws InterruptedException {

        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.thirdTextBox, "Grea");
        birlikteSeyahatPage.chooseOption.click();

        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.fifthTextBox, "Del");
        birlikteSeyahatPage.chooseOption.click();

        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.sixthTextBox, "Bos");
        birlikteSeyahatPage.chooseOption.click();

        BrowserUtils.waitAndSendKeys(birlikteSeyahatPage.seventhTextBox, "Las");
        birlikteSeyahatPage.chooseOption.click();
    }

    @And("user confirm that selected passing point should be visible as a list")
    public void userConfirmThatSelectedPassingPointShouldBeVisibleAsAList() throws InterruptedException {
        BrowserUtils.waitUntilVisibilityOfAllElements(birlikteSeyahatPage.addPassListelements);

        List<WebElement> elementList = birlikteSeyahatPage.addPassListelements;
        System.out.println("before element list size: " + elementList.size());

        for (WebElement e : elementList) {
            System.out.println("element name: " + e.getText());
        }

        System.out.println("after element list size: " + elementList.size());
        Assert.assertTrue(elementList.get(0).getText().contains("Great Falls"));
        Assert.assertTrue(elementList.get(1).getText().contains("Delaware"));
        Assert.assertTrue(elementList.get(2).getText().contains("Boston"));
        Assert.assertTrue(elementList.get(3).getText().contains("Las Vegas"));
    }

    @And("user confirm that passing points are deletable")
    public void userConfirmThatPassingPointsAreDeletable() throws InterruptedException {
        //Thread.sleep(2000);

        List<WebElement> deleteElementList = birlikteSeyahatPage.deleteElements;

        ArrayList<WebElement> arrayElements = new ArrayList<>(deleteElementList);


        for (int i = 0; i < arrayElements.size(); i++) {
            BrowserUtils.waitAndClick(arrayElements.get(0));
        }

        System.out.println("after element list deleted, list size; " + deleteElementList.size());

        Assert.assertEquals(0, deleteElementList.size());
    }
}
