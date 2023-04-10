package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07IO_Elements extends Parent{
    public _07IO_Elements()
    {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement essUserInput;

    @FindBy (xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement lessThanFive;
}
