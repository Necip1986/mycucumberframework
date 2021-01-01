package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CKHotelPage {

    public CKHotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginLink;

    @FindBy (id = "UserName")
    public WebElement usernameTextBox;

    @FindBy (id ="Password")
    public WebElement passwordTextBox;

    @FindBy (id = "btnSubmit")
    public WebElement loginButon;

    @FindBy (xpath = "//*[.='System Management']")
    public WebElement hotelManagementMenu;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement tryAgainText;

}
