package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AutomatinPracticePage {

    public AutomatinPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='login']")
    public WebElement loginLink;

    @FindBy (xpath = "//input[@id='email_create']")
    public WebElement emailTextBox1;

    @FindBy (xpath = "//i[@class='icon-user left']")
    public WebElement createAccountButon;

    @FindBy (id = "id_gender1")
    public WebElement titleRadyoButon;

    @FindBy (id = "customer_firstname")
    public WebElement firstNameTextBox;

    @FindBy (id = "customer_lastname")
    public WebElement lastNametextBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement getEmailTextBox2;

    @FindBy (id = "passwd")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//select[@id='days']")
    public WebElement dayDropDown;

    @FindBy (xpath = "//select[@id='months']")
    public WebElement monthDropDown;

    @FindBy (xpath = "//select[@id='years']")
    public WebElement yearDropDown;

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement adresName;

    @FindBy (id = "lastname")
    public WebElement adresLastname;

    @FindBy (id = "company")
    public WebElement companyName;

    @FindBy (id = "address1")
    public WebElement adressTextBox1;

    @FindBy (id = "address2")
    public WebElement adressTextBox2;

    @FindBy (id = "city")
    public WebElement cityNameTextBox;

    @FindBy (id = "id_state")
    public WebElement stateDropDown;

    @FindBy (id = "postcode")
    public WebElement postCodeTextBox;

    @FindBy (xpath = "//select[@id='id_country']")
    public WebElement countryDropDown;

    @FindBy (id = "other")
    public WebElement additionaInfTextBox;

    @FindBy (xpath = "//input[@id='phone']")
    public WebElement phoneTextBox;

    @FindBy (id = "phone_mobile")
    public WebElement mobileTextBox;

    @FindBy (id = "alias")
    public WebElement assignAdress;

    @FindBy (xpath = "//*[.='Register']")
    public WebElement registerButon;

    @FindBy (xpath = "//a[@title='Log me out']")
    public WebElement signOutLink;

    @FindBy(xpath = "(//*[.='Invalid email address.'])[1]")
    public WebElement hataYazisi;







}
