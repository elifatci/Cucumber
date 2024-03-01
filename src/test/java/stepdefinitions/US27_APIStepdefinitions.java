package stepdefinitions;

import baseUrl.JsonBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US27_APIStepdefinitions extends JsonBaseUrl {

    Response response;

    @Given("JsonPlaceHolder sitesine gidilir")
    public void jsonplaceholderSitesineGidilir() {
        specJson.pathParams("pp1","posts","pp2","3","pp3","comments");
    }

    @And("get sorgusu yapılır")
    public void getSorgusuYapılır() {

        //send the request and get the response

        response=given().when().spec(specJson).get("{pp1}/{pp2}/{pp3}");
        response.prettyPrint();
    }

    @Then("body assert edilir")
    public void bodyAssertEdilir() {

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);

        JsonPath resJP=response.jsonPath();
        List<String> nameList= resJP.getList("name");
        assertEquals("modi ut eos dolores illum nam dolor",nameList.get(1));

        List<String> emailList= resJP.getList("email");
        assertEquals("Oswald.Vandervort@leanne.org",emailList.get(1));

        List<String> bodyList=resJP.getList("body");
        assertEquals("expedita maiores dignissimos facilis\nipsum est rem est fugit velit sequi\neum odio dolores dolor totam\noccaecati ratione eius rem velit",bodyList.get(1));

        List<Integer> postIdList=resJP.getList("postId");
        assertEquals(3,postIdList.get(1).intValue());

        List<Integer> idList=resJP.getList("id");
        assertEquals(12,idList.get(1).intValue());



    }
}
