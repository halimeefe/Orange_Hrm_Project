package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _12HE_UserStory_Steps {



    Elements e = new Elements();

    @When("Enter password less than {int} characters")
    public void enter_password_less_than_characters(Integer int1) {
        e.sendKeysFunction(e.essPasswordInput, "admin12");

    }

    @Then("Verify notification messages displayed")
    public void verify_that_notification_messages_in_red_color_displayed() {
        e.Assertion(e.message1, "at least 8");


    }
}


