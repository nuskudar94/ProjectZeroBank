package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends BasePage {

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement dropDownElement;

    @FindBy(xpath = "//a[text()='Show Transactions']")
    public WebElement showTransaction;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findTransaction;

}
