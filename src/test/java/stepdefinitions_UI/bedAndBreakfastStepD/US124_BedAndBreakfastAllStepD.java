package stepdefinitions_UI.bedAndBreakfastStepD;

import com.kese.pages.UI.BedAndBreakfastPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US124_BedAndBreakfastAllStepD {

    BedAndBreakfastPage bedAndBreakfastPage=new BedAndBreakfastPage();

    @And("user choose onaltiyirmi, erkek, kisi sayisi iki, ozel oda imkani ve kahvalti as a hayir")
    public void userChooseonaltiyirmiErkekKisiSayisiikiOzelOdaImkaniVeKahvaltiAsAHayir() throws InterruptedException {




        bedAndBreakfastPage.page4Age2.click();
        bedAndBreakfastPage.page4GenderErkek.click();
        bedAndBreakfastPage.page4KisiSayisiIncrement.click();
        bedAndBreakfastPage.page4KisiSayisiIncrement.click();
        bedAndBreakfastPage.page4OzelOdaImkaniHAYIR.click();
        bedAndBreakfastPage.page4KahvaltiHAYIR.click();




    }

    @And("user verifies the yas araligi farketmez, cinsiyet erkek, kisi sayisi iki, ozel oda ve kahvalti hayir")
    public void userVerifiesTheYasAraligiFarketmezCinsiyetErkekKisiSayisiIkiOzelOdaVeKahvaltiHayir() {

        String yasaAraligi = bedAndBreakfastPage.page4Age2.getAttribute("class");
        Assert.assertTrue(yasaAraligi.contains("bg-success"));

        String gender=bedAndBreakfastPage.page4GenderErkek.getAttribute("class");
        Assert.assertTrue(gender.contains("bg-success"));

        String maxKisi = bedAndBreakfastPage.maximumKisiSayisi.getText();
        Assert.assertTrue(maxKisi.contains("2"));

        String ozelOdaImkani= bedAndBreakfastPage.page4OzelOdaImkaniHAYIR.getAttribute("class");
        Assert.assertTrue(ozelOdaImkani.contains("text-white"));

        String kahvaltiSayisi = bedAndBreakfastPage.page4KahvaltiHAYIR.getAttribute("class");
        Assert.assertTrue(kahvaltiSayisi.contains("text-white"));

    }

    @When("user types a description as {string} , {string} and {string} to the related input on the new bedandbreakfeastpage six page")
    public void user_types_a_description_as_and_to_the_related_input_on_the_new_bedandbreakfeastpage_six_page(String home, String room, String breakfast) throws InterruptedException {

        bedAndBreakfastPage.page6inputBoxHome.sendKeys(home);
        bedAndBreakfastPage.page6inputBoxRoom.sendKeys(room);
        bedAndBreakfastPage.page6inputBoxBreakf.sendKeys(breakfast);
        Thread.sleep(3000);



    }

    @When("user verifies the value of description input is same with {string}, {string} and {string} on the bedandbreakfastpage step six page")
    public void user_verifies_the_value_of_description_input_is_same_with_and_on_the_bedandbreakfastpage_step_six_page(String home, String room, String breakfast) {

        String homemu = bedAndBreakfastPage.page6inputBoxHome.getAttribute("value");
        Assert.assertTrue(homemu.contains(home));
        String roommu = bedAndBreakfastPage.page6inputBoxRoom.getAttribute("value");
        Assert.assertTrue(roommu.contains(room));
        String breakmi = bedAndBreakfastPage.page6inputBoxBreakf.getAttribute("value");
        Assert.assertTrue(breakmi.contains(breakfast));
    }


}
