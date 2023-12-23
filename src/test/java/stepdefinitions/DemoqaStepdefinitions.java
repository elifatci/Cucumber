package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemoqaStepdefinitions {


    DemoqaPage demoqaPage=new DemoqaPage();

    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Visible After {int} seconds butonunun gorunur olmasini bekleyin")
    public void visible_after_seconds_butonunun_gorunur_olmasini_bekleyin(Integer int1) {
        ReusableMethods.wait2(4);

    }
    @Given("Visible After {int} seconds butonunun gorunur oldugunu test edin")
    public void visible_after_seconds_butonunun_gorunur_oldugunu_test_edin(Integer int1) {
        Assert.assertTrue("Visible after 5 seconds botunu gorunur degil",demoqaPage.visibleAfterFive.isDisplayed());
    }

    @Given("Alerts’e tiklayin")
    public void alerts_e_tiklayin() {
        demoqaPage.alertsFrameLink.click();
        demoqaPage.alertsLink.click();
    }
    @Given("On button click, alert will appear after {int} seconds karsisindaki click me butonuna basin")
    public void on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_basin(Integer int1) {

       ReusableMethods.wait2(5);
        demoqaPage.alertWillAppearClickMe.click();


    }
    @Given("Allert’in gorunur olmasini bekleyin")
    public void allert_in_gorunur_olmasini_bekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    @Given("Allert uzerindeki yazinin {string} oldugunu test edin")
    public void allert_uzerindeki_yazinin_this_alert_appeared_after_seconds_oldugunu_test_edin(String text) {
        String expectedText=text;
        String actualText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Given("Ok diyerek alerti kapatin")
    public void ok_diyerek_alerti_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }




}
