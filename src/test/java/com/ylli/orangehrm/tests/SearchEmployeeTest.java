package com.ylli.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.pages.PIMPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;
import com.ylli.orangehrm.utils.ConfigsReader;

public class SearchEmployeeTest extends CommonMethods {

    @Test
    public void searchEmployeeTest() {

        BaseClass.setUp();

        LoginPage loginPage =
                new LoginPage();

        sendText(
                loginPage.username,
                ConfigsReader.getProperty("username"));

        sendText(
                loginPage.password,
                ConfigsReader.getProperty("password"));

        click(loginPage.loginBtn);

        PIMPage pim =
                new PIMPage();

        wait(1);

        click(pim.pimMenu);

        wait(1);

        sendText(
                pim.employeeName,
                "Ylli");

        wait(1);

        click(pim.searchBtn);

        wait(2);

        Assert.assertTrue(
                pim.searchResult.isDisplayed());

        BaseClass.tearDown();
    }
}