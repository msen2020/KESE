package stepdefinitions_UI.birlikteSeyahat;

import com.kese.pages.UI.BirlikteSeyahatPage;
import com.kese.utilities.BrowserUtils;
import com.kese.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US135_BirlikteSeyahatPage6StepD {
    BirlikteSeyahatPage birlikteSeyahatPage= new BirlikteSeyahatPage();

    @Then("step number {string} should be displayed on the birlikteSeyahat Page")
    public void step_number_should_be_displayed_on_the_birlikteSeyahat_Page(String expectedPageNum) {
        assertEquals(expectedPageNum,birlikteSeyahatPage.theNumberOfPage.getText());
    }

    @Then("verify {string} displays as a header on the 6th step of the birlikteSeyahatPage")
    public void verify_displays_as_a_header_on_the_6th_step_of_the_birlikteSeyahatPage(String expectedHeaderText) {
        System.out.println("birlikteSeyahatPage.pageTitleText.getText() = " + birlikteSeyahatPage.pageTitleText.getText());
        assertEquals(expectedHeaderText,birlikteSeyahatPage.pageTitleText.getText());

    }

    @Then("verify {string} text is displayed as info at 6th step of the birlikteSeyahatPage")
    public void verify_text_is_displayed_as_info_at_6th_step_of_the_birlikteSeyahatPage(String expectedText) {
        String actualText = birlikteSeyahatPage.pageInfoText.getText();
        assertEquals(expectedText,actualText);

    }


    @When("user clicks {string} button on the 6th step of the birlikteSeyahatPage")
    public void user_clicks_button_on_the_6th_step_of_the_birlikteSeyahatPage(String buttonName) {
        if(buttonName.equals("Resimleri Kaydet")){
            birlikteSeyahatPage.page6ResimleriKaydetBtn.click();
        }else if(buttonName.equals("Geri")){
            birlikteSeyahatPage.page6GeriBtn.click();
        }else if(buttonName.equals("Tüm Resimleri Kaldır")){
            birlikteSeyahatPage.Page6_TumResimleriKaldirButton.click();
        }

    }

    @Then("verify {string} text is displayed on the 6th step")
    public void verify_text_is_displayed_on_the_6th_step(String expectedText) {
        assertEquals(expectedText,birlikteSeyahatPage.missingInfoWarningText.getText());
    }


    @Then("user should be on the {string} step of the birlikteSeyahatPage")
    public void user_should_be_on_the_step_of_the_birlikteSeyahatPage(String expectedPageNum) {
        assertEquals(expectedPageNum,birlikteSeyahatPage.theNumberOfPage.getText());
    }

    @When("user adds {int} pictures on the birlikteSeyahatPage at 6th step")
    public void user_adds_pictures_on_the_birlikteSeyahatPage_at_6th_step(Integer expectedPicNum) {
        String projectPath=System.getProperty("user.dir");
        for(int i=1; i<= expectedPicNum; i++) {
            String filePath = "src/test/resources/pictures/car"+i+".jpg";
            String fullPath= projectPath+"/"+filePath;
            WebElement picPath= Driver.get().findElement(By.id("file-upload"+i));
            BrowserUtils.waitFor(2);
            picPath.sendKeys(fullPath);
        }

    }

    @Then("verify in the system has {int} pics to the birlikteSeyahatPage")
    public void verify_in_the_system_has_pics_to_the_birlikteSeyahatPage(int expectedPicNum) {
        int numOfPics= birlikteSeyahatPage.page6AddedPics.size();
        System.out.println("birlikteSeyahatPage.page6AddedPics = " + birlikteSeyahatPage.page6AddedPics.size());
        assertEquals(expectedPicNum,numOfPics);
    }


    @Then("system should display İlani Yayinla button on the 6th step of the birlikteSeyahatPage")
    public void system_should_display_ilani_yayinla_button_on_the_6th_step_of_the_birlikteSeyahatPage() {
        assertTrue(birlikteSeyahatPage.page6IlaniYayinlaBtn.isDisplayed());
    }



}
