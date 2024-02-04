package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExercisePage {
    public ExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#username")
    public WebElement textBoxUsername;

    @FindBy(css = "#password")
    public WebElement textBoxPassword;

    @FindBy(css = "#submit")
    public WebElement buttonSubmit;

    @FindBy(className = "post-title")
    public WebElement textSuccessful;

    @FindBy(linkText = "Log out")
    public WebElement buttonLogout;

    @FindBy(css = "#error")
    public WebElement textError;


}
