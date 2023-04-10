package StepDefinitions;

import Pages.Elements;
import Pages._08_09_RT_UserStory_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class RT_UserStory08_Steps {

    Elements RT=new Elements();
    _08_09_RT_UserStory_Elements rt= new _08_09_RT_UserStory_Elements();

    @And("enter a value in to the username which was already taken")
    public void enterAValueInToTheUsernameWhichWasAlreadyTaken() {

        RT.sendKeysFunction(RT.essUserInput, "Admin");

    }

    @Then("verify that notification messages “Already exists” in red color displayed.")
    public void verifyThatNotificationMessagesAlreadyExistsInRedColorDisplayed() {
        RT.Assertion(rt.alredyExists,"Already exists");

    }
}
