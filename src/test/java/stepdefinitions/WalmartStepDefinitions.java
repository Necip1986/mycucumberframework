package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WalmartStepDefinitions {

    WalmartPage walmartPage=new WalmartPage();

    @Given("kullanici walmart ana sayfasina gider")
    public void kullaniciWalmartAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart"));
    }

    @And("walmart sayfasinda {string} icin arama yapar")
    public void walmartSayfasindaIcinAramaYapar(String arg0) {
        walmartPage.searchBox.sendKeys(arg0+ Keys.ENTER);
    }

    @Then("walmart'ta bulunan sonucun {string} icerdigini test eder")
    public void walmartTaBulunanSonucunIcerdiginiTestEder(String arg0) {
        Assert.assertTrue(walmartPage.arananKelime.getText().contains(arg0));
    }


    public static class DataTableStepDefinition {
        @When("kullanici {string} anasayfaya gider")
        public void kullaniciAnasayfayaGider(String arg0) {
        }
    }
}
