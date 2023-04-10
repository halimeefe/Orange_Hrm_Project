package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_05_AD_UserStory_Elements {

    public _04_05_AD_UserStory_Elements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")
    public WebElement redMsg;


    @FindBy(xpath = "//span[text()='Passwords do not match']")
    public WebElement notmatch;

}
