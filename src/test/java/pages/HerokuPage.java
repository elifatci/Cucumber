package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {

    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addButonu;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;

    @FindBy(xpath = "//h3")
    public WebElement addRemoveElementYazisi;


    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement checkbox2;
}
