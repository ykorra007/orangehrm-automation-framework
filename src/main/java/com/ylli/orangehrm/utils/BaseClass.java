 
package com.ylli.orangehrm.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void setUp() {

        ConfigsReader.readProperties("configs/configuration.properties");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public static void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
 
