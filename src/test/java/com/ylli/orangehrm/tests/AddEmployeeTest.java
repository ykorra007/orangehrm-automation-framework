package com.ylli.orangehrm.tests;

import org.testng.annotations.Test;

import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.pages.PIMPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;
import com.ylli.orangehrm.utils.ConfigsReader;
import com.ylli.orangehrm.utils.ScreenshotUtils;

public class AddEmployeeTest extends CommonMethods {

    @Test
    public void addEmployeeTest() {

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

        click(pim.addEmployeeBtn);

        wait(1);

        sendText(
                pim.firstName,
                "Ylli");

        sendText(
                pim.middleName,
                "QA");

        sendText(
                pim.lastName,
                "Korra");

        wait(1);

        click(pim.saveBtn);

        

         
         

        wait(2);

        ScreenshotUtils.takeScreenshot(
                "EmployeeAdded");

        BaseClass.tearDown();
    }
}