package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucaDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ConcurrentModificationException;

public class SaucedemoStepdefinitions {


    SaucaDemoPage saucaDemoPage=new SaucaDemoPage();
    String ilkUrunIsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String kullaniciAdi) {

        saucaDemoPage.usernameKutusu.sendKeys(kullaniciAdi);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String kullaniciPassword) {
        saucaDemoPage.passwordKutusu.sendKeys(kullaniciPassword);
    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        saucaDemoPage.loginButonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunIsmi=saucaDemoPage.ilkUrunIsimElementi.getText();
        saucaDemoPage.ilkUrunIsimElementi.click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
        saucaDemoPage.ilkUrunAddToCartButonu.click();
    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        saucaDemoPage.sepetElementi.click();
    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {
       String actualSepetUrunIsmi=saucaDemoPage.sepettekiUrunIsimElementi.getText();
       Assert.assertEquals(ilkUrunIsmi,actualSepetUrunIsmi);
    }

}
