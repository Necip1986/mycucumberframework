package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {


    @When("kullanici {string} ana sayfasina gider")
    public void kullanici_ana_sayfasina_gider(String string) {

       Driver.getDriver().get(ConfigReader.getProperty(string));
    }


    @Then("{string} de oldugunu test eder")
    public void de_oldugunu_test_eder(String string) {
        Assert.assertEquals(ConfigReader.getProperty(string),Driver.getDriver().getCurrentUrl());
    }

}
