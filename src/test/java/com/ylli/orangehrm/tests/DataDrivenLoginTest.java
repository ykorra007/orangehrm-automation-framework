package com.ylli.orangehrm.tests;

import org.testng.annotations.Test;

import com.ylli.orangehrm.data.LoginData;
import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;

public class DataDrivenLoginTest extends CommonMethods {

    @Test(dataProvider = "loginData",
          dataProviderClass = LoginData.class)
    public void loginTest(
            String username,
            String password) {

        BaseClass.setUp();

        LoginPage loginPage =
                new LoginPage();

        sendText(loginPage.username,
                username);

        sendText(loginPage.password,
                password);

        click(loginPage.loginBtn);

        wait(2);

        BaseClass.tearDown();
    }
}