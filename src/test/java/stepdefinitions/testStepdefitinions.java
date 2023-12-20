package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestPages;

public class testStepdefitinions {

    TestPages testPages=new TestPages();

    @Given("Kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String Url) {
    }
    @Given("arama kutusuna phone yazar")
    public void arama_kutusuna_phone_yazar() {

    }
    @Given("urun {string} buldugunu dogrular")
    public void urun_buldugunu_dogrular(String string) {

    }


}
