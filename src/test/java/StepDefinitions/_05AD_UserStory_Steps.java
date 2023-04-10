package StepDefinitions;

import Pages.Elements;
import Pages._04_05_AD_UserStory_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _05AD_UserStory_Steps {

    _04_05_AD_UserStory_Elements ae = new _04_05_AD_UserStory_Elements();
    Elements e = new Elements();

    @And("Enter a required value in to the “password” field and different value in to the “confirm password” field")
    public void enterARequiredValueInToThePasswordFieldAndDifferentValueInToTheConfirmPasswordField() {
        e.sendKeysFunction(e.essPasswordInput, "Group7gg.");
        // ay.waitUntilClickable(ay.confirmpass);
        //String parola= RandomStringUtils.randomAlphanumeric(8);
        e.sendKeysFunction(e.essConfirmPswrd, "ayse23");
        e.clickFunction(e.SaveButton);
    }

    @Then("Verify that notification messages “Passwords do not match” in red color displayed")
    public void verifyThatNotificationMessagesPasswordsDoNotMatchInRedColorDisplayed() {

        e.waitUntilVisible(ae.notmatch);
        e.Assertion(ae.notmatch, "Passwords do not match");
    }
}
