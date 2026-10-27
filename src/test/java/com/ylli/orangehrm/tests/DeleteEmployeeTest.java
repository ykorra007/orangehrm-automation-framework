package com.ylli.orangehrm.tests;

import org.testng.annotations.Test;

import com.ylli.orangehrm.pages.LoginPage;
import com.ylli.orangehrm.pages.PIMPage;
import com.ylli.orangehrm.utils.BaseClass;
import com.ylli.orangehrm.utils.CommonMethods;
import com.ylli.orangehrm.utils.ConfigsReader;

public class DeleteEmployeeTest extends CommonMethods {

    @Test
    public void deleteEmployeeTest() {

        BaseClass.setUp();

        LoginPage loginPage = new LoginPage();

        sendText(loginPage.username,
                ConfigsReader.getProperty("username"));

        sendText(loginPage.password,
                ConfigsReader.getProperty("password"));

        click(loginPage.loginBtn);

        PIMPage pim = new PIMPage();

        wait(1);

        click(pim.pimMenu);

        wait(1);

        click(pim.searchBtn);

        wait(2);

        click(pim.deleteBtn);

        wait(1);

        click(pim.confirmDeleteBtn);

        wait(2);

        BaseClass.tearDown();
    }
}