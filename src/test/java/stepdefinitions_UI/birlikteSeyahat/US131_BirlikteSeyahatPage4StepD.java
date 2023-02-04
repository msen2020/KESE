package stepdefinitions_UI.birlikteSeyahat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UI.BirlikteSeyahatPage;
import utilities.BrowserUtils;

public class US131_BirlikteSeyahatPage4StepD {

    BirlikteSeyahatPage bsPage = new BirlikteSeyahatPage();


    @Given("{string} text is displayed")
    public void textIsDisplayed(String text) {
        Assert.assertTrue(bsPage.isDisplayedText(text));
    }

    @Given("Yaş Aralığı should be selectable up to {int}")
    public void yaşAralığıShouldBeSelectableUpTo(int ageRange) {
        if (ageRange < 8) {
            for (int i = 1; i <= ageRange; i++) {
                bsPage.clickPage4AgeRange(i);
                BrowserUtils.waitFor(1);
                Assert.assertTrue(bsPage.greenPage4AgeRangeDisplayed(i));
            }
        }
    }

    @When("Yaş Aralığı selected as {int} farketmez other choices can not be selected")
    public void yaşAralığıSelectedAsFarketmezOtherChoicesCanNotBeSelected(int ageRange) {
        if (ageRange == 8) {
            bsPage.clickPage4AgeRange(ageRange);
            for (int i = 2; i < ageRange; i++) {
                Assert.assertTrue(bsPage.isDisplayedPage4AgeRange(i));
            }
        }
    }

    @Then("Verify selected only farketmez")
    public void verifySelectedOnlyFarketmez() {
        Assert.assertTrue(bsPage.greenpage4GenderFarketmez.isDisplayed());
        for (int i = 1; i <= 8; i++) {
            Assert.assertTrue(bsPage.isDisplayedPage4AgeRange(i));
        }
    }

    @Given("user should be able to select from {int} to {int} number")
    public void userShouldBeAbleToSelectFromToNumber(int min, int max) {
        for (int i = min; i <= max; i++) {
            bsPage.page4KisiSayisiIncrement.click();
        }
        Assert.assertEquals("15", bsPage.page4KisiSayisiValue.getText());
    }

    @Given("Cinsiyet should be selectable only {string} and {string}gender")
    public void cinsiyetShouldBeSelectableOnlyAndGender(String cinsiyet, String num) {

        bsPage.clickPage4Gender(cinsiyet, num);
        Assert.assertTrue(bsPage.enablePage4Gender(cinsiyet, num));
    }

    @Then("verify user select only one {string} choice")
    public void verifyUserSelectOnlyOneAndChoice(String cinsiyet) {
        switch (cinsiyet) {
            case "Kadin":
                bsPage.clickPage4Gender("Kadin", "1");
                System.out.println(bsPage.displayedGreenPage4Gender("Kadin", "1"));
                System.out.println(bsPage.enablePage4Gender("Erkek", "1"));
                Assert.assertTrue(bsPage.displayedGreenPage4Gender("Kadin", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Erkek", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Farketmez", "2"));
                break;
            case "Erkek":
                bsPage.clickPage4Gender("Erkek", "1");
                Assert.assertTrue(bsPage.displayedGreenPage4Gender("Erkek", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Kadin", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Farketmez", "2"));
                break;
            case "Farketmez":
                bsPage.clickPage4Gender("Farketmez", "2");
                Assert.assertTrue(bsPage.displayedGreenPage4Gender("Farketmez", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Kadin", "1"));
                Assert.assertTrue(bsPage.enablePage4Gender("Erkek", "1"));
                break;
        }
    }
}



