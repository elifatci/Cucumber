package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendItems;

    @FindBy(xpath = "(//a[@data-product-id='4'])[3]")
    public WebElement addToCartLink;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(className = "product_image")
    public WebElement imageOfProduct;

}

