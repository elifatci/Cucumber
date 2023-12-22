package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

}
