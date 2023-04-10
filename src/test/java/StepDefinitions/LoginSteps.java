package StepDefinitions;

import Pages.Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    Elements e = new Elements();

    @Given("Navigate to Website")
    public void navigate_to_website() {
        BaseDriver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        BaseDriver.getDriver().manage().window().maximize();


    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        e.sendKeysFunction(e.nameInput,"Admin");
        e.sendKeysFunction(e.passwordInput,"admin123");
        e.clickFunction(e.loginButton);

    }

    @Then("User should login succesfully")
    public void user_should_login_succesfully() {

        e.Assertion(e.verifyLogin,"Dashboard");

    }

}


