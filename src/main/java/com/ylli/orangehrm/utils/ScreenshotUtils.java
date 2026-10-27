package com.ylli.orangehrm.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static void takeScreenshot(String fileName) {

        File src = ((TakesScreenshot) BaseClass.driver)
                .getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(
                    src,
                    new File("screenshots/" + fileName + ".png"));

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}