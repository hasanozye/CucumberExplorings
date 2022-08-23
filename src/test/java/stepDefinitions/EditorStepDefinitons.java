package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitons {

    EditorPage editorPage = new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }

    @Then("firstname olarak {string} girer")
    public void firstname_olarak_girer(String string) {
        editorPage.firstName.sendKeys(string, Keys.ENTER);
    }

    @Then("Lastname olarak {string} girer")
    public void lastname_olarak_girer(String string) {
        editorPage.lastName.sendKeys(string, Keys.ENTER);
    }

    @Then("Position olarak {string} girer")
    public void position_olarak_girer(String string) {
        editorPage.position.sendKeys(string);

    }

    @Then("Office olarak {string} girer")
    public void office_olarak_girer(String string) {
        editorPage.office.sendKeys(string);
    }

    @Then("Extension olarak {string} girer")
    public void extension_olarak_girer(String string) {
        editorPage.extension.sendKeys(string);
    }

    @Then("Start date olarak {string} girer")
    public void start_date_olarak_girer(String string) {
        editorPage.startDate.sendKeys(string);
    }

    @Then("Salary olarak {string} girer")
    public void salary_olarak_girer(String string) {
        editorPage.salary.sendKeys(string);
    }

    @Then("kullanici Create tusuna basar")
    public void kullanici_create_tusuna_basar() {
        editorPage.createBtn.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String string) {
        editorPage.searchBoxElement.sendKeys(string);
    }

    @And("isim bolumunde {string} dogrular")
    public void isimBolumundeDogrular(String firstSearch) {
        String sonuc = editorPage.aramasonucuElement.getText();
        Assert.assertTrue(sonuc.contains(firstSearch));
    }


}
