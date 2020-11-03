package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage (){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css= ".signin.btn.btn-info")
    public WebElement toSign;

    @FindBy(id = "user_login")
    public WebElement userName;

    @FindBy(id = "user_password")
    public WebElement passWord;

    @FindBy(name = "submit")
    public WebElement signInBtn;

    @FindBy(xpath = "//div[@class=\"alert alert-error\"]")
    public WebElement errorMsg;


    public void login(String username, String password){


        userName.sendKeys(username);
        passWord.sendKeys(password);
        signInBtn.click();

    }
}
