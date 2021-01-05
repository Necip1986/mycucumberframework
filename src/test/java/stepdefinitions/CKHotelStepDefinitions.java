package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CKHotelPage;
import utilities.ConfigReader;

public class CKHotelStepDefinitions {

    CKHotelPage ckHotelPage=new CKHotelPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        ckHotelPage.loginLink.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        ckHotelPage.usernameTextBox.sendKeys(ConfigReader.getProperty("username"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        ckHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        ckHotelPage.loginButon.submit();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(ckHotelPage.hotelManagementMenu.isDisplayed());

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        ckHotelPage.usernameTextBox.sendKeys(ConfigReader.getProperty("gecersiz_username"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        ckHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("gecersiz_password"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(ckHotelPage.tryAgainText.isDisplayed());
    }

    @Given("kullanici {string} sn bekler")
    public void kullaniciSnBekler(String arg0) throws InterruptedException {
        int sn=Integer.parseInt(arg0);
        Thread.sleep(sn*1000);
    }

    @And("Username text Box'ina {string} girer")
    public void usernameTextBoxInaGirer(String arg0) {
        ckHotelPage.usernameTextBox.sendKeys(arg0);
    }

    @And("Password textBox'ina {string} girer")
    public void passwordTextBoxInaGirer(String arg0) {
        ckHotelPage.passwordTextBox.sendKeys(arg0);
    }

    @Then("kullanici login olmadigini dogrular")
    public void kullaniciLoginOlmadiginiDogrular() {
        Assert.assertTrue(ckHotelPage.tryAgainText.isDisplayed());

    }
}
