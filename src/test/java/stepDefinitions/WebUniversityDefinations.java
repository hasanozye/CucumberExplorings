package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityDefinations {
    WebUniversityPage univ = new WebUniversityPage();

    @Then("sayfada assagiIn")
    public void sayfada_assagi_ın() {
        ReusableMethods.hover(univ.webUniversityLoginPortal);

    }

    @Then("loginPortal butonuna bas")
    public void login_portal_butonuna_bas() {
        univ.webUniversityLoginPortal.click();
    }

    @Then("diger windowa gec")
    public void diger_windowa_gec() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @Then("{string} ve {string}")
    public void ve(String userName, String password) {
        univ.webUniversityUserNameButton.sendKeys(userName);
        univ.webUniversityUserNameButton.sendKeys(password);

    }

    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        univ.webUniversityButton.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test edin")
    public void popup_ta_cikan_yazinin_oldugunu_test_edin(String alert) {
        String pop = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(pop, alert);
    }

    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("ilk sayfaya geri donun")
    public void ilk_sayfaya_geri_donun() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");

    }

    @Then("ilk sayfaya donuldugunu test edin")
    public void ilk_sayfaya_donuldugunu_test_edin() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "WebDriverUniversity.com";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Then("biraz {int} saniye bekle")
    public void birazSaniyeBekle(int bekle) {
        ReusableMethods.waitFor(4);
    }
}
