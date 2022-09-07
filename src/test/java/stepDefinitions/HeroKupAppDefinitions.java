package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HeroPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class HeroKupAppDefinitions {
    HeroPage heroPage = new HeroPage();

    @Then("addElement butonuna basar")
    public void add_element_butonuna_basar() {
        heroPage.addElementButton.click();
    }

    @Then("delete butonu gorunene kadar bekler")
    public void delete_butonu_gorunene_kadar_bekler() {
        ReusableMethods.waitForVisibility(heroPage.deleteButton, 7);
    }

    @Then("delete butonu gorunurlugu test eder")
    public void delete_butonu_gorunurlugu_test_eder() {
        heroPage.deleteButton.isDisplayed();
    }

    @Then("delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        heroPage.deleteButton.click();
    }

    @Then("delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() throws IOException {
        ReusableMethods.getScreenshot("SS");

    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.getDriver().close();
    }


}
