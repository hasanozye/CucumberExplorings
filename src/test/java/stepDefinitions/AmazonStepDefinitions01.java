package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions01 {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes thru amazon webPage")
    public void user_goes_thru_amazon_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonURL"));

    }

    @Given("searchs for Iphone")
    public void searchs_for_ıphone() {
        amazonPage.searchBox.sendKeys("iphone" + Keys.ENTER);

    }

    @Then("sees if results contains iphone.")
    public void sees_if_results_contains_iphone() {
        amazonPage.endResultIphone.getText();
        Assert.assertTrue(amazonPage.endResultIphone.getText().contains("iphone"));

    }

    @Given("user goes thru amazon Webpage")
    public void user_goes_thru_amazon_webpage() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Given("searches for tea pot")
    public void searches_for_tea_pot() {
        amazonPage.searchBox.sendKeys("teapot" + Keys.ENTER);

    }

    @Then("Sees if results contains tea pot")
    public void sees_if_results_contains_tea_pot() {
        amazonPage.endResultTeaPot.getText();
        Assert.assertTrue(amazonPage.endResultTeaPot.getText().contains("tea"));

    }

    @Given("SEARCHS FOR FLOWER")
    public void searchs_for_flower() {
        amazonPage.searchBox.sendKeys("flower", Keys.ENTER);


    }

    @Then("sees if results contains flower")
    public void sees_if_results_contains_flower() {
        amazonPage.endResultFlower.getText();
        Assert.assertTrue(amazonPage.endResultTeaPot.getText().contains("flower"));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenURL) {
        Driver.getDriver().get(ConfigurationReader.getProperty(istenenURL));
    }

    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime + Keys.ENTER);

    }

    @And("sayfayi kapatir")
    public void sayfayi_kapatir() throws InterruptedException {
        Driver.closeDriver();

    }

    @Then("Sonuclarin {string} icerdiğini test eder")
    public void sonuclarin_icerdiğini_test_eder(String arananKelime) {

        String sonucYazisiStr = amazonPage.endResultFlower.getText();
        Assert.assertTrue(sonucYazisiStr.contains(arananKelime));
    }


}
