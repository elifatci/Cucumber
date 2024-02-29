package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class JsonPlaceAPIstepdefinitions {

    String endpoint;
    Response response;
    JsonPath resJP;


    @Given("kullanici {string} base Url adresine gider")
    public void kullanici_base_url_adresine_gider(String url) {

    endpoint= ConfigReader.getProperty("JsonURL");

    }
    @Then("kullanici {string} parametrelerini kullanir")
    public void kullanici_parametrelerini_kullanir(String pathParams) {

        endpoint=endpoint+"/"+ pathParams;
    }
    @Then("kullanici GET request gonderip gelen responsu kaydeder")
    public void kullanici_get_request_gonderip_gelen_responsu_kaydeder() {

        response=given().when().get(endpoint);
    }
    @Then("kullanici status kodunun {int} oldugunu test eder")
    public void kullanici_status_kodunun_oldugunu_test_eder(int statusCode) {

       assertEquals(statusCode,response.getStatusCode());

    }
    @Then("kullanici content type degerinin {string} oldugunu test eder")
    public void kullanici_content_type_degerinin_oldugunu_test_eder(String contentType) {

        assertEquals(contentType,response.getContentType());
    }
    @Then("kullanici donen cevaptaki userid degerinin {int} oldugunu test eder")
    public void kullanici_donen_cevaptaki_userid_degerinin_oldugunu_test_eder(int userId) {

        resJP=response.jsonPath();

        assertEquals(userId,resJP.getInt("userId"));
    }
    @Then("kullanici donen cevaptaki title degerinin {string} oldugunu test eder")
    public void kullanici_donen_cevaptaki_title_degerinin_oldugunu_test_eder(String title) {

    }
}
