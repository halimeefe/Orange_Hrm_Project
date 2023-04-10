package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsYT extends Parent {
    public ElementsYT() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button")
    public WebElement addButton;

    @FindBy(xpath ="//div[@class='orangehrm-card-container']/h6" )
    public WebElement addUser;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[1]" )
    public WebElement userRole;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[2]" )
    public WebElement employeeName;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[3]" )
    public WebElement status;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[4]" )
    public WebElement username;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[5]" )
    public WebElement password;

    @FindBy(xpath ="(//div[@class='oxd-input-group__label-wrapper']/label)[6]" )
    public WebElement confirmPassword;
    @FindBy(xpath ="(//div[@class='oxd-form-actions']/button)[1]" )
    public WebElement cancel;

    @FindBy(xpath ="(//div[@class='oxd-form-actions']/button)[2]" )
    public WebElement save;


}
