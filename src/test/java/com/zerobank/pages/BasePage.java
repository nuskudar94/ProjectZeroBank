package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(css = ".nav.nav-tabs>li")
    public List<WebElement> tabs;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToTab(int tabNum){

        tabs.get(tabNum).click();


    }
}
