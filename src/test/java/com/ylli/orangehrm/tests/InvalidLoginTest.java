package com.ylli.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;

public class InvalidLoginTest extends CommonMethods {

    @Test
    public void invalidLoginTest() {

        BaseClass.setUp();
         
        LoginPage loginPage = new LoginPage();
        wait(1);
        sendText(loginPage.username, "Admin");
        wait(1);
        sendText(loginPage.password, "WrongPassword");
        wait(1);

        click(loginPage.loginBtn);
        wait(1);
        Assert.assertTrue(
                loginPage.errorMessage.isDisplayed());
        wait(1);
        BaseClass.tearDown();
    }
}
