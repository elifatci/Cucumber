package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ReusableMethods;

public class HerokuappStepdefinitions {

    HerokuPage herokuPage=new HerokuPage();
    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        herokuPage.addButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        herokuPage.deleteButonu.click();
    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.addRemoveElementYazisi.isDisplayed());
    }

    @Given("Checkbox1 ve checkbox2 elementlerini locate edin.")
    public void checkbox1_ve_checkbox2_elementlerini_locate_edin() {
        ReusableMethods.wait2(2);
    }
    @Given("Checkbox1 seçili değilse onay kutusunu tıklayın")
    public void checkbox1_seçili_değilse_onay_kutusunu_tıklayın() {
        herokuPage.checkbox1.click();
    }
    @Given("Checkbox2 seçili değilse onay kutusunu tıklayın")
    public void checkbox2_seçili_değilse_onay_kutusunu_tıklayın() {
        if (!herokuPage.checkbox2.isSelected()){
            herokuPage.checkbox2.click();
        }
    }
    @Given("Checkbox1ve Checkbox2’nin seçili olduğunu test edin")
    public void checkbox1ve_checkbox2_nin_seçili_olduğunu_test_edin() {
        Assert.assertTrue(herokuPage.checkbox1.isSelected() && herokuPage.checkbox2.isSelected());
    }


}
