package com.ylli.orangehrm.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ylli.orangehrm.utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtils.takeScreenshot(
                result.getName());
    }
}