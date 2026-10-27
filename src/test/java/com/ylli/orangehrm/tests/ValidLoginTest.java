package com.ylli.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ylli.orangehrm.listeners.TestListener;
import com.ylli.orangehrm.pages.DashboardPage;
import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;
import com.ylli.orangehrm.utils.ConfigsReader;
import com.ylli.orangehrm.utils.ScreenshotUtils;
@Listeners(TestListener.class)
public class ValidLoginTest extends CommonMethods {

    @Test
    public void validLoginTest() {

        BaseClass.setUp();
        wait(1);
        LoginPage loginPage =
                new LoginPage();

        sendText(
                loginPage.username,
                ConfigsReader.getProperty("username"));
        wait(1);
        sendText(
                loginPage.password,
                ConfigsReader.getProperty("password"));
        wait(1);
        click(loginPage.loginBtn);

        DashboardPage dashboard =
                new DashboardPage();

        wait(1);

        Assert.assertTrue(false);

        ScreenshotUtils.takeScreenshot(
                "SuccessfulLogin");
        
        BaseClass.tearDown();
    }
}