package com.ylli.orangehrm.data;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][] {

            {"Admin","admin123"},
            {"Admin","wrong123"},
            {"WrongUser","admin123"}

        };
    }
}