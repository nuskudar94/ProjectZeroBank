package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("the user is on homepage")
    public void user_is_on_homepage() {
        String url = ConfigurationReader.get("url");

        //Getting my browser
        Driver.get().get(url);

    }

    @When("the user navigates to Login Page")
    public void user_navigates_to() {
        //user navigates to login page
        loginPage.toSign.click();

    }


    @When("the user enter {string} and {string}")
    public void users_enter_and(String username, String password) {
        username = ConfigurationReader.get("username");
        password = ConfigurationReader.get("password");


            loginPage.login(username, password);
        //BrowserUtils.waitForVisibility(loginPage.errorMsg,3);
            //Assert.assertTrue(loginPage.errorMsg.isDisplayed());
    }

    @Then("the user should be able to login")
    public void user_should_be_able_to_login() {


        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);


        System.out.println("logged in");
    }
}
