package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    //method'lar otomatikman olustu
    //page objesini class seviyesinde olusturuyoruz. Her method icin olusturulmaz
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon ana sayfasina gider")
    public void kullanici_amazon_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
    }

    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("sonucun iphone icerdigini test eder")
    public void sonucun_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("iphone"));
    }
    @Given("teapot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("teapot"+ Keys.ENTER);
    }
    @Then("sonucun teapot icerdigini test eder")
    public void sonucun_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("teapot"));
    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower"+ Keys.ENTER);
    }
    @Then("sonucun flower icerdigini test eder")
    public void sonucun_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("flower"));
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime+Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucun_icerdigini_test_eder(String arananKelime) {
       Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(arananKelime));
    }



}
