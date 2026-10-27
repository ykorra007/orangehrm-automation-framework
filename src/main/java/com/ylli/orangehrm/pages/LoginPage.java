package com.ylli.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;

public class LoginPage  {
     @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement loginBtn;
    
    @FindBy(xpath = "//p[contains(@class,'oxd-alert-content-text')]")
    public WebElement errorMessage;
    
    public LoginPage() {

        PageFactory.initElements(
                BaseClass.driver,
                this);
    }
}