package StepDefinitions;

import Pages._06IO_Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06IO_UserStory_Steps {
    _06IO_Elements us6 = new _06IO_Elements();
    @And("Enter an invalid employee name")
    public void enterAnInvalidEmployeeName() {
        us6.sendKeysFunction(us6.employeeName, "Ismail");
    }

    @Then("Verify no records found message")
    public void verifyNoRecordsFoundMessage() {
        WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(us6.noRecords, "textContent", us6.noRecords.getText()));
        us6.Assertion(us6.noRecords, "No Records Found");
    }
    @Then("Verify invalid message in red color")
    public void verifyInvalidMessageInRedColor() {
        Actions aksiyon = new Actions(BaseDriver.getDriver());
        aksiyon.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
        us6.Assertion(us6.invalidEmployeeName, "Invalid");
    }
}
