package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeroPage {
    public HeroPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()=\"Add Element\"]")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[text()=\"Delete\"]")
    public WebElement deleteButton;

}
