package StepDefinitions;

import Pages.Elements;
import Pages._04_05_AD_UserStory_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _04AD_UserStory_Steps {
    _04_05_AD_UserStory_Elements ae=new _04_05_AD_UserStory_Elements();
    Elements e=new Elements();

    @And("Click on Save button before entering any mandatory field")
    public void clickOnSaveButtonBeforeEnteringAnyMandatoryField() {

        e.waitUntilClickable(e.SaveButton);
        e.clickFunction(e.SaveButton);

    }

    @Then("Verify that notification messages in red color displayed")
    public void verifyThatNotificationMessagesInRedColorDisplayed() {

        e.Assertion(ae.redMsg,"Required");
    }
}
