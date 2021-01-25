package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomatinPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPracticeStepDefinitions{

    AutomatinPracticePage automatinPracticePage=new AutomatinPracticePage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automatinPracticePage.loginLink.click();
    }

    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
        automatinPracticePage.emailTextBox1.sendKeys(ConfigReader.getProperty("email"));
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automatinPracticePage.createAccountButon.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        automatinPracticePage.firstNameTextBox.sendKeys(ConfigReader.getProperty("firstname"));
        automatinPracticePage.lastNametextBox.sendKeys(ConfigReader.getProperty("lastname"));
        automatinPracticePage.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
        Select select1=new Select(automatinPracticePage.dayDropDown);
        select1.selectByValue("12");
        Select select2=new Select(automatinPracticePage.monthDropDown);
        select2.selectByValue("7");
        Select select3=new Select(automatinPracticePage.yearDropDown);
        select3.selectByValue("2000");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        automatinPracticePage.companyName.sendKeys(ConfigReader.getProperty("company"));
        automatinPracticePage.adressTextBox1.sendKeys(ConfigReader.getProperty("adress"));
        automatinPracticePage.adressTextBox2.sendKeys(ConfigReader.getProperty("adress"));
        automatinPracticePage.cityNameTextBox.sendKeys(ConfigReader.getProperty("city"));
        Select select4=new Select(automatinPracticePage.stateDropDown);
        select4.selectByValue("2");
        automatinPracticePage.postCodeTextBox.sendKeys(ConfigReader.getProperty("postcode"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select5=new Select(automatinPracticePage.countryDropDown);
        automatinPracticePage.additionaInfTextBox.sendKeys(ConfigReader.getProperty("additional"));
        automatinPracticePage.phoneTextBox.sendKeys(ConfigReader.getProperty("phone"));
        automatinPracticePage.mobileTextBox.sendKeys(ConfigReader.getProperty("mobile"));
        automatinPracticePage.assignAdress.clear();
        automatinPracticePage.assignAdress.sendKeys(ConfigReader.getProperty("ref"));

    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automatinPracticePage.registerButon.click();

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automatinPracticePage.signOutLink.isEnabled());

    }

    @Given("email kutusuna gecersiz email yazar ve enter'a basar")
    public void email_kutusuna_gecersiz_email_yazar_ve_enter_a_basar() {
        automatinPracticePage.emailTextBox1.sendKeys(ConfigReader.getProperty("email"));

    }
    @Given("hata mesajini dorular")
    public void hata_mesajini_dorular() {
        Assert.assertTrue(automatinPracticePage.hataYazisi.isDisplayed());
    }



}
