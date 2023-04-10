package StepDefinitions;

import Pages._01_02CD_Elements;
import Pages.Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01CD_UserStory_Steps {

    Elements el=new Elements();
    _01_02CD_Elements cd=new _01_02CD_Elements();
    WebDriverWait wait =new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(5));
    @And("Fill in the all fields")
    public void fillInTheAllFields() {
        cd.clickFunctionCD(cd.roleSelect);
        cd.clickFunctionCD(cd.ess);
        cd.clickFunctionCD(cd.statusSelect);
        cd.clickFunctionCD(cd.enabled);
        cd.sendKeysFunction(cd.employeeName,cd.getEmployeeName.getText().substring(0,4));
        wait.until(ExpectedConditions.attributeContains(cd.option,"textContent",cd.getEmployeeName.getText().substring(0,3)));
        cd.clickFunctionCD(cd.listbox);
        cd.sendKeysFunction(cd.username,"group_7pguoohyg");
        cd.sendKeysFunction(cd.essPassword,"Group7gg.");
        cd.sendKeysFunction(cd.getEssPasswordConfirm,"Group7gg.");
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        wait.until(ExpectedConditions.invisibilityOf(cd.errorMessage));
        el.clickFunction(el.SaveButton);
    }

    @Then("Verify that you have added to the list")
    public void verifyThatYouHaveAddedToTheList() {
        wait.until(ExpectedConditions.urlContains("viewSystemUsers"));
        Assert.assertTrue(BaseDriver.getDriver().getCurrentUrl().contains("viewSystemUsers"));
    }
}
