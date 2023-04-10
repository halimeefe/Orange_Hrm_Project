package StepDefinitions;

import Pages.Elements;
import Pages.ElementsYT;
import io.cucumber.java.en.Then;

public class _10YTUserStory {
    ElementsYT ell = new ElementsYT();
    Elements el =new  Elements();



    @Then("verify that all the required elements are displayed")
    public void verifyThatAllTheRequiredElementsAreDisplayed() {

        ell.Assertion(ell.userRole, "User Rol");
        ell.Assertion(ell.employeeName, "Nam");
        ell.Assertion(ell.status, "Statu");
        ell.Assertion(ell.username, "Username");
        ell.Assertion(ell.password, "Password");
        ell.Assertion(ell.confirmPassword, "Confirm Password");
        el.Assertion(ell.cancel, "Cancel");
        ell.Assertion(ell.save, "Save");
    }
}
