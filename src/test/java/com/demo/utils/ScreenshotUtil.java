package com.demo.utils;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String capture(WebDriver driver, String name) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            String path = "screenshots/" + name + ".png";
            File dest = new File(path);

            FileUtils.copyFile(src, dest);
            return path;

        } catch(Exception e) {
            return null;
        }
    }
}
