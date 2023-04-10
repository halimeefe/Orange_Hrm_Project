package StepDefinitions;

import Pages.ElementsYT;
import io.cucumber.java.en.Then;

public class _11YTUserStory {
    ElementsYT el =new ElementsYT();

    @Then("verify that “Add User” heading is displayed")
    public void verifyThatAddUserHeadingIsDisplayed() {
        el.Assertion(el.addUser,"Add User");

    }


}
