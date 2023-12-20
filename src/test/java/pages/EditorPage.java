package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorPage {

    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement newSearchButton;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> bulunanIsimler;

}
