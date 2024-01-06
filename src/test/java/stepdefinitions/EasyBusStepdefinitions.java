package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EasyBusPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EasyBusStepdefinitions {
    Actions actions=new Actions(Driver.getDriver());
    EasyBusPage easyBusPage=new EasyBusPage();

    @Given("Go to url {string}")
    public void go_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("easyBusUrl"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
       String expectedTitle="Easy Bus Ticket - Home";
       String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        actions.sendKeys(Keys.END).perform();
    }
    @Given("Verify EASY BUS TİCKET logo is visible")
    public void verify_easy_bus_ti̇cket_logo_is_visible() {
        Assert.assertTrue(easyBusPage.footerLogo.isDisplayed());
    }
    @Given("Scroll up page to top")
    public void scroll_up_page_to_top() {
        actions.sendKeys(Keys.HOME).perform();
    }
    @Given("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
            Assert.assertTrue(easyBusPage.headerLogo.isDisplayed());
            Assert.assertTrue(easyBusPage.everyJourneyText.isDisplayed());
    }

}
