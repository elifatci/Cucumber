package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExStepDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("toAutoUrl"));
    }
    @Then("Scroll to bottom of page")
    public void scroll_to_bottom_of_page() {
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.recommendItems);

    }
    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verify_recommended_items_are_visible() {
        Assert.assertTrue("RECOMMENDED ITEMS are not visible",automationExercisePage.recommendItems.isDisplayed());

    }
    @Then("Click on Add To Cart on Recommended product")
    public void click_on_add_to_cart_on_recommended_product() {
      automationExercisePage.addToCartLink.click();
    }
    @Then("Click on View Cart button")
    public void click_on_view_cart_button() {
        automationExercisePage.viewCart.click();
    }
    @Then("Verify that product is displayed in cart page and close the page")
    public void verify_that_product_is_displayed_in_cart_page_close_the_page() {
        Assert.assertTrue("that product is not displayed in cart page",automationExercisePage.imageOfProduct.isDisplayed());
       Driver.closeDriver();
    }
}
