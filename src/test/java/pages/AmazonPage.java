package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class=\"a-color-state a-text-bold\"]")
    public WebElement endResultIphone;

    @FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement endResultTeaPot;

    @FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement endResultFlower;


}
