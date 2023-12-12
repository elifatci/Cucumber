package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucaDemoPage {

    public SaucaDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;


}
