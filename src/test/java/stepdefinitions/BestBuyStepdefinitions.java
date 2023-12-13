package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BestBuyStepdefinitions {

    BestBuyPage bestBuyPage=new BestBuyPage();

    @Then("sayfa Url'in {string} 'e esit olduugunu test eder")
    public void sayfa_url_in_e_esit_olduugunu_test_eder(String verilenUrl) {
        String expectedUrl= ConfigReader.getProperty(verilenUrl);
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Then("sayfa basliginin {string} icermedigini test eder")
    public void sayfa_basliginin_icermedigini_test_eder(String verilenDeger) {
       Assert.assertFalse(Driver.getDriver().getTitle().contains(verilenDeger));
    }
    @Then("BestBuy logosunun goruntulendigini test eder")
    public void best_buy_logosunun_goruntulendigini_test_eder() {
        Assert.assertTrue(bestBuyPage.bestBuyLogo.isDisplayed());
    }
    @Then("Fransizca linkinin goruntulendigini test eder")
    public void fransizca_linkinin_goruntulendigini_test_eder() {
        Assert.assertTrue(bestBuyPage.francaisLink.isDisplayed());
    }
}
