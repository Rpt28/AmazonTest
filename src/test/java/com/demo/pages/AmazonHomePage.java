package com.demo.pages;

import org.openqa.selenium.*;
import com.demo.utils.Log;

public class AmazonHomePage {

    WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("twotabsearchtextbox");

    public void search(String product) {
        Log.info("Searching product: " + product);
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(product + Keys.ENTER);
    }
}
