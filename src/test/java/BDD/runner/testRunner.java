package BDD.runner;

import TestBase.testBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/BDD/features/userLogin.feature",
        glue = {"BDD/steps"},
        plugin = {"pretty","html:target/cucumber-html-report"},
        publish = true)
public class testRunner extends testBase
{

}
