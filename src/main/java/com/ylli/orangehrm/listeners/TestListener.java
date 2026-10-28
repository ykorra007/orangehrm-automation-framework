package com.ylli.orangehrm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ylli.orangehrm.utils.ExtentManager;
import com.ylli.orangehrm.utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getInstance();

    ExtentTest test;

    @Override
    public void onTestStart(
            ITestResult result) {

        test = extent.createTest(
                result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        ScreenshotUtils.takeScreenshot(
                result.getName());

        test.fail("Test Failed");
    }

    @Override
    public void onFinish(
            ITestContext context) {

        extent.flush();
    }
}