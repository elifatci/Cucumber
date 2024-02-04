package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import pages.ExercisePage;
import utilities.Driver;

public class Exercise {

    ExercisePage exercisePage=new ExercisePage();
    SoftAssert softAssert=new SoftAssert();

    @Given("Open page")
    public void open_page() {
        Driver.getDriver().get("https://practicetestautomation.com/practice-test-login/");
    }
    @Given("Type username student into Username field")
    public void type_username_student_into_username_field() {
        exercisePage.textBoxUsername.sendKeys("student");
    }
    @Given("Type password Password123 into Password field")
    public void type_password_password123_into_password_field() {
        exercisePage.textBoxPassword.sendKeys("Password123");
    }
    @Given("Puch Submit button")
    public void puch_submit_button() {
        exercisePage.buttonSubmit.click();
    }
    @Given("Verify new page URL contains practicetestautomation.com\\/logged-in-successfully\\/")
    public void verify_new_page_url_contains_practicetestautomation_com_logged_in_successfully() {
        String expectedUrl="https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
    }
    @Given("Verify new page contains expected text \\({string} or {string})")
    public void verify_new_page_contains_expected_text_or(String string, String string2) {
        String expectedText="Logged In Successfully";
        String actualText=exercisePage.textSuccessful.getText();
        softAssert.assertEquals(actualText,expectedText);
    }
    @Given("Verify button Log out is displayed on the new page")
    public void verify_button_log_out_is_displayed_on_the_new_page() {
        softAssert.assertTrue(exercisePage.buttonLogout.isDisplayed());
    }
}
