package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class UserManagementSteps {

    Elements e=new Elements();


    @Given("Navigate to User Management Page")
    public void navigateToUserManagementPage() {
        e.clickFunction(e.adminLink);

    }

    @And("click on add button")
    public void clickOnAddButton() {
        e.clickFunction(e.addButton);

    }
}





