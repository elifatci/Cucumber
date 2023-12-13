package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestBuyPage {

    public BestBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "logo")
    public WebElement bestBuyLogo;

    @FindBy(xpath = "(//*[@lang='fr'])[1]")
    public WebElement francaisLink;
}
