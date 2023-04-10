package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _13HE_UserStory_Steps {


    Elements e = new Elements();

    @When("Enter password without lowercase character")
    public void enter_password_without_lowercase_character() {

        e.sendKeysFunction(e.essPasswordInput, "ADMİN123");

    }

    @Then("Verify that notification messages must contain a lower case letter")
    public void verify_that_notification_messages_must_contain_a_lower_case_letter() {
        e.Assertion(e.message2, "must contain a lower-case letter");


    }
}








