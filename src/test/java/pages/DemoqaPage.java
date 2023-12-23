package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy(id = "visibleAfter")
    public WebElement visibleAfterFive;

    @FindBy(xpath = "(//*[@class='header-text'])[3]")
    public WebElement alertsFrameLink;

    @FindBy(xpath = "//*[text()='Alerts']")
    public WebElement alertsLink;


    @FindBy(id = "timerAlertButton")
    public WebElement alertWillAppearClickMe;



}
