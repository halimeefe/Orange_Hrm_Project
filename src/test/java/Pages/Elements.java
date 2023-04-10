package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{


    public Elements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input[name='username']")// Admin
    public WebElement nameInput;

    @FindBy(css = "[name='password']") //admin123
    public WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[text()='Dashboard'])[2]")
    public WebElement verifyLogin;

    @FindBy(css = "a[href='/web/index.php/admin/viewAdminModule']")
    public WebElement adminLink;

    @FindBy(css = "[class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement addButton;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]/div/div[2]")
    public WebElement selectUserRole;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]/div/div[1]")
    public WebElement selectEss;

    @FindBy(xpath = "(//*[@class='oxd-select-text--after'])[2]")
    public WebElement selectStatus;

    @FindBy(xpath = "//*[text()='Enabled']")
    public WebElement selectEnabled;

    @FindBy(css = "div[class='oxd-autocomplete-wrapper']")
    public WebElement emplNameInput;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement essUserInput;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement essPasswordInput;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement essConfirmPswrd;

    @FindBy(css = "[type='submit']")
    public WebElement SaveButton;

    @FindBy(xpath = "(//nav[@role='navigation'])[2]//span[1]")
    public WebElement userManagement;

    @FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]//span")
    public WebElement message1;

    @FindBy(css = "[class$='-error-message oxd-input-group__message']")
    public WebElement message2;



}
