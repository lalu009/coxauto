package uk.co.coxauto.resources;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:34
 **/
@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".",
        plugin = {"pretty","html:target/cucumber-report"},
        dryRun = false,
        monochrome = true
)
public class TestRunner {


}


