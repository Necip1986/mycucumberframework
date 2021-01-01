package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before //her senaryodan once calisir. JUnit'deki before ve TestNG'deki beforeMethod gibi calisir.
    public void setUp(){

    }

    @After //her senaryodan sonra calisir. JUnit'deki after ve TestNG'deki afterMethod gibi calisir.
    public void tearDown(Scenario scenario){

        //screenshot almak icin yapilacaklar
        //test fail olursa screenshot alcak
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }

    //stepdefinition altinda before ve after varsa onlar calisir.
}
