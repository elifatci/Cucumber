package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BestBuyPage {

    public BestBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "logo")
    public WebElement bestBuyLogo;

    @FindBy(xpath = "(//*[@lang='fr'])[1]")
    public WebElement francaisLink;

    @FindBy(xpath = "(//*[@class='canada-link'])[1]")
    public WebElement canadaLink;

    @FindBy(xpath = "//*[text()='Shop']")
    public WebElement shopLink;

    @FindBy(partialLinkText = "Accessories")
    public WebElement computerTabletLink;

    @FindBy(xpath = "(//*[@class='content_3Dbgg'])[2]")
    public WebElement shopAllButton;

    @FindBy(xpath = "//*[@class='col-xs-4_1EA1G col-sm-2_ZxGIs category_LRby8']")
    public List<WebElement> cellList;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@class='content_3Dbgg'])[47]")
    public WebElement signUpButton;

}
