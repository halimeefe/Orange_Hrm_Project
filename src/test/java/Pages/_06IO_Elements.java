package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _06IO_Elements extends Parent{
    public _06IO_Elements()
    {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
    @FindBy(css = "input[placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy (xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")
    public WebElement invalidEmployeeName;

    @FindBy (xpath = "//div[@role='listbox']/div")
    public WebElement noRecords;
}
