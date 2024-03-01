package hooks;

import io.cucumber.java.Before;

import static baseUrl.JsonBaseUrl.setUpJson;


public class HooksAPI {

    @Before
    public void before(){

        setUpJson();
    }
}
