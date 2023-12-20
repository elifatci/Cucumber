package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class EditorStepdefinitions {
    String firstName;

    EditorPage editorPage=new EditorPage();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButton.click();

    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
       firstName=faker.name().firstName();
        actions.click(editorPage.firstName)
                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.job().position())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().industry())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("2023-12-04")
                .sendKeys(Keys.TAB)
                .sendKeys("50000").perform();


    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButton.click();

    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        editorPage.newSearchButton.sendKeys(firstName+Keys.ENTER);

    }
    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {

        System.out.println(ReusableMethods.strListeOlustur(editorPage.bulunanIsimler));

        Assert.assertTrue("İsim bolumunde isminin oldugu dogrulanamadi",ReusableMethods.strListeOlustur(editorPage.bulunanIsimler).contains(firstName));

    }

}
