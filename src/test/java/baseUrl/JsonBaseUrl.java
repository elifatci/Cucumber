package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class JsonBaseUrl {

    public static RequestSpecification specJson;

    public static void setUpJson(){
        specJson=new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com/")
                .build();
    }
}
