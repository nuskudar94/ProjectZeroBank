package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id ="account_summary_tab" )
    public WebElement summaryBtn;

    @FindBy(css = ".nav.nav-tabs>li")
    public List<WebElement> tabs;

    @FindBy(xpath = "//a[text()='Savings']")
    public WebElement savingsBtn;

    @FindBy(xpath = "//a[text()='Brokerage']")
    public WebElement brokerageBtn;

    @FindBy(xpath = "//a[text()='Checking']")
    public WebElement Checking;

    @FindBy(xpath = "//a[text()='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//a[text()='Loan']")
    public WebElement Loan;





}
