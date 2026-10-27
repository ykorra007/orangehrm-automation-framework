package com.ylli.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ylli.orangehrm.utils.BaseClass;

public class DashboardPage {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElement dashboardText;

    public DashboardPage() {

        PageFactory.initElements(
                BaseClass.driver,
                this);
    }
    @FindBy(className = "oxd-userdropdown-tab")
    public WebElement profileIcon;

    @FindBy(linkText = "Logout")
    public WebElement logoutBtn;
}