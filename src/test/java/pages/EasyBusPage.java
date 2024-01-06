package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EasyBusPage {

    public EasyBusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@alt='Logo'])[2]")
    public WebElement footerLogo;

    @FindBy(xpath = "(//*[@alt='Logo'])[1]")
    public WebElement headerLogo;

    @FindBy(xpath = "(//*[@class='title'])[2]")
    public WebElement everyJourneyText;
}
