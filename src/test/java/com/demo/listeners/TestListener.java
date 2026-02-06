package com.demo.listeners;

import org.testng.*;
import com.demo.utils.*;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result) {
        ScreenshotUtil.capture(
                BaseTest.driver,
                result.getName()
        );
    }
}
