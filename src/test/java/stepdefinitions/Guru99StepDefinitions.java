package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;

public class Guru99StepDefinitions {

    Guru99Page guru99Page=new Guru99Page();
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        for(WebElement w:guru99Page.companyList){
            System.out.println(w.getText());
        }

    }

    @And("{string} listede oldugunu test eder")
    public void listedeOldugunuTestEder(String arg0) {

        int flag = 0;
        for (WebElement w : guru99Page.companyList) {
            if (w.getText().equals(arg0)) {
                flag = 1;
            }
        }

        Assert.assertTrue(flag==1);

    }
}
