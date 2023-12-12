package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FaceBookPage;
import utilities.Driver;

public class FacebookStepdefinitions {

    FaceBookPage faceBookPage=new FaceBookPage();


    @Then("facebook’da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        faceBookPage.yeniHesapOlustur.click();

    }
    @When("Faker class’indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("11")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();
    }
    @Then("facebook kayit ol tusuna basar")
    public void facebook_kayit_ol_tusuna_basar() {
        faceBookPage.yeniKayitKaydolButonu.click();
    }

}
