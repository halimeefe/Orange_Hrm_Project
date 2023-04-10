package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _01_02CD_Elements extends Parent {

    public _01_02CD_Elements(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class='oxd-select-text--after'])[1]")
    public WebElement roleSelect;

    @FindBy(xpath = "//*[text()='ESS']")
    public WebElement ess;

    @FindBy(xpath = "(//*[@class='oxd-select-text--after'])[2]")
    public WebElement statusSelect;

    @FindBy(xpath = "//*[text()='Enabled']")
    public WebElement enabled;

    @FindBy(css = "[class='oxd-userdropdown-name']")
    public WebElement getEmployeeName;

    @FindBy(css = "input[placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active' and @autocomplete='off'])[1]")
    public WebElement username;

    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement essPassword;

    @FindBy(xpath = "(//*[@type='password'])[2]")
    public WebElement getEssPasswordConfirm;

    @FindBy(css = "[role='listbox']")
    public WebElement listbox;

    @FindBy(css = "[role='option']>span")
    public WebElement option;

    @FindBy(css = "[class*='field-error-message']")
    public WebElement errorMessage;

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickFunctionCD(WebElement element) {

        waitUntilClickable(element);
        element.click();
    }

}
