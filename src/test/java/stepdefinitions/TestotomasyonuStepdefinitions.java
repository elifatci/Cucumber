package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
    Sheet sayfa2;
    int ActualurunStokMiktari;

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @Then("arama kutusuna phone yazip ENTER tusuna basar")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        int sonucSayisi=testOtomasyonuPage.bulunanUrunElementleriList.size();
        Assert.assertTrue(sonucSayisi>0);

    }
    @And("biraz bekler")
    public void birazBekler() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("arama kutusuna shoes yazip ENTER tusuna basar")
    public void aramaKutusunaShoesYazipENTERTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("shoes"+Keys.ENTER);
    }

    @Then("arama kutusuna nutella yazip Enter tusuna basar")
    public void aramaKutusunaNutellaYazipEnterTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("nutella"+Keys.ENTER);
    }

    @And("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {
        int sonucSayisi=testOtomasyonuPage.bulunanUrunElementleriList.size();
        Assert.assertEquals(0,sonucSayisi);
    }


    @Then("arama kutusuna {string} yazip Enter tusuna basar")
    public void aramaKutusunaYazipEnterTusunaBasar(String istenenUrun) {

        testOtomasyonuPage.aramaKutusu.sendKeys(istenenUrun+Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String gidilecekUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(gidilecekUrl));
    }


    @Then("account butonuna basar")
    public void account_butonuna_basar() {
        testOtomasyonuPage.accountLinki.click();


    }
    @Then("email olarak {string} girer")
    public void emailOlarakGirer(String emailTuru) {
        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty(emailTuru));
    }


    @Then("password olarak {string} girer")
    public void password_olarak_to_gecersiz_password_girer(String passwordTuru ) {
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty(passwordTuru));

    }
    @Then("signIn butonuna basar")
    public void sign_ın_butonuna_basar() {
        testOtomasyonuPage.loginButonu.click();

    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        Assert.assertTrue(testOtomasyonuPage.logoutLinki.isDisplayed());
    }

    @And("sisteme giris yapamadigini test eder")
    public void sistemeGirisYapamadiginiTestEder() {
        Assert.assertTrue(testOtomasyonuPage.emailKutusu.isDisplayed());

    }

    @Then("stok excelindeki {string} daki urunun stok miktarini bulur")
    public void stokExcelindekiDakiUrununStokMiktariniBulur(String satirNo) {
        String dosyaYolu="src/test/resources/stok.xlsx";
        Workbook workbook;
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        sayfa2=workbook.getSheet("Sayfa2");
       String SatirUrunIsmi=sayfa2.getRow(Integer.parseInt(satirNo)-1).getCell(0).toString();

       testOtomasyonuPage.aramaKutusu.sendKeys(SatirUrunIsmi+Keys.ENTER);
       ActualurunStokMiktari=testOtomasyonuPage.bulunanUrunElementleriList.size();

    }

    @And("stok miktarinin {string} da verilen stok miktarindan fazla oldugunu test eder")
    public void stokMiktarininDaVerilenStokMiktarindanFazlaOldugunuTestEder(String verilenSatir) {
        String dosyaYolu="src/test/resources/stok.xlsx";
        Workbook workbook;
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        sayfa2=workbook.getSheet("Sayfa2");
        String minStokMiktariStr=sayfa2.getRow(Integer.parseInt(verilenSatir)-1)
                                  .getCell(1)
                                  .toString();

        int minStokMiktari= (int) Double.parseDouble(minStokMiktariStr);
        Assert.assertTrue(ActualurunStokMiktari>minStokMiktari);
    }

    @Given("{string} anasayfaya gidin")
    public void anasayfaya_gidin(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @Given("arama kutusuna phone yazip ENTER tusuna basin")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basin() {
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+Keys.ENTER);
    }
    @Then("Listelenen sonuclardan ilkini tiklayin")
    public void listelenen_sonuclardan_ilkini_tiklayin() {
        testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();
    }
    @Then("urunu sepete ekleyin")
    public void urunu_sepete_ekleyin() {
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",testOtomasyonuPage.addToCartLink);

    }
    @Then("your cart linkine tiklayin")
    public void your_cart_linkine_tiklayin() {
        testOtomasyonuPage.yourCartLink.click();
    }
    @Then("sepetteki urun isminin case sensitive olmadan iphone icerdigini test edin")
    public void sepetteki_urun_isminin_case_sensitive_olmadan_iphone_icerdigini_test_edin() {
        String actualUrunIsmi=testOtomasyonuPage.sepettekiUrunIsmi.getText().toLowerCase();
        Assert.assertTrue("Sepete eklediginiz urun istenilen kelimeyi icermemektedir",actualUrunIsmi.contains("iphone"));
    }
    @Then("sayfayi kapatin")
    public void sayfayi_kapatin() {

        Driver.closeDriver();
    }

    @Given("login account linkine tiklar")
    public void login_account_linkine_tiklar() {
        testOtomasyonuPage.accountLinki.click();
    }
    @Then("Mail kutusuna gecerli mail girer")
    public void mail_kutusuna_gecerli_mail_girer() {
       testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
    }
    @Then("Sifre kutusuna gecersiz sifre girer")
    public void sifre_kutusuna_gecersiz_sifre_girer() {
      testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
    }
    @Then("login tusuna basar")
    public void login_tusuna_basar() {
       testOtomasyonuPage.loginButonu.click();
    }
    @Then("Basarili bir sekilde giris yapilamadigini test eder")
    public void basarili_bir_sekilde_giris_yapilamadigini_test_eder() {
       Assert.assertTrue("Sisteme yanlis bilgilerle giris yapildi",testOtomasyonuPage.wrongLoginText.isDisplayed());
    }

    @Then("Mail kutusuna gecersiz mail girer")
    public void mailKutusunaGecersizMailGirer() {
        testOtomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
    }

    @Then("Sifre kutusuna gecerli sifre girer")
    public void sifreKutusunaGecerliSifreGirer() {
        testOtomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
    }
}


