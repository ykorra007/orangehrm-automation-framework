package com.ylli.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ylli.orangehrm.pages.DashboardPage;
import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;
import com.ylli.orangehrm.utils.ConfigsReader;

public class LogoutTest extends CommonMethods {

    @Test
    public void logoutTest() {

        BaseClass.setUp();

        LoginPage loginPage = new LoginPage();

        sendText(loginPage.username,
                ConfigsReader.getProperty("username"));

        sendText(loginPage.password,
                ConfigsReader.getProperty("password"));

        click(loginPage.loginBtn);

        DashboardPage dashboard =
                new DashboardPage();

        click(dashboard.profileIcon);

        wait(1);

        click(dashboard.logoutBtn);

        Assert.assertTrue(
                loginPage.loginBtn.isDisplayed());

        BaseClass.tearDown();
    }
}