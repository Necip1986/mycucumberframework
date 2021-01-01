package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.Driver;

public class DataTableStepDefinitions {

    DataTablePage dataTablePage=new DataTablePage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
       dataTablePage.newButon.click();
    }

    @Then("first name girer {string}")
    public void first_name_girer(String string) {
       dataTablePage.firsNameTextBox.sendKeys(string);
    }
    @Then("Last name girer {string}")
    public void last_name_girer(String string) {
        dataTablePage.lastNameTextBox.sendKeys(string);

    }
    @Then("Postion girer {string}")
    public void postion_girer(String string) {
        dataTablePage.positionTextBox.sendKeys(string);

    }
    @Then("Office girer   {string}")
    public void office_girer(String string) {
        dataTablePage.officeTextBox.sendKeys(string);

    }
    @Then("Extention girer {string}")
    public void extention_girer(String string) {
        dataTablePage.extensionTextBox.sendKeys(string);

    }
    @Then("Start date girer {string}")
    public void start_date_girer(String string) {
        dataTablePage.startDateTextBox.sendKeys(string);

    }
    @Then("Salary girer     {string}")
    public void salary_girer(String string) {
        dataTablePage.salaryTextBox.sendKeys(string);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablePage.createButon.click();

    }


    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String arg0) {
        dataTablePage.searchBox.sendKeys(arg0);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String arg0) {
        Assert.assertTrue(dataTablePage.ilkkutu.getText().contains(arg0));
    }
}
