package BDD.steps;

import Challenge1Main.pages.loginPage;
import TestBase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class userLoginSteps extends testBase {

    loginPage page;

    @Given("the user in the login page")
    public void the_user_in_the_login_page() {
        page = new loginPage(driver);
        //Assert.assertTrue(page.assertion().isDisplayed());
    }

    @When("I entered the user data and click on login button")
    public void i_entered_the_user_data() {
        page.login("Admin", "admin123");
    }

    @Then("The login page displayed successfully")
    public void the_login_page_displayed_successfully() {
        //  Assert.assertTrue(page.assertion1().isDisplayed());
    }
}
