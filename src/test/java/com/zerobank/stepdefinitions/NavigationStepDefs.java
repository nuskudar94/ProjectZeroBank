package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class NavigationStepDefs {
    AccountSummaryPage summaryPage = new AccountSummaryPage();
    AccountActivity activityPage = new AccountActivity();



    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        //Getting my browser
        Driver.get().get(url);
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        BrowserUtils.waitFor(2);
        new LoginPage().toSign.click();
        new LoginPage().login(username, password);

    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {

        summaryPage.savingsBtn.click();

    }

    /*@Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
            String actualTitle = Driver.get().getTitle();
            Assert.assertEquals("Zero - Account Activity",actualTitle);
    }*/

   /* @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {

        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
         Assert.assertEquals("Savings", actualOption);
    }*/

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {

        summaryPage.brokerageBtn.click();
    }

   /* @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals("Brokerage", actualOption);
    }*/

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
       summaryPage.Checking.click();
    }

   /* @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals("Checking", actualOption);
    }
*/
    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {

        summaryPage.creditCard.click();
    }

   /* @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals("Credit Card", actualOption);
    }*/

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        summaryPage.Loan.click();
    }

   /* @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals("Loan", actualOption);
    }*/

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expectedPage) {
        String actualPage = Driver.get().getTitle();
        Assert.assertEquals(expectedPage,actualPage.contains(expectedPage));
        //Assert.assertTrue(Driver.get().getTitle().contains(expectedPage));
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedOption) {
        String actualOption = new Select(activityPage.dropDownElement).getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
    }

}
