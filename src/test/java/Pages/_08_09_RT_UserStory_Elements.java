package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _08_09_RT_UserStory_Elements extends Parent {

   public _08_09_RT_UserStory_Elements(){


       PageFactory.initElements(BaseDriver.getDriver(),this);

   }
    @FindBy(xpath = "(//span[text()='Already exists'])") //ROMAN
    public WebElement alredyExists;


}
