package com.ylli.orangehrm.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

    public static void sendText(
            WebElement element,
            String text) {

        element.clear();
        element.sendKeys(text);
    }

    public static void click(
            WebElement element) {

        element.click();
    }
    public void wait(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    

    }
}