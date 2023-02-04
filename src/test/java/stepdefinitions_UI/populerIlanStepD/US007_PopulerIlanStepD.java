package stepdefinitions_UI.populerIlanStepD;

import com.kese.pages.UI.MainPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US007_PopulerIlanStepD {

    WebDriver driver = Driver.get();
    MainPage mainPage = new MainPage();

    @Then("the user verifies that the text Populer Ilanlar is displayed on the homepage")
    public void theUserVerifiesThatTheTextPopulerIlanlarIsDisplayedOnTheHomepage() {
        String text = mainPage.headerPopIlan.getText();
        System.out.println("text = " + text);
        Assert.assertEquals("Popüler İlanlar", text);
    }

    @Then("system should display options on the homepage")
    public void system_should_display_options_on_the_homepage(List<String> expectedOptions) {
        System.out.println("expectedOptions = " + expectedOptions);

        List<String> actualOptions = new ArrayList<>();

        for (String expectedOption : expectedOptions) {
            WebElement element;
            element = driver.findElement(By.xpath("//span[@class='tabtext font-weight-semi-bold'][.='" + expectedOption + "']"));
            String textOfOp = element.getText();
            actualOptions.add(textOfOp);

        }

        System.out.println("actualOptions = " + actualOptions);
    }

    @When("click {string} on the homepage")
    public void click_on_the_homepage(String option) {
        BrowserUtils.waitFor(1);
        String path = "//span[@class='tabtext font-weight-semi-bold'][.='" + option + "']";
        BrowserUtils.scrollToElement(driver.findElement(By.xpath(path)));
        //driver.findElement(By.xpath(path)).getText();
        BrowserUtils.waitFor(1);
        driver.findElement(By.xpath(path)).click();

        String mediumActive = mainPage.activeTab.getAttribute("class");
        Assert.assertFalse(mediumActive.contains("medium active"));
        System.out.println("mediumActive= " + mediumActive);

    }

    @When("system redirects from homepage to {string} pages")
    public void system_redirects_from_homepage_to_pages(String partOfUrl) {
        String hrefOfTab = mainPage.activeTab.getAttribute("href");
        Assert.assertTrue(hrefOfTab.contains(partOfUrl));

    }


}
